import java.awt.*;
import javax.swing.*;
public class internetstuff{
	public static void main(String [] args){
		JFrame frame = new JFrame("Internet Browers");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		JLabel one = new JLabel(new ImageIcon("chrome.png"));
		JLabel two = new JLabel(new ImageIcon("iexplorer.png"));
		JLabel three = new JLabel(new ImageIcon("firefox.png"));
		JLabel four = new JLabel(new ImageIcon("Safari.jpg"));





		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);
		panel1.setMinimumSize(new Dimension(250,250));
		panel1.add(one);
		panel1.add(two);


		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		panel2.add(three);
		panel2.add(four);

		JPanel primary = new JPanel();
		primary.add(panel1);
		primary.add(panel2);
		primary.setPreferredSize(new Dimension(200,200));
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}}
