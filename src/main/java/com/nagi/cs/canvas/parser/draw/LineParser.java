package com.nagi.cs.canvas.parser.draw;

import com.nagi.cs.canvas.draw.actions.Line;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.dto.Vector;
import com.nagi.cs.canvas.parser.AbstractIntParametrizedActionParser;

public class LineParser extends AbstractIntParametrizedActionParser {

    private static final char color = 'x';

    public LineParser() {
        super("L", 4);
    }

    @Override
    protected Action parseCommand(String command, int[] params) {
        return new Line(new Vector(params[0], params[1]).shift(OFFSET), new Vector(params[2], params[3]).shift(OFFSET), color);
    }
}
