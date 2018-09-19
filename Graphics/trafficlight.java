import javax.swing.*;

public class trafficlight{
	public static void main(String args[]){
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TrafficDrawing panel = new TrafficDrawing();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}