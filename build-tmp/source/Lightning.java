import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startY = 0;
int startX = 150;
int endY = 0;
int endX = 150;
boolean fadeOut = false;

public void setup()
{
	strokeWeight(2);
  size(300,300);
  frameRate(5);
  background(255,255,255);
}
public void draw()
{
	if (fadeOut == true) {
		fill(255,50);
		rect(-5,-5,310,310);
	}
	stroke(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	while (endY < 300) {
		endY = startY + ((int)(Math.random()*((Math.random()*11)+10)));
		endX = startX + ((int)(Math.random()*19) - 9);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
	startY = 0;
	startX = ((int)(Math.random()*300));
	endY = 0;
	endX = 150;
}
public void mousePressed()
{
	fadeOut = !fadeOut;
	background(255);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
