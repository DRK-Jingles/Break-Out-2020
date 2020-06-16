import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		setX(x);								// TODO: Set x using the parameter>>>>>
		setY(y);								// TODO: Set y using the parameter>>>>
		setWidth(Settings.BRICK_WIDTH);
		setHeight(Settings.BRICK_HEIGHT);		// TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT>>>>>>
	}

	public boolean isBroken() {
		if(broken) {
			return true;
		}else {
		return false;
		}							// TODO: Return the correct variable>>>>>>>UNSURE ABOUT THIS
	}
	public void setBroken(boolean b) {
		broken = b;					// TODO: Set the broken variable using the parameter given>>>>>
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
