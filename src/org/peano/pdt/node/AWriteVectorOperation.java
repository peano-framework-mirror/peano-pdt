/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class AWriteVectorOperation extends POperation
{
    private TIdentifier _name_;

    public AWriteVectorOperation()
    {
        // Constructor
    }

    public AWriteVectorOperation(
        @SuppressWarnings("hiding") TIdentifier _name_)
    {
        // Constructor
        setName(_name_);

    }

    @Override
    public Object clone()
    {
        return new AWriteVectorOperation(
            cloneNode(this._name_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWriteVectorOperation(this);
    }

    public TIdentifier getName()
    {
        return this._name_;
    }

    public void setName(TIdentifier node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
