import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ReboundPanel extends JPanel{
	private final int W = 300, H = 480;
	private final int D = 20, IS = 100;
	private ImageIcon image;
	private Timer timer;
	private int x,y,moveX,moveY;

	public ReboundPanel(){
		timer = new Timer(D,new ReboundListener());

		image = new ImageIcon("chrome.png");

		x =0;
		y =40;
		moveX = 0;
		moveY = 6;

		setPreferredSize(new Dimension(W,H));
		setBackground(Color.black);
		timer.start();
	}

	public void paintComponent(Graphics page){
		super.paintComponent(page);
		image.paintIcon(this,page,x,y);
	}

	public class ReboundListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			x += moveX;
			y += moveY;
			if (x <= 0 || x >= W-IS){
				moveX = moveX * -1;
			}else{}
			if (y <=0 || y >= H-IS){
				moveY = moveY * -1;
			}else{}
			repaint();
		}
	}
	public static void main(String [] args){
		JFrame frame = new JFrame("Timer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ReboundPanel panel = new ReboundPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}