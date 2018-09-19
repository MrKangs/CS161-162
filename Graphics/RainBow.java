import javax.swing.*;

public class RainBow {
	public static void main(String [] args){
		JFrame frame = new JFrame ("CHANGE YOUR WINDOW SIZE!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RainBowPanel panel = new RainBowPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}}

