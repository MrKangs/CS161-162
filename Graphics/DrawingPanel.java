// Write a program to draw boxed ovals using a for loop.
//It has to have four black rectangles with white ovals inside.
//Name the panel DrawingPanel.
//Must show code and output.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingPanel extends JPanel{
	public DrawingPanel (){
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(600,100));
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		final int OVAL_WIDTH = 120, OVAL_HEIGHT = 50, NUM_REC = 5, X_MOVE = 150, Y_MOVE = 50;
		int x = 0, y = 0, z = OVAL_WIDTH, a = OVAL_HEIGHT;

		for (int count = 1; count < NUM_REC; count++){
			g.setColor(Color.black);
			g.drawRect(x,y,z,a);
			g.setColor(Color.white);
			g.fillOval(x,y,z,a);
			x = x + X_MOVE;
		}
	}
	public static void main(String [] args){
			JFrame frame = new JFrame ("Assigment #1");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			DrawingPanel panel = new DrawingPanel();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
	}}
