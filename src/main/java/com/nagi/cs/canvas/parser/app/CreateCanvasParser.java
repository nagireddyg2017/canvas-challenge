package com.nagi.cs.canvas.parser.app;

import com.nagi.cs.canvas.actions.CreateCanvas;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.dto.Vector;
import com.nagi.cs.canvas.parser.AbstractIntParametrizedActionParser;

public class CreateCanvasParser extends AbstractIntParametrizedActionParser {
    public CreateCanvasParser() {
        super("C", 2);
    }

    @Override
    protected Action parseCommand(String command, int[] params) {
        return new CreateCanvas(new Vector(params[0], params[1]));
    }
}