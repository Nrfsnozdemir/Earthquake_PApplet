package org.example;

import processing.core.PApplet;
import processing.core.PImage;


public class MyPAapplet extends PApplet {
    PImage img;

    public void settings() {
        size(400, 400);
        img = loadImage("https://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
        img.resize(0, height);

    }

    public void setup() {
        stroke(0);



        background(255);


    }


    public void draw() {  

    }

    public static void main(String[] args) {
        String[] processingArgs = {"MyPAapplet"};
        MyPAapplet myPAapplet = new MyPAapplet();
        PApplet.runSketch(processingArgs, myPAapplet);
    }
}

