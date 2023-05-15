//the J Frame class
package files;

import javax.swing.JFrame;

public class MovingSprite extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MovingSprite() {
		initUI();
	}
	private void initUI() {
		add(new Game());
		
	
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Java Game");
		setResizable(false);
		
	}
	/*

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MovingSprite movingSprite = new MovingSprite();
			movingSprite.setVisible(true);
		
			
		});

	}
	*/

}

