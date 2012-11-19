/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.analysis;

import java.util.*;
import org.peano.pdt.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPDescription().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inADescription(ADescription node)
    {
        defaultIn(node);
    }

    public void outADescription(ADescription node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescription(ADescription node)
    {
        inADescription(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getNamespace() != null)
        {
            node.getNamespace().apply(this);
        }
        if(node.getVertex() != null)
        {
            node.getVertex().apply(this);
        }
        if(node.getCell() != null)
        {
            node.getCell().apply(this);
        }
        if(node.getState() != null)
        {
            node.getState().apply(this);
        }
        {
            List<PEventMapping> copy = new ArrayList<PEventMapping>(node.getEventMapping());
            for(PEventMapping e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PAdapter> copy = new ArrayList<PAdapter>(node.getAdapter());
            for(PAdapter e : copy)
            {
                e.apply(this);
            }
        }
        outADescription(node);
    }

    public void inARepository(ARepository node)
    {
        defaultIn(node);
    }

    public void outARepository(ARepository node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepository(ARepository node)
    {
        inARepository(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outARepository(node);
    }

    public void inAVertex(AVertex node)
    {
        defaultIn(node);
    }

    public void outAVertex(AVertex node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVertex(AVertex node)
    {
        inAVertex(node);
        if(node.getFilename() != null)
        {
            node.getFilename().apply(this);
        }
        {
            List<POperation> copy = new ArrayList<POperation>(node.getOperation());
            for(POperation e : copy)
            {
                e.apply(this);
            }
        }
        outAVertex(node);
    }

    public void inAReadScalarOperation(AReadScalarOperation node)
    {
        defaultIn(node);
    }

    public void outAReadScalarOperation(AReadScalarOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadScalarOperation(AReadScalarOperation node)
    {
        inAReadScalarOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAReadScalarOperation(node);
    }

    public void inAReadVectorOperation(AReadVectorOperation node)
    {
        defaultIn(node);
    }

    public void outAReadVectorOperation(AReadVectorOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadVectorOperation(AReadVectorOperation node)
    {
        inAReadVectorOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAReadVectorOperation(node);
    }

    public void inAReadVectorTwoPowDOperation(AReadVectorTwoPowDOperation node)
    {
        defaultIn(node);
    }

    public void outAReadVectorTwoPowDOperation(AReadVectorTwoPowDOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadVectorTwoPowDOperation(AReadVectorTwoPowDOperation node)
    {
        inAReadVectorTwoPowDOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAReadVectorTwoPowDOperation(node);
    }

    public void inAReadStencilOperation(AReadStencilOperation node)
    {
        defaultIn(node);
    }

    public void outAReadStencilOperation(AReadStencilOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadStencilOperation(AReadStencilOperation node)
    {
        inAReadStencilOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAReadStencilOperation(node);
    }

    public void inAWriteScalarOperation(AWriteScalarOperation node)
    {
        defaultIn(node);
    }

    public void outAWriteScalarOperation(AWriteScalarOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteScalarOperation(AWriteScalarOperation node)
    {
        inAWriteScalarOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAWriteScalarOperation(node);
    }

    public void inAWriteVectorOperation(AWriteVectorOperation node)
    {
        defaultIn(node);
    }

    public void outAWriteVectorOperation(AWriteVectorOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteVectorOperation(AWriteVectorOperation node)
    {
        inAWriteVectorOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAWriteVectorOperation(node);
    }

    public void inAWriteVectorTwoPowDOperation(AWriteVectorTwoPowDOperation node)
    {
        defaultIn(node);
    }

    public void outAWriteVectorTwoPowDOperation(AWriteVectorTwoPowDOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteVectorTwoPowDOperation(AWriteVectorTwoPowDOperation node)
    {
        inAWriteVectorTwoPowDOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAWriteVectorTwoPowDOperation(node);
    }

    public void inAWriteStencilOperation(AWriteStencilOperation node)
    {
        defaultIn(node);
    }

    public void outAWriteStencilOperation(AWriteStencilOperation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteStencilOperation(AWriteStencilOperation node)
    {
        inAWriteStencilOperation(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAWriteStencilOperation(node);
    }

    public void inACell(ACell node)
    {
        defaultIn(node);
    }

    public void outACell(ACell node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACell(ACell node)
    {
        inACell(node);
        if(node.getFilename() != null)
        {
            node.getFilename().apply(this);
        }
        outACell(node);
    }

    public void inAState(AState node)
    {
        defaultIn(node);
    }

    public void outAState(AState node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAState(AState node)
    {
        inAState(node);
        if(node.getFilename() != null)
        {
            node.getFilename().apply(this);
        }
        outAState(node);
    }

    public void inAEventMapping(AEventMapping node)
    {
        defaultIn(node);
    }

    public void outAEventMapping(AEventMapping node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEventMapping(AEventMapping node)
    {
        inAEventMapping(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAEventMapping(node);
    }

    public void inAAdapter(AAdapter node)
    {
        defaultIn(node);
    }

    public void outAAdapter(AAdapter node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdapter(AAdapter node)
    {
        inAAdapter(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<TIdentifier> copy = new ArrayList<TIdentifier>(node.getUserDefined());
            for(TIdentifier e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PPredefinedAdapter> copy = new ArrayList<PPredefinedAdapter>(node.getPredefinedAdapter());
            for(PPredefinedAdapter e : copy)
            {
                e.apply(this);
            }
        }
        outAAdapter(node);
    }

    public void inAPredefinedAdapter(APredefinedAdapter node)
    {
        defaultIn(node);
    }

    public void outAPredefinedAdapter(APredefinedAdapter node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPredefinedAdapter(APredefinedAdapter node)
    {
        inAPredefinedAdapter(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<TIdentifier> copy = new ArrayList<TIdentifier>(node.getParameters());
            for(TIdentifier e : copy)
            {
                e.apply(this);
            }
        }
        outAPredefinedAdapter(node);
    }
}
