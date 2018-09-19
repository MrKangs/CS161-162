import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class Pieces extends JPanel{
	public Pieces(){
		addKeyListener(new DirectionListener());
		setFocusable(true);
		setPreferredSize(new Dimension(250,510));
		}

	//Variables
	private Color[][] color;
	private int currentPiece, rotation;
	public 	Random RandomColor = new Random();
	public	int Red = RandomColor.nextInt(255);
	public	int Blue = RandomColor.nextInt(255);
	public	int Green = RandomColor.nextInt(255);
	public	Color rdColor = new Color (Red,Blue,Green);
	public Point piecestart = new Point (5,2);






	public Point[][][] Tetraminos= {
			// T-Piece - 0
					{
			           {new Point(1,0), new Point (0,1), new Point(1,1), new Point(2,1)},
					   {new Point(0,1), new Point (1,2), new Point(1,1), new Point(1,0)},
					   {new Point(1,2), new Point (0,1), new Point(1,1), new Point(2,1)},
					   {new Point(2,1), new Point (1,2), new Point(1,1), new Point(1,0)}
				   },

           // J-Piece - 1
					{
			           {new Point(0,1), new Point (1,1), new Point(2,1), new Point(2,0)},
					   {new Point(1,0), new Point (1,1), new Point(1,2), new Point(2,2)},
					   {new Point(0,1), new Point (1,1), new Point(2,1), new Point(0,2)},
					   {new Point(1,0), new Point (1,1), new Point(1,2), new Point(0,0)}
				   },

           // L-Piece - 2
					{
			           {new Point(1,0), new Point (1,1), new Point(1,2), new Point(2,2)},
					   {new Point(0,1), new Point (1,1), new Point(2,1), new Point(2,0)},
					   {new Point(0,0), new Point (1,0), new Point(1,1), new Point(1,2)},
					   {new Point(0,2), new Point (0,1), new Point(1,1), new Point(2,1)}
				   },

           // O-Piece - 3
					{
			           {new Point(0,0), new Point (0,1), new Point(1,0), new Point(1,1)},
					   {new Point(0,0), new Point (0,1), new Point(1,0), new Point(1,1)},
					   {new Point(0,0), new Point (0,1), new Point(1,0), new Point(1,1)},
					   {new Point(0,0), new Point (0,1), new Point(1,0), new Point(1,1)},
				   },

          // S-Piece - 4
					{
			           {new Point(1,0), new Point (2,0), new Point(0,1), new Point(1,1)},
					   {new Point(0,0), new Point (0,1), new Point(1,1), new Point(1,2)},
					   {new Point(1,0), new Point (2,0), new Point(0,1), new Point(1,1)},
					   {new Point(0,0), new Point (0,1), new Point(1,1), new Point(1,2)},
				   },

          // Z-Piece - 5
					{
			           {new Point(0,0), new Point (1,0), new Point(1,1), new Point(2,1)},
					   {new Point(1,0), new Point (0,1), new Point(1,1), new Point(0,2)},
					   {new Point(0,0), new Point (1,0), new Point(1,1), new Point(2,1)},
					   {new Point(1,0), new Point (0,1), new Point(1,1), new Point(0,2)},
				   },

			//I-Piece - 6
					{
					   {new Point(0,0), new Point (0,1), new Point(0,2), new Point(0,3)},
				       {new Point(-1,0), new Point (0,0), new Point(1,0), new Point(2,0)},
			           {new Point(0,0), new Point (0,1), new Point(0,2), new Point(0,3)},
			           {new Point(-1,0), new Point (0,0), new Point(1,0), new Point(2,0)}
				   }
			};



		public void Background(){
			color = new Color[12][25];
			for(int i = 0; i <= 11; i++){
				for(int j = 0; j <= 24; j++){
					if (i == 0|| i == 11 || j == 24){
						color[i][j] = Color.white;
					}else {
						color[i][j] = Color.black;
					}
				}
			}
			Piece_Generator();
		}



		public void Piece_Generator(){
			piecestart = new Point (5,2);
			rotation = 0;
			Random RandomPiece = new Random();
			currentPiece = RandomPiece.nextInt(7);
			Red = RandomColor.nextInt(255);
			Blue = RandomColor.nextInt(255);
			Green = RandomColor.nextInt(255);
			rdColor = new Color (Red,Blue,Green);
		}



		private boolean Piece_Store(int x, int y, int rotation){
			for(Point p: Tetraminos[currentPiece][rotation]){
				if(color[p.x+x][p.y+y]!= Color.black){
					return true;
				}
			}return false;
		}

		public void move(int Xadd){
			if (!Piece_Store(piecestart.x +Xadd, piecestart.y, rotation)){
				piecestart.x += Xadd;
				}
			}
		public void drop(int Yadd){
			if (!Piece_Store(piecestart.x , piecestart.y+ Yadd, rotation)){
				piecestart.y += Yadd;
			}else{
				FixPiece();
			}
		}

		public void FixPiece(){
			for (Point p : Tetraminos[currentPiece][rotation]) {
				color[piecestart.x + p.x][piecestart.y + p.y] = rdColor;
		}
		Piece_Generator();
	}









		public void paintComponent(Graphics page){
			super.paintComponent(page);


			for (int i = 0; i <= 11; i++){
				for (int j = 0; j <= 24; j++){
					if (i == 0 || i == 11 || j == 24){
						page.setColor(color[i][j]);
					}else {
						page.setColor(color[i][j]);
					}
					page.fillRect(20 * i, 20 * j, 20, 20);

				}
			}

			page.setColor(rdColor);
			for(Point p: Tetraminos[currentPiece][rotation]){
				page.fillRect(20 * (p.x+ piecestart.x), 20 * (p.y+piecestart.y), 20, 20);
			}
		}



		public class DirectionListener implements KeyListener{
			public void keyTyped(KeyEvent key){}
			public void keyReleased(KeyEvent key){}
			public void keyPressed(KeyEvent key){
				switch(key.getKeyCode()){
					case KeyEvent.VK_DOWN:
					drop(1);
					break;
					case KeyEvent.VK_LEFT:
					move(-1);
					break;
					case KeyEvent.VK_RIGHT:
					move(1);
					break;
					case KeyEvent.VK_SPACE:
					if (rotation == 3){
						rotation = 0;
					}else{rotation++;
				}
					break;
					}
					repaint();
				}
			}
		}