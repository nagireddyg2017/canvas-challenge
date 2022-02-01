package com.nagi.cs.canvas.dto;

import com.nagi.cs.canvas.ActionsProcessor;

public interface Action {
    void execute(ActionsProcessor actionsProcessor);

    Type getType();

    enum Type {
        DRAW,
        APPLICATION
    }
}
