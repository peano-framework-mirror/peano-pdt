/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.tum.peano.pdt.node;

import de.tum.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenComponent extends Token
{
    public TTokenComponent()
    {
        super.setText("component:");
    }

    public TTokenComponent(int line, int pos)
    {
        super.setText("component:");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenComponent(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenComponent(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenComponent text.");
    }
}