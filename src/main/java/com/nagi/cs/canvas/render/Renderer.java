package com.nagi.cs.canvas.render;

import com.nagi.cs.canvas.draw.Drawer;

public interface Renderer {

    void print(String desc);

    void println(String desc);

    void close();

    void render(Drawer drawer);
}
