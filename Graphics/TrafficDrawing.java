import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TrafficDrawing extends JPanel{
	private int count = 0;

	public TrafficDrawing(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(400,400));

		JButton button = new JButton();
		this.add(button);
		button.addActionListener(new ButtonListener());
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		Color Red = new Color(64,0,0);
		Color Yellow = new Color(64,64,0);
		Color Green = new Color(0,64,0);

		page.setColor(Color.black);
		page.fillRect(100,95,100,200);


		//page.setColor(Color.Red);
		//page.fillOval(125,100,50,50);

		//page.setColor(Color.Yellow);
		//page.fillOval(125,100,50,50);

		//page.setColor(Color.Green);
		//page.fillOval(125,100,50,50);

		if(count==1){
			page.setColor(Color.green);
			page.fillOval(125,232,50,50);
		}else if(count==2){
			page.setColor(Color.yellow);
			page.fillOval(125,166,50,50);
		}else{
			page.setColor(Color.red);
			page.fillOval(125,100,50,50);
		}}
		private class ButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent event){
				count++;
				repaint();
				if(count == 3){
					count -= 3;
				}}}}


