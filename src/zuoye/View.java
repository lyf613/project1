package zuoye;

import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;



public class View extends JPanel {
	private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 36;
	private GameMap theField;
	
	public View(GameMap field) {
		theField = field;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for ( int row = 1; row<=10; row++ ) {
			for ( int col = 1; col<=10; col++ ) {
		
				if ( theField.map[row][col]== 1 ) {
					g.fillRect(col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE-2,GRID_SIZE-2);
					
				}
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(10*GRID_SIZE+1,10*GRID_SIZE+1);
	}

	public static void main(String[] args) {
		GameMap field = new GameMap();
		field.init();
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
	}

}
