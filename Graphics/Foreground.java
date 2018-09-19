//Write a program that draws the following program:
//The windows is 200 pixels wide and 200 pixels tall.
//The background is white and the foreground is black.
//There are 20 pixels between each of the four rectangles,
//and the rectangles are concentric (their centers are at the same point).
//Use a loop to draw the repeated rectangles.
//Must show code and output.

import javax.swing.*;
import java.awt.*;

public class Foreground extends JPanel{
	public Foreground(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(200,200));
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);

		//page.setColor(Color.black);
		//page.fillRect(10,190,180,10); //foreground

		page.setColor(Color.magenta);
		page.drawLine(10,190,90,110);
		page.drawLine(190,190,110,110);
		page.setColor(Color.black);
		int xpoints[] = {10, 90, 110, 190};
		int ypoints[] = {190, 110, 110, 190};
		int npoints = 4;
		page.fillPolygon(xpoints,ypoints,npoints);

		page.setColor(Color.yellow);
		int cpoints[] = {190, 110, 110, 190};
		int dpoints[] = {10, 90, 110, 190};
		int zpoints = 4;
		page.fillPolygon(cpoints,dpoints,zpoints);


		int apoints[] = {10, 90, 90, 10};
		int bpoints[] = {10, 90, 110, 190};
		int kpoints = 4;
		page.fillPolygon(apoints,bpoints,kpoints);

		page.setColor(Color.blue);
		int hpoints[] = {10, 90, 110, 190};
		int tpoints[] = {10, 90, 90, 10};
		int upoints = 4;
		page.fillPolygon(hpoints,tpoints,upoints);

		final int Distance = 20, NUM_RECT = 4;

		int x = 90, y = 90, z = Distance, a = 1;

		for (int c = 0; c <= NUM_RECT; c++){
			page.setColor(Color.magenta);
			page.drawRect(x,y,z,z);
			x = x - 20;
			y = y - 20;
			a = a + 2;
			z = 20;
			z = a * z;
		}
	}
	public static void main(String [] args){
				JFrame frame = new JFrame ("Assigment #3");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Foreground panel = new Foreground();
				frame.getContentPane().add(panel);
				frame.pack();
				frame.setVisible(true);
			}
		}
