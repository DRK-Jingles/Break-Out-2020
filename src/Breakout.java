import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	//breakout method
	public Breakout() {
		setTitle(Settings.WINDOW_NAME);							// sets size of screen to variable stored in settings
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);	// ''title''
		setBackground(Color.WHITE);								// sets background to white
		setResizable(false);									// Set resizable to false
		setVisible(true);										// Set visible to true
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
	}
	//main
	public static void main(String[] args) {
		new Breakout();				//calls breakout method
	}

}
