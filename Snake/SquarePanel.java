//package ezsnake;
import java.awt.Color;
import javax.swing.JPanel;

//lets the recolor of blocks happen
public class SquarePanel extends JPanel{

	private static final long serialVersionUID = 42L;

	public SquarePanel(Color d){
		this.setBackground(d);
	}

	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}

}