/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.tum.peano.pdt.node;

import java.util.*;
import de.tum.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class ADescription extends PDescription
{
    private TIdentifier _name_;
    private TNamespace _namespace_;
    private PVertex _vertex_;
    private PCell _cell_;
    private PState _state_;
    private final LinkedList<PEventMapping> _eventMapping_ = new LinkedList<PEventMapping>();
    private final LinkedList<PAdapter> _adapter_ = new LinkedList<PAdapter>();

    public ADescription()
    {
        // Constructor
    }

    public ADescription(
        @SuppressWarnings("hiding") TIdentifier _name_,
        @SuppressWarnings("hiding") TNamespace _namespace_,
        @SuppressWarnings("hiding") PVertex _vertex_,
        @SuppressWarnings("hiding") PCell _cell_,
        @SuppressWarnings("hiding") PState _state_,
        @SuppressWarnings("hiding") List<PEventMapping> _eventMapping_,
        @SuppressWarnings("hiding") List<PAdapter> _adapter_)
    {
        // Constructor
        setName(_name_);

        setNamespace(_namespace_);

        setVertex(_vertex_);

        setCell(_cell_);

        setState(_state_);

        setEventMapping(_eventMapping_);

        setAdapter(_adapter_);

    }

    @Override
    public Object clone()
    {
        return new ADescription(
            cloneNode(this._name_),
            cloneNode(this._namespace_),
            cloneNode(this._vertex_),
            cloneNode(this._cell_),
            cloneNode(this._state_),
            cloneList(this._eventMapping_),
            cloneList(this._adapter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADescription(this);
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

    public TNamespace getNamespace()
    {
        return this._namespace_;
    }

    public void setNamespace(TNamespace node)
    {
        if(this._namespace_ != null)
        {
            this._namespace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._namespace_ = node;
    }

    public PVertex getVertex()
    {
        return this._vertex_;
    }

    public void setVertex(PVertex node)
    {
        if(this._vertex_ != null)
        {
            this._vertex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vertex_ = node;
    }

    public PCell getCell()
    {
        return this._cell_;
    }

    public void setCell(PCell node)
    {
        if(this._cell_ != null)
        {
            this._cell_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cell_ = node;
    }

    public PState getState()
    {
        return this._state_;
    }

    public void setState(PState node)
    {
        if(this._state_ != null)
        {
            this._state_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._state_ = node;
    }

    public LinkedList<PEventMapping> getEventMapping()
    {
        return this._eventMapping_;
    }

    public void setEventMapping(List<PEventMapping> list)
    {
        this._eventMapping_.clear();
        this._eventMapping_.addAll(list);
        for(PEventMapping e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PAdapter> getAdapter()
    {
        return this._adapter_;
    }

    public void setAdapter(List<PAdapter> list)
    {
        this._adapter_.clear();
        this._adapter_.addAll(list);
        for(PAdapter e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._namespace_)
            + toString(this._vertex_)
            + toString(this._cell_)
            + toString(this._state_)
            + toString(this._eventMapping_)
            + toString(this._adapter_);
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

        if(this._namespace_ == child)
        {
            this._namespace_ = null;
            return;
        }

        if(this._vertex_ == child)
        {
            this._vertex_ = null;
            return;
        }

        if(this._cell_ == child)
        {
            this._cell_ = null;
            return;
        }

        if(this._state_ == child)
        {
            this._state_ = null;
            return;
        }

        if(this._eventMapping_.remove(child))
        {
            return;
        }

        if(this._adapter_.remove(child))
        {
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

        if(this._namespace_ == oldChild)
        {
            setNamespace((TNamespace) newChild);
            return;
        }

        if(this._vertex_ == oldChild)
        {
            setVertex((PVertex) newChild);
            return;
        }

        if(this._cell_ == oldChild)
        {
            setCell((PCell) newChild);
            return;
        }

        if(this._state_ == oldChild)
        {
            setState((PState) newChild);
            return;
        }

        for(ListIterator<PEventMapping> i = this._eventMapping_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PEventMapping) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PAdapter> i = this._adapter_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdapter) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}