import java.awt.Color;

import processing.core.PApplet;

/**
 * 
 * @author Navaneet Kadaba
 * 
 * The StartMenu class is a specific type of Menu that
 * shows up before the user starts playing the game. It 
 * allows the user to pick his or her choice of game 
 * (single-player or multiplayer mode), as well as edit
 * certain game settings.
 *
 */
public class StartMenu extends Menu {

	public StartMenu() {
		super();
		doButtons();
	}
	
	private void doButtons() {
		this.addButton(new Button(350, 200, 150, 50, "Singleplayer", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 260, 150, 50, "Multiplayer", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 320, 150, 50, "Options", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 380, 150, 50, "Quit", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
	}

	@Override
	public void doButtonAction(String buttonText, GameScreen gameScreen) {
		if(buttonText.equals("Singleplayer")) {
			gameScreen.changeMenuMode("singleplayer");
		} else if(buttonText.equals("Multiplayer")) {
			gameScreen.changeMenuMode("localmultiplayer"); 
		}else if(buttonText.equals("Options")) {
			gameScreen.changeMenuMode("options");
		} else if(buttonText.equals("Quit")) {
			System.exit(0);
		}
	}
}
