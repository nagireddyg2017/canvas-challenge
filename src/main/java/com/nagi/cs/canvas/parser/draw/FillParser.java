package com.nagi.cs.canvas.parser.draw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nagi.cs.canvas.actions.ErrorAction;
import com.nagi.cs.canvas.draw.actions.Fill;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.dto.Vector;
import com.nagi.cs.canvas.parser.AbstractParser;

import java.util.Arrays;

public class FillParser extends AbstractParser {
    private static final Logger log = LogManager.getLogger(FillParser.class);

    public FillParser() {
        super("B", 3);
    }

    @Override
    protected Action parseCommand(String[] split) {
        try {
            int[] params = Arrays.stream(split).skip(1).limit(2).mapToInt(Integer::valueOf).toArray();
            String color = split[split.length - 1];
            if (color.length() != 1) {
                return new ErrorAction("Color should be 1 char");
            }
            return new Fill(new Vector(params[0], params[1]).shift(OFFSET), color.charAt(0));
        } catch (NumberFormatException e) {
            log.error("Bad number format", e);
            return new ErrorAction("Cannot parse int value: " + e.getMessage());
        }
    }
}
