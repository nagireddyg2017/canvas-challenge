package com.nagi.cs.canvas.parser;

import com.nagi.cs.canvas.dto.Action;

public interface ActionParser {
    public static final String PARAMETER_SEPARATOR = " ";

    Action parse(String raw);
}
