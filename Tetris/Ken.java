import javax.swing.*;


public class Ken {

	public static void main(String [] args){
		JFrame frame = new JFrame ("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Jen panel = new Jen();
		panel.Background();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
    }

}