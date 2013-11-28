package Division;

import java.awt.Graphics;
/*
 * GameObject는 abstract클래스이며,
 * collisionCheck메소드와 draw메소드는 abstract메소드이다.
 */
public abstract class GameObject {
	private int x;
	private int y;
	private int height;
	private int width;
	
	public GameObject() {
		this(0, 0, 0, 0);
	}
	public GameObject(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	public abstract void draw(Graphics g);
	public abstract void collisionCheck(Ball ball);
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
