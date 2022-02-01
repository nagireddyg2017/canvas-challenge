package com.nagi.cs.canvas.draw;

import com.nagi.cs.canvas.ActionsProcessor;
import com.nagi.cs.canvas.dto.Action;

public interface DrawAction extends Action {
    void validate(Canvas canvas);

    void apply(Canvas canvas);

    @Override
    default Type getType() {
        return Type.DRAW;
    }

    @Override
    default void execute(ActionsProcessor actionsProcessor) {
        actionsProcessor.getDrawer().addAction(this);
    }
}
