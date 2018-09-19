import javax.swing.*;
import java.awt.*;

public class other_shapes extends JPanel{
	public other_shapes(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(1000,1000));
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);

		page.setColor(Color.black);
		page.fillRect(10,190,180,10); //foreground

		page.setColor(Color.magenta);
		page.drawLine(10,190,90,110);
		page.drawLine(190,190,110,110);
		page.setColor(Color.black);
		int xpoints[] = {10, 90, 110, 190};
		int ypoints[] = {190, 110, 110, 190};
    	int npoints = 4;
		page.fillPolygon(xpoints,ypoints,npoints);
	}
	public static void main(String [] args){
					JFrame frame = new JFrame ("Assigment #3");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					other_shapes panel = new other_shapes();
					frame.getContentPane().add(panel);
					frame.pack();
					frame.setVisible(true);
				}
		}