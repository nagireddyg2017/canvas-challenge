package com.nagi.cs.canvas.draw.actions;

import static com.nagi.cs.CommonTestUtils.createCanvas;

import org.junit.Assert;
import org.junit.Test;

import com.nagi.cs.canvas.draw.Canvas;
import com.nagi.cs.canvas.draw.actions.Rectangle;
import com.nagi.cs.canvas.dto.Vector;

public class RectangleTest {

    @Test
    public void shouldDrawRectangle() {
        Canvas c = new Canvas(10, 6);
        Rectangle rectangle = new Rectangle(new Vector(1, 2), new Vector(4, 5), 'X');
        rectangle.validate(c);
        rectangle.apply(c);


        Assert.assertEquals(createCanvas(
                "          ",
                "          ",
                " XXXX     ",
                " X  X     ",
                " X  X     ",
                " XXXX     "
                ).toString(),
                c.toString());
    }

}