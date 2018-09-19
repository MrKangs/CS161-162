import javax.swing.JApplet;
import java.awt.*;
import java.util.*;
public class Face extends JApplet{
	//public static int (x,y){

	public void paint(Graphics gp){
		Scanner sc = new Scanner (System.in);

		final int MAX = 300;
		final int WIDTH = 600;
		final int HEIGHT = 400;
		setBackground(Color.white);
		gp.setColor(Color.black);
		gp.drawOval(150,100,150,150);
		gp.setColor(Color.green);
		gp.fillOval(140,170,20,20);
		gp.fillOval(290,170,20,20);
		gp.setColor(Color.yellow);
		gp.fillOval(150,100,150,150);
		gp.setColor(Color.black);
		gp.fillOval(180,140,25,25);
		gp.setColor(Color.blue);
		gp.fillOval(245,140,25,25);
		gp.setColor(Color.white);
		gp.fillOval(180,140,10,10);
		gp.fillOval(245,140,10,10);
		gp.setColor(Color.black);
		gp.drawArc(200,170,20,20,180,180);
		gp.drawArc(180,190,80,35,180,180);
	}}
