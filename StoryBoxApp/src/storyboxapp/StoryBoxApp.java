package storyboxapp;

import processing.core.PApplet;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

/**
 * 
 * @author Michael Curry
 * @since 5/16/20
 *
 */
 
public class StoryBoxApp extends PApplet {
 
    // Run this project as Java application and this
    // method will launch the sketch
    public static void main(String[] args) {
    	PApplet.main("storyboxapp.StoryBoxApp");
    }
 
    // The rest is what you would expect in the sketch
 
        int x, y;
 
    public void settings(){
        size(100, 100);     
    }
 
    public void setup() {
        // Other setuo code here
    }
 
    public void mouseMoved(){
        x = mouseX;
        y = mouseY;
    }
 
    public void draw() {
        background(0);
        ellipse(mouseX, mouseY, 10, 10);
    }    
}

