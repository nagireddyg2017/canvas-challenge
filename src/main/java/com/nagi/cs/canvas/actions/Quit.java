package com.nagi.cs.canvas.actions;

import com.nagi.cs.canvas.ActionsProcessor;
import com.nagi.cs.canvas.dto.Action;

public class Quit implements Action {

    @Override
    public void execute(ActionsProcessor actionsProcessor) {
        actionsProcessor.quit();
    }

    @Override
    public Type getType() {
        return Type.APPLICATION;
    }
}
