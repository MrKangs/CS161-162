import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class DEMO_OF_LOOP extends JPanel{
	DEMO_OF_LOOP(){
		setPreferredSize(new Dimension(200,520));
		setBackground(Color.black);
		/*addKeyListener(new DirectionListener());*/
	}
	public boolean ok=false;
	public int a = 0, b = 0, MID_X = 5;
	public int x = 0, y = 0;
	public Color[][] Ken;

public void Noothing(){
	    Ken = new Color[10][24];//change 10 to 11 and 24 to 25

           for(int i=0;i<10;i++){
	   			for(int j=0;j<24;j++){
	   		     Ken[i][j] = Color.black;
	   		    }
	   	    }
	}


	public void paintComponent(Graphics page){
		page.setColor(Color.black);
		Noothing();

			do{
				page.fillRect(a,b,20,20);
				b += 20;
				if ( b == 500 ){
					a += 20;
					b = 0;
				}
				if ( a == 200 ){
					ok = true;
			    }
			}while (!ok);

	page.setColor(Color.red);
	y = 5;
    page.fillRect((1 + MID_X + x)*20,(0 + y)*20, 20,20);
    page.fillRect((0 + MID_X + x)*20,(1 + y)*20, 20,20);
    page.fillRect((1 + MID_X + x)*20,(1 + y)*20, 20,20);
    page.fillRect((2 + MID_X + x)*20,(1 + y)*20,20,20);

   Ken[1 + MID_X + x][0 + y]=Color.gray;
   Ken[0 + MID_X + x][1 + y]=Color.gray;
   Ken[1 + MID_X + x][1 + y]=Color.gray;
   Ken[2 + MID_X + x][1 + y]=Color.gray;

    x =-3;
    page.fillRect((1 + MID_X + x)*20,(0 + y)*20, 20,20);
	page.fillRect((0 + MID_X + x)*20,(1 + y)*20, 20,20);
	page.fillRect((1 + MID_X + x)*20,(1 + y)*20, 20,20);
    page.fillRect((2 + MID_X + x)*20,(1 + y)*20, 20,20);

   Ken[1 + MID_X + x][0 + y]=Color.gray;
   Ken[0 + MID_X + x][1 + y]=Color.gray;
   Ken[1 + MID_X + x][1 + y]=Color.gray;
   Ken[2 + MID_X + x][1 + y]=Color.gray;



   page.fillRect(0,(y+1)*20, 20,20);
    page.fillRect(20,(y+1)*20, 20,20);

    Ken[0][1 + y]=Color.gray;
    Ken[1][1 + y]=Color.gray;


    page.fillRect(160,(y+1)*20, 20,20);
    page.fillRect(180,(y+1)*20, 20,20);

    Ken[8][1 + y]=Color.gray;
    Ken[9][1 + y]=Color.gray;


//delete one row if the row is complete.
    //Ken[0][0] = Color.cyan;

for (int j = 0; j < 24; j++){
	for(int i=0;i<10;i++){
		if(Ken[i][j] != Color.black){
		page.setColor(Color.black);
       	page.fillRect(i*20,(j)*20, 20,20);
        }
   }
}
//Move the upper tile down 1 row
    page.setColor(Ken[1 + MID_X][0+y]);
    page.fillRect((1 + MID_X)*20 ,(1+y)*20 ,20,20);
    page.fillRect((1 + MID_X +x)*20,(1+y)*20 ,20,20);
    Ken[1 + MID_X][1+y] =  Ken[1 + MID_X][0+y];
    Ken[1 + MID_X+x][1+y] =  Ken[1 + MID_X+x][0+y];

/*//Deleted the upper previos tile location
    page.setColor(Color.black);
    page.fillRect((1 + MID_X)*20,(0 + y)*20 ,20,20);
	page.fillRect((1 + MID_X +x)*20,(0 + y)*20 ,20,20);
	Ken[1 + MID_X][0+y] = Color.yellow;
	Ken[1 + MID_X+x][0+y] = Color.yellow;

*/
  }


	public static void main(String [] args){
		JFrame f = new JFrame("DEMO_OF_LOOP");
		DEMO_OF_LOOP panel = new DEMO_OF_LOOP();
		f.getContentPane().add(panel);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
	}
}
	/*public class DirectionListener implements KeyListener{
		final int MOVE = 20;
		public void keyTyped(KeyEvent key){}
		public void keyReleased(KeyEvent key){}
		public void keyPressed(KeyEvent key){
			switch (key.getKeyCode()){
				case KeyEvent.VK_DOWN:*/
