/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.tum.peano.pdt.node;

import de.tum.peano.pdt.analysis.*;

@SuppressWarnings("nls")
public final class TTokenConfigTag extends Token
{
    public TTokenConfigTag()
    {
        super.setText("configuration-tag:");
    }

    public TTokenConfigTag(int line, int pos)
    {
        super.setText("configuration-tag:");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTokenConfigTag(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTokenConfigTag(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTokenConfigTag text.");
    }
}
