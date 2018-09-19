//Write a program to draw a message several times using a for loop.
//The message to be repeated is "There is no place like home".
//Must show code and output.
import javax.swing.*;
import java.awt.*;

public class There_is_no_place_like_home extends JPanel{
	public There_is_no_place_like_home(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(1500,1500));
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		final int TEXT_NUM = 7, X_MOVE = 150, Y_MOVE = 50;
		int x = 0, y = 50;
		for (int c = 0; c < TEXT_NUM; c++){
			page.setColor(Color.black);
			page.drawString("There is no place like home!", x,y);
			x = x + X_MOVE;
			y = y + Y_MOVE;
		}
	}
	public static void main(String [] args){
				JFrame frame = new JFrame ("Assigment #2");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				There_is_no_place_like_home panel = new There_is_no_place_like_home();
				frame.getContentPane().add(panel);
				frame.pack();
				frame.setVisible(true);
	}}
