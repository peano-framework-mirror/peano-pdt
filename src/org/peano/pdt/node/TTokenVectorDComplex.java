/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenVectorDComplex extends Token
{
    public TTokenVectorDComplex()
    {
        super.setText("vector(complex):");
    }

    public TTokenVectorDComplex(int line, int pos)
    {
        super.setText("vector(complex):");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenVectorDComplex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenVectorDComplex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenVectorDComplex text.");
    }
}