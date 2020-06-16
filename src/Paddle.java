import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		setWidth(Settings.PADDLE_WIDTH);	// TODO: Set width to Settings.PADDLE_WIDTH>>
		setHeight(Settings.PADDLE_HEIGHT);	// TODO: Set width to Settings.PADDLE_HEIGHT>>
		resetPosition();					// TODO: Call resetPosition>>
	}
	
	public void resetPosition() {
		setX(Settings.INITIAL_PADDLE_X);	// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)>>
		setY(Settings.INITIAL_PADDLE_Y);	// Note: Check Ball.java for a hint>>
	}
	
	public void update() {
		x += xVelocity;
		if(x <= 0) {
			x = 0;
			xVelocity = 0;
		}		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			x = (Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
			xVelocity = 0;
		}
		// TODO: Prevent the paddle from moving outside of the screen>>
		// This can be done using two if statements (one for the left side of the screen and one for the right)>>
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		xVelocity = vel;		// TODO: Set x velocity	>>>>>????????
	}
}
