import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;		//prepare variables
	
	public void setX(int x) {
		this.x = x;						// pass x position
	}
	public void setY(int y) { 
		this.y = y;						// pass y position
	}
	public void setWidth(int width) { 
		this.width = width;				// pass width
	}
	public void setHeight(int height) { 
		this.height = height;			// pass height
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;						// return x variable
	}
	public int getY() { 
		return y;						// return y variable
	}
	public int getWidth() { 
		return width;					// return width
	}
	public int getHeight() { 
		return height;					// return height
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
