package com.company;
import java.awt.*;
import java.Applet.*;

public class Line Canvas extends Canvas{
    LineCanvas(){
        resize(400,400);
    }
    public void paint (Graphics h){
        h.drawLine(20,40,50);
    }
}
public class LineCanvasApplet extends Applet{
    public void init(){
        add (new LineCanvas());
    }
}
