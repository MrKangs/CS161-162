import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	//Don't start the game automaticly.
	private boolean play = false;
	//Start the score equal to 0
	private int score = 0;

	//How many blocks that will break
	private int totalBricks = 21;

	private Timer timer;
	private int delay = 8;
	//Player position
	private int playerx = 310;

	//ball position and direction
	private int ballposx = 120;
	private int ballposy = 350;
	private int ballxdir = -1;
	private int ballydir = -2;

	public Gameplay(){
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics page){
		//back ground
		page.setColor(Color.black);
		page.fillRect(1,1,692,592);

		//Borders
		page.setColor(Color.yellow);
		page.fillRect(0,0,3,592);
		page.fillRect(0,0,692,3);
		page.fillRect(691,0,3,592);

		//the paddle
		page.setColor(Color.green);
		page.fillRect(playerx,550,100,8);

		//ball
		page.setColor(Color.yellow);
		page.fillOval(ballposx,ballposy,20,20);

		page.dispose();
	}

	//Key Control
	public void keyTyped(KeyEvent key){}
	public void keyReleased(KeyEvent key){}
	public void keyPressed(KeyEvent key){
		if (key.getKeyCode() == KeyEvent.VK_RIGHT){
			if(playerx >= 600){
				playerx = 600;
			}else{
				moveRight();
			}
		}
		if (key.getKeyCode() == KeyEvent.VK_LEFT){
				if(playerx < 10){
					playerx = 10;
				}else{
					moveLeft();
				}
		}
	}
	public void moveRight(){
		play = true;
		playerx += 20;
	}
	public void moveLeft(){
		play = true;
		playerx-= 20;
	}

//LOOK AT THIS PART FOR OBJECTS HITTING TO EACH OTHER.
	public void actionPerformed(ActionEvent Act){
		timer.start();
		if(play){
			if(new Rectangle(ballposx,ballposy,20,20).intersects(new Rectangle(playerx,550,100,8))){
				ballydir = -ballydir;
			}

			ballposx += ballxdir;
			ballposy += ballydir;
			if(ballposx < 0){
				ballxdir = -ballxdir;
			}
			if(ballposy < 0){
				ballydir = -ballydir;
			}
			if(ballposx > 670){
				ballxdir = -ballxdir;
			}
		}
		repaint();
		}





































}