import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setTitle(Settings.WINDOW_NAME);	// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);	// TODO: Set the title
		setBackground(Color.WHITE);	// TODO: Set the background colour to white
		setResizable(false);	// TODO: Set resizable to false
		setVisible(true);	// TODO: Set visible to true
        setDefaultCloseOperation(EXIT_ON_CLOSE);			//TO DO COMPLETED>>>
        panel = new BreakoutPanel(this);			//UUUUUUUUHHHHHHHHHH???????
        add(panel);
	}

	public static void main(String[] args) {
		new Breakout();	
	}

}
