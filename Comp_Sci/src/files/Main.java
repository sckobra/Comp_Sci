package files;

import java.awt.EventQueue;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("main run");
		EventQueue.invokeLater(() -> {
			MovingSprite movingSprite = new MovingSprite();
			movingSprite.setVisible(true);
		
			
		});

	}

}
