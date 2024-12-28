package _99_extra.pin_the_tail;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 807;
    static final int HEIGHT = 595;
    PImage donkey;
    PImage tail;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	donkey = loadImage("donkey.png"); 
    	
    	tail = loadImage("tail.png");
    	tail.resize(110, 90); 
    	
    }

    @Override
    public void draw() {
    	
    	
    	
    	if (dist(0, 0, mouseX, mouseY) < 30) {
    		background (donkey);
    	}else {
    		background(255,255,255);
    	} 
    	if (mousePressed) {
    	image(tail, mouseX, mouseY);
    	}
    	rect(0, 0, 30, 30);
    	rect(650, 100, 40, 40);
    }

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
