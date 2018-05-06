import java.awt.Color;

import processing.core.PApplet;

public class Button {

	private float x, y, width, height;
	private String text;
	private Color edgeColor, fillColor, highlightFillColor, textColor;

	public Button(float x, float y, float width, float height, String text, Color edgeColor, Color fillColor,
			Color highlightFillColor, Color textColor) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.edgeColor = edgeColor;
		this.fillColor = fillColor;
		this.highlightFillColor = highlightFillColor;
		this.textColor = textColor;
	}

	public void draw(PApplet drawer, int mouseX, int mouseY) {
		drawer.rectMode(PApplet.CORNER);
		if(mouseOver(mouseX, mouseY)) {
			drawer.fill(highlightFillColor.getRGB());
		} else {
			drawer.fill(fillColor.getRGB());
		}
		drawer.stroke(edgeColor.getRGB());
		drawer.rect(x, y, width, height);
		drawer.stroke(textColor.getRGB());
		drawer.textFont(drawer.createFont("Georgia", 20));
		drawer.textSize(20);
		drawer.textAlign(PApplet.CENTER, PApplet.CENTER);
		drawer.text(text, x, y);
	}

	private boolean mouseOver(int mouseX, int mouseY) {
		if (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height) {
			return true;
		} else {
			return false;
		}
	}
}
