package zuoye;

import javax.swing.JFrame;



public class LifeGame {
	 
	public void timeSet(GameMap field,JFrame frame) {
		for ( int i=0; i<1000; i++ ) {
			field.set();
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		GameMap field =new GameMap();
		LifeGame lg = new LifeGame();
		field.init();
		field.reset(30);
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
		lg.timeSet(field, frame);
		
	}
}
