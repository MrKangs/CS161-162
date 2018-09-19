//package ezsnake;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyListening extends KeyAdapter{

 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	//Right key

		    				if(ImportantSeg.directionSnake!=2)
		    					ImportantSeg.directionSnake=1;
		    			  	break;
		    	case 38:	//Top key
							if(ImportantSeg.directionSnake!=4)
								ImportantSeg.directionSnake=3;
		    				break;

		    	case 37: 	//Left key
							if(ImportantSeg.directionSnake!=1)
								ImportantSeg.directionSnake=2;
		    				break;

		    	case 40:	//Bottom key
							if(ImportantSeg.directionSnake!=3)
								ImportantSeg.directionSnake=4;
		    				break;

		    	default: 	break;
 		    }
 		}

 }