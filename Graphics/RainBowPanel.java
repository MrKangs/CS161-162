import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class RainBowPanel extends JPanel{
	public RainBowPanel(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(1000,1000));
	}
	public void paintComponent(Graphics page){
      super.paintComponent(page);

      final int MAX_WIDTH =900, NUM_RINGS = 20, RINGS_WIDTH = 25;

      int x = 0, y = 0, diameter = MAX_WIDTH, c = 0;


      while(c <= NUM_RINGS){
		  Random rd = new Random();
       	  int r = rd.nextInt(256);
       	  int b = rd.nextInt(256);
       	  int g = rd.nextInt(256);
       	  Color rdColor = new Color(r,g,b);
       	  page.setColor(rdColor);
       	  page.fillArc(x,y,diameter,diameter,0,180);
       	  diameter -= (2 * RINGS_WIDTH);
       	  x += RINGS_WIDTH;
       	  y += RINGS_WIDTH;
       	  c++;
	  }}}





