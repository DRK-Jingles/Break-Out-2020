import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	//brick method
	public Brick(int x, int y) {
		setX(x);								// set x to passed variable
		setY(y);								// set y to passed variable
		setWidth(Settings.BRICK_WIDTH);			//set width to variable in settings
		setHeight(Settings.BRICK_HEIGHT);		// set height to variable in settings
	}
	//is broken method
	public boolean isBroken() {
		if(broken) {
			return true;
		}else {
		return false;
		}							// this method checks if the block is broken or not
	}
	//set broken method
	public void setBroken(boolean b) {
		broken = b;					// set broken to passed true/false statement
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
