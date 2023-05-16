//the J Panel class
//change
package files;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Game extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Sprite sprite;
	private Timer timer;
	private final int DELAY = 10;
	//private JFrame frame = new JFrame();
	//private JPanel panel = new JPanel();
	
	public Game() {
		
		
		initPanel();
	
	
	}
	private void initPanel(){
		addKeyListener(new TAdapter());
		setBackground(Color.black);
		setFocusable(true);
		
		sprite = new Sprite();
		timer = new Timer(DELAY, this);
		timer.start();
		
	}
	
	//@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		step();
		
		
	}
	private void step() {
		sprite.move();
		repaint();
		//repaint(sprite.getX()-1, sprite.getY()-1, sprite.getWidth()+2, sprite.getHeight()+2);
	}
	private class TAdapter extends KeyAdapter{
		@Override
		public void keyReleased(KeyEvent e) {
			sprite.keyReleased(e);
		}
		@Override
		public void keyPressed(KeyEvent e) {
			sprite.keyPressed(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
