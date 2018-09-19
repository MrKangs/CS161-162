//package ezsnake;

import javax.swing.JFrame;
//Sets up JFrame
public class Main {

	public static void main(String[] args) {


		Window Snake= new Window();


		Snake.setTitle("Snakez");
		Snake.setSize(400,400);
		Snake.setVisible(true);
		Snake.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}