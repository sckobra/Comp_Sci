package files;
import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Sprite {

	private int dx;
	private int dy;
	
	//set beginning pos at bottom left corner
	
	private int x = 8;
	private int y = 644;
	
	private int width;
	private int height;
	private Image image;
	
	private int spriteSpeed = 2;
	
	public Sprite() {
		loadImage();
	}
	
	private void loadImage() {
		ImageIcon icon = new ImageIcon("image_src/circle_sprite.png");
		image = icon.getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		
		
	}
	public void move() {
		x += dx;
		y+= dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Image getImage() {
		return image;
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed");
		System.out.println("x val: " + getX());
		System.out.println("y val: " + getY());
		
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			dx = -spriteSpeed;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx  = spriteSpeed;
		}
		if (key == KeyEvent.VK_UP) {
			dy = -spriteSpeed;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = spriteSpeed;
		}
		if (key == KeyEvent.VK_SPACE) {
			dy = -10;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		System.out.println("key released");
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			dx =  0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx  = 0;
		}
		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		if (key == KeyEvent.VK_SPACE) {
			dy = spriteSpeed;
			//dy = 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
