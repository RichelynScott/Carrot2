package org.carrot2.workbench.core.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.*;
import org.eclipse.ui.part.EditorPart;

public abstract class SashFormEditorPart extends EditorPart implements IPersistableEditor
{
    private SashForm form;
    private List<Integer> weights;
    private IMemento state;

    /**
     * Should not be called by subclasses. Call createControls().
     */
    @Override
    public void createPartControl(Composite parent)
    {
        form = new SashForm(parent, getSashFormOrientation());
        weights = new ArrayList<Integer>();
        createControls();
        if (state != null)
        {
            restoreWeightsFromState();
        }
        int [] intWeights = new int [weights.size()];
        for (int i = 0; i < intWeights.length; i++)
        {
            intWeights[i] = weights.get(i);
        }
        form.setWeights(intWeights);
    }

    private void restoreWeightsFromState()
    {
        int weightsAmount = state.getInteger("weights-amount");
        if (weightsAmount != weights.size())
        {
            return;
        }
        weights.clear();
        for (int i = 0; i < weightsAmount; i++)
        {
            weights.add(state.getInteger("w" + i));
        }
    }

    /**
     * @return parent that should be used for controls added with addControl()
     */
    protected Composite getContainer()
    {
        return form;
    }

    /**
     * Default value is SWT.HORIZONTAL.
     * 
     * @return orientation in which SashForm should be.
     * @see SWT#HORIZONTAL
     * @see SWT#VERTICAL
     */
    protected int getSashFormOrientation()
    {
        return SWT.HORIZONTAL;
    }

    /**
     * Creates controls to be put o SashForm. <b> Subclasses must implement this method!
     * </B>
     */
    protected abstract void createControls();

    /**
     * Adds new Control to SashForm with the given weight.
     * 
     * @param control
     * @param weight
     */
    protected void addControl(Control control, int weight)
    {
        if (!control.getParent().equals(form))
        {
            SWT.error(SWT.ERROR_INVALID_PARENT);
        }
        weights.add(weight);
    }

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException
    {
        setSite(site);
        setInput(input);
    }

    public void saveState(IMemento memento)
    {
        memento.putInteger("weights-amount", this.form.getWeights().length);
        for (int i = 0; i < this.form.getWeights().length; i++)
        {
            int weight = this.form.getWeights()[i];
            memento.putInteger("w" + i, weight);
        }
    }

    public void restoreState(IMemento memento)
    {
        state = memento;
    }
}
