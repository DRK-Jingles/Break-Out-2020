import java.awt.Graphics;

public class Ball extends Sprite {
	private int xVelocity = 1, yVelocity = -1;			//initiate variables for velocity of ball
	// Constructor
	public Ball() {
		setWidth(Settings.BALL_WIDTH);		// sets width of ball from variable in settings
		setHeight(Settings.BALL_HEIGHT);	// ''width''
		resetPosition();					// Call resetPosition
	}	
	//reset position method
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);		//set x position of ball to variable in settings
		setY(Settings.INITIAL_BALL_Y);		// ''y position''
	}	
	//update method
	public void update() {
		x += xVelocity;			//increase x var by x velocity
		y += yVelocity;			//''y by y''	
		// Bounce off left side of screen
		if(x <= 0) {
			x = 0;				//set x to 0, to avoid leaving left side
			xVelocity = 1;		// change x velocity to go right
		}		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			x = Settings.WINDOW_WIDTH - Settings.BALL_WIDTH;	// same above but right side
			xVelocity = -1;										// same above but go left
		}		
		// Bounce off top of screen
		if(y <= 0) {
			y = 0;					// set y to 0, to avoid leaving top of screen
			yVelocity = 1;			// change y velocity to go down
		}		
	}	
	public void setXVelocity(int x) {
		xVelocity = x;				// Set the x velocity using passed variable
	}
	public void setYVelocity(int y) {
		yVelocity = y;				// Set the y velocity using passed variable
	}	
	public int getXVelocity() {
		return xVelocity;			// return x velocity
	}
	public int getYVelocity() {
		return yVelocity;			// return y velocity
	}	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
