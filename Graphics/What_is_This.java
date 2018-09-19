// Write a program that draws the following figure:
//–drawing panel is size 200x150
//–book is at (20, 35), size 100x100
//–cyan background
//–white "BJP" text at position (70, 55)
//–stairs are in color (red=191, green=118, blue=73)
//–each stair is 9px tall
//•1st stair is 10px wide
//•2nd stair is 20px wide ...
//–stairs are 10px apart (1 blank pixel between)
//Show code and output

import javax.swing.*;
import java.awt.*;

public class What_is_This extends JPanel{
	public What_is_This(){
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(200,150));
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);

		page.setColor(Color.black);
		page.drawRect(20,35,100,100); //Book

		page.setColor(Color.white);
		page.drawString("BJP",70,55);//Text

		Color stairs = new Color(191,118,73);
		page.setColor(stairs);
		int xpoints[] = {130, 130, 140};
		int ypoints[] = {150, 141, 141};
		int npoints = 3;
		page.fillPolygon(xpoints,ypoints,npoints);
		int apoints[] ={150,150,170};
		int bpoints[] = {141,132,132};
		int kpoints = 3;
		page.fillPolygon(apoints,bpoints,kpoints);
	} // I don't like the shape...
	public static void main(String [] args){
			JFrame frame = new JFrame ("Assigment #5");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			What_is_This panel = new What_is_This();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
	}