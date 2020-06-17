import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	//paddle method
	public Paddle() {
		setWidth(Settings.PADDLE_WIDTH);	// Set width to variable in settings
		setHeight(Settings.PADDLE_HEIGHT);	// ''height''
		resetPosition();					// Call resetPosition to center paddle at 'home' location
	}
	//reset position
	public void resetPosition() {
		setX(Settings.INITIAL_PADDLE_X);	// set initial position using variables in settings
		setY(Settings.INITIAL_PADDLE_Y);
	}
	//update method
	public void update() {
		x += xVelocity;
		// stops the paddle going off the left of the screen
		if(x <= 0) {
			x = 0;
			xVelocity = 0;
		}		
		//stops paddle going off right
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			x = (Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
			xVelocity = 0;
		}
	}
	//paint method
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	//set x velocity method
	public void setXVelocity(int vel) {
		xVelocity = vel;		//Set x velocity to passed variable
	}
}
