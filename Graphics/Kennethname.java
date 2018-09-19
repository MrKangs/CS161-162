import javax.swing.*;
import java.awt.*;
public class Kennethname{
	public static void main(String [] args){
	JFrame frame = new JFrame ("Kenneth_Kang & Jennifer_Yang");
	 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	JPanel primary = new JPanel();
	 JPanel second = new JPanel();
	 primary.setBackground (Color.white);
	 primary.setPreferredSize (new Dimension(200,50));
	 JLabel label1 = new JLabel ("Kenneth");
	 JLabel label2 = new JLabel ("Kang");
	 JLabel label3 = new JLabel ("is the Smartest Person!");
	 primary.add (label1);
	 primary.add (label2);
	 primary.add (label3);

	second.setBackground (Color.yellow);
	 second.setPreferredSize (new Dimension(200,50));
	 JLabel label4 = new JLabel ("Jennifer");
	 JLabel label5 = new JLabel ("Yang");
	 JLabel label6 = new JLabel ("is a person.");
	 second.add (label4);
	 second.add (label5);
	 second.add (label6);
	 JPanel three = new JPanel();

	 three.add (primary);
	 three.add (second);
	 frame.getContentPane().add(three);
	 frame.pack();
	 frame.setVisible(true);
 }}