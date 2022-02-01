package com.nagi.cs.canvas.parser.draw;

import org.junit.Assert;
import org.junit.Test;

import com.nagi.cs.canvas.actions.ErrorAction;
import com.nagi.cs.canvas.draw.actions.Fill;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.dto.Vector;
import com.nagi.cs.canvas.parser.draw.FillParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FillParserTest {

    @Test
    public void shouldParseFill() {
        Action action = new FillParser().parse("B 1 2 c");
        Assert.assertEquals(new Fill(new Vector(0, 1), 'c'), action);
    }

    @Test
    public void shouldNotParseFillIfNotFill() {
        Action action = new FillParser().parse("A 1 2 c");
        assertNull(action);

    }

    @Test
    public void shouldParseFillWithErrorIfNoColorSet() {
        Action action = new FillParser().parse("B 1 2");
        Assert.assertEquals(new ErrorAction("Expected 3 params for command B but got 2"), action);

    }

    @Test
    public void shouldParseFillWithErrorIfColorWrong() {
        Action action = new FillParser().parse("B 1 2 color");
        assertEquals(new ErrorAction("Color should be 1 char"), action);

    }

    @Test
    public void shouldParseFillWithErrorIfParamWrong() {
        Action action = new FillParser().parse("B one two c");
        assertEquals(new ErrorAction("Cannot parse int value: For input string: \"one\""), action);
    }

    @Test
    public void shouldParseFillWithErrorIfNotEnoughParams() {
        Action action = new FillParser().parse("B 1");
        assertEquals(new ErrorAction("Expected 3 params for command B but got 1"), action);
    }

    @Test
    public void shouldNotParseEmpty() {
        assertNull(new FillParser().parse(""));

    }

    @Test
    public void shouldNotParseNull() {
        assertNull(new FillParser().parse(null));
    }


}