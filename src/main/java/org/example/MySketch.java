package org.example;

import processing.core.PApplet;

public class MySketch extends PApplet {

    public void setup() {
        background(200, 200, 200);
    }

    public void settings() {
        size(400, 400);
    }

    @Override
    public void draw(){
        fill(255,255,0);
        ellipse(200, 200, 390, 390);
        fill(0,0,0);
        ellipse(120,130,50,70);
        ellipse(280, 130, 50, 70);
        size(400,400);
        arc(200, 280, 75, 75, 0, PI);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        MySketch earthQuake = new MySketch();
        PApplet.runSketch(processingArgs, earthQuake);
    }
}