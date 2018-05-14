package utilities;
import java.awt.Color;

import menus.Button;
import obstacles.Obstacle;
import processing.core.PApplet;

public class ClickableObstacle extends Button {
	private Obstacle obstacle;
	private float x,y,width,height;
	private String text;
	
	public ClickableObstacle(float x, float y, float width, float height, Obstacle obstacle, String text) {
		super(x,y,width,height,text, Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE);
		this.obstacle = obstacle;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
	}
	
	

}