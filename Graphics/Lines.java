//Write a program that uses the DrawingPanel to draw the shape:
//The drawing panel is 300 pixels wide by 200 pixels high.
//Its background is cyan.
//The horizontal and vertical lines are drawn in red
//and the diagonal line is drawn in black.
//The upper-left corner of the diagonal line is at (50,50).
//Successive horizontal and vertical lines are spaced 20 pixels apart.
//Must show code and output.
//I have a question, we just draw lines??

import javax.swing.*;
import java.awt.*;

public class Lines extends JPanel{
	public Lines(){
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300,200));
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);

		page.setColor(Color.red);
		page.drawLine(20,20,20,100);//Vertical Line
		page.drawLine(40,20,120,20);//Horizontal Line

		page.setColor(Color.black);
		page.drawLine(50,50,100,100);//Diagonal Line
	}

	public static void main(String args[]){
		JFrame frame = new JFrame ("Assignment #4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lines panel = new Lines();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
