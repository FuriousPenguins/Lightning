int startY = 0;
int startX = 150;
int endY = 0;
int endX = 150;
boolean fadeOut = false;

void setup()
{
	strokeWeight(2);
  size(300,300);
  frameRate(5);
  background(255,255,255);
}
void draw()
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
void mousePressed()
{
	fadeOut = !fadeOut;
	background(255);
}

