/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.node;

import org.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenName extends Token
{
    public TTokenName()
    {
        super.setText("name:");
    }

    public TTokenName(int line, int pos)
    {
        super.setText("name:");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenName(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenName(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenName text.");
    }
}
