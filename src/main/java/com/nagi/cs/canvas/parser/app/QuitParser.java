package com.nagi.cs.canvas.parser.app;

import com.nagi.cs.canvas.actions.Quit;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.parser.AbstractParser;

public class QuitParser extends AbstractParser {
    public QuitParser() {
        super("Q", 0);
    }

    @Override
    protected Action parseCommand(String[] split) {
        return new Quit();
    }
}
