package com.nagi.cs.canvas.parser.app;

import org.junit.Test;

import com.nagi.cs.canvas.actions.ErrorAction;
import com.nagi.cs.canvas.actions.Quit;
import com.nagi.cs.canvas.dto.Action;
import com.nagi.cs.canvas.parser.app.QuitParser;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class QuitParserTest {

    @Test
    public void shouldParseQuit() {
        Action action = new QuitParser().parse("Q");
        assertTrue(Quit.class.isAssignableFrom(action.getClass()));
    }

    @Test
    public void shouldNotAllowParams() {
        Action action = new QuitParser().parse("Q q");
        assertTrue(ErrorAction.class.isAssignableFrom(action.getClass()));
    }

    @Test
    public void shouldNotParseNotQuit() {
        Action action = new QuitParser().parse("A");
        assertNull(action);
    }

    @Test
    public void shouldNotParseEmpty() {
        assertNull(new QuitParser().parse(""));

    }

    @Test
    public void shouldNotParseNull() {
        assertNull(new QuitParser().parse(null));
    }

}