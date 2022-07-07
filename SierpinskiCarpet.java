import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SierpinskiCarpet extends JApplet {
	
	Dimension totalsize;
	
	public void init() {
		setSize(900, 900);
		setBackground(Color.BLACK);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		Dimension d = getSize();
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0,  d.width, d.height);
		
		int buffer = 0;
		
		Rectangle box = new Rectangle( buffer, buffer, d.width - (2*buffer), d.height - (2*buffer));
		
		g2.setColor(Color.BLACK);
		g2.fill(box);
		
		sierpinski(buffer, buffer, d.width - (2*buffer), g);
	}

	private void sierpinski(int x, int y, int side, Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		int sub = side / 3;
		Rectangle box = new Rectangle(x + sub, y + sub, sub - 1, sub - 1);
		
		g2.setColor(Color.WHITE);
		g2.fill(box);
		
		if (sub >= 3) {
			sierpinski(x,         y,         sub, g);
			sierpinski(x + sub,   y,         sub, g);
			sierpinski(x + 2*sub, y,         sub, g);
			sierpinski(x,         y +   sub, sub, g);
			sierpinski(x + 2*sub, y +   sub, sub, g);
			sierpinski(x,         y + 2*sub, sub, g);
			sierpinski(x + sub,   y + 2*sub, sub, g);
			sierpinski(x + 2*sub, y + 2*sub, sub, g);
		}
	}
}
