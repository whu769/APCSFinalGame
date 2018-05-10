import java.awt.Color;
/**
 * 
 * @author Navaneet Kadaba
 * 
 * This class represents the menu that will be displayed when the character dies
 *
 */
public class DeathMenu extends Menu {
	
	public DeathMenu() {
		doButtons();
	}
	
	private void doButtons() {
		this.addButton(new Button(350, 200, 150, 50, "Restart", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 260, 150, 50, "Options", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 320, 150, 50, "Main Menu", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
		this.addButton(new Button(350, 380, 150, 50, "Quit", Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE));
	}

	@Override
	public void doButtonAction(String buttonText, GameScreen gameScreen) {
		if(buttonText.equals("Restart")) {
			gameScreen.changeMenuMode("singleplayer");
		} else if(buttonText.equals("Options")) {
			gameScreen.changeMenuMode("options"); 
		}else if(buttonText.equals("Main Menu")) {
			gameScreen.changeMenuMode("main");
		} else if(buttonText.equals("Quit")) {
			System.exit(0);
		}
	}

}
