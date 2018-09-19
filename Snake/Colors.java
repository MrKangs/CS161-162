//package ezsnake;
import java.util.ArrayList;
import java.awt.Color;

public class Colors {


	//Colors
	ArrayList<Color> C =new ArrayList<Color>();
	int color;
	SquarePanel square;
	public Colors(int col){

		//adds colors to background,snake,apple
		C.add(Color.green);
		C.add(Color.red);
		C.add(Color.black);
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void NewAppleBlock(int c){
		square.ChangeColor(C.get(c));
	}
}