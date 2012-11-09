/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class AState extends PState
{
    private TFilename _filename_;

    public AState()
    {
        // Constructor
    }

    public AState(
        @SuppressWarnings("hiding") TFilename _filename_)
    {
        // Constructor
        setFilename(_filename_);

    }

    @Override
    public Object clone()
    {
        return new AState(
            cloneNode(this._filename_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAState(this);
    }

    public TFilename getFilename()
    {
        return this._filename_;
    }

    public void setFilename(TFilename node)
    {
        if(this._filename_ != null)
        {
            this._filename_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._filename_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._filename_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._filename_ == child)
        {
            this._filename_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._filename_ == oldChild)
        {
            setFilename((TFilename) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
