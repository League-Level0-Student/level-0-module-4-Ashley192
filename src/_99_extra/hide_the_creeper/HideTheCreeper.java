package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	int x = 71;
	int y = 34;
	PImage creeper;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		PImage minecraft = loadImage("minecraft.png");
		minecraft.resize(WIDTH, HEIGHT);
		background(minecraft);
		creeper = loadImage("creeper.png");
		creeper.resize(50, 50);
		if (mousePressed) {
			System.out.println(mouseX + "  " + mouseY);
		}
	}

	boolean isNear(int x, int y) {
		if (abs(x - y) < 20) {
			return true;
		}
		else
			return false;
	}

	@Override
	public void draw() {
		image(creeper, x, y);
		if (mousePressed) {
			if (isNear(x+25,mouseX) && isNear(y, mouseY)){
				fill(0,255,0);
			
			}
			else {
				fill(255, 0, 0);
			}			
			ellipse(mouseX, mouseY, 10, 10);

		}
	}

	static public void main(String[] args) {
		PApplet.main(HideTheCreeper.class.getName());
	}
}
