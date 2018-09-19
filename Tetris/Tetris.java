import javax.swing.*;


public class Tetris {

	public static void main(String [] args){
		JFrame frame = new JFrame ("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Pieces panel = new Pieces();
		panel.Background();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
    }

}