package files;
import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Sprite {

	private int dx;
	private int dy;
	private int x = 40;
	private int y = 60;
	private int width;
	private int height;
	private Image image;
	
	
	public Sprite() {
		loadImage();
	}
	
	private void loadImage() {
		ImageIcon icon = new ImageIcon("image_src/player1.png");
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
		System.out.println(getWidth());
		System.out.println(getHeight());
		
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx  = 2;
		}
		if (key == KeyEvent.VK_UP) {
			dy = -2;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 2;
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
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
