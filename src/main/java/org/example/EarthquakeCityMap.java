package org.example;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;


public class EarthquakeCityMap extends PApplet {

    private UnfoldingMap map;

    public void settings() {
        size(800, 600);
    }

    public void setUp() {
        map = new UnfoldingMap(this, 50, 50, 700, 500,
                new Google.GoogleMapProvider());
        MapUtils.createDefaultEventDispatcher(this, map);
        map.setZoomRange(2, 4);
    }

    public void draw() {
        map.draw();
    }

    @Override
    public void keyPressed() {
        if (key == 'w') {
            background(255, 255, 255);
        }
    }

    @Override
    public void mouseReleased() {
        if (mouseX > 100 && mouseX < 125
                && mouseY > 100 && mouseY < 125) {
            background(255, 255, 255);
        } else if (mouseX > 100 && mouseX < 125
                && mouseY > 150 && mouseY < 175) {
            background(100, 100, 100);
        }
    }

    public static void main(String[] args) {
        String[] processingArgs = {"EarthquakeCityMap"};
        EarthquakeCityMap earthquake = new EarthquakeCityMap();
        PApplet.runSketch(processingArgs, earthquake);
    }

}
