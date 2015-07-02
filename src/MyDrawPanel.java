import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		int randX = (int) (Math.random() * 250);
		int randY = (int) (Math.random() * 250);
		
		Color randomColor = new Color (red, green, blue);
		g.setColor(randomColor);
		g.fillOval(randX, randY, 50, 50);
		// TODO Auto-generated constructor stub
	}

}
