//package ezsnake;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


//sets up window size and grid
class Window extends JFrame{
	private static final long serialVersionUID = 42L;
	public static ArrayList<ArrayList<Colors>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Window(){



		Grid = new ArrayList<ArrayList<Colors>>();
		ArrayList<Colors> data;


		for(int i=0;i<width;i++){
			data= new ArrayList<Colors>();
			for(int j=0;j<height;j++){
				Colors c = new Colors(2);
				data.add(c);
			}
			Grid.add(data);
		}


		getContentPane().setLayout(new GridLayout(20,20,0,0));


		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				getContentPane().add(Grid.get(i).get(j).square);
			}
		}

		//Start position for snake
		Tuple position = new Tuple(10,10);
		ImportantSeg c = new ImportantSeg(position);
		c.start();

		// Keylistener is now connected to the snake
		this.addKeyListener((KeyListener) new KeyListening());


	}
}