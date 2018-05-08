import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class SierpinskiTriangle extends JApplet {
	public static final int SIZE = 900;
	
	Dimension totalsize;
	
	public void init() {
		setSize(SIZE, SIZE);
		setBackground(Color.BLACK);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		Dimension d = getSize();
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0,  d.width, d.height);
		
		int height = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
		Point p1 = new Point(0, height);
		Point p2 = new Point(SIZE / 2, 0);
		Point p3 = new Point(SIZE, height);
		
		int level = 10;
		
		sierpinski(level, p1, p2, p3, g);
	}

	private void sierpinski(int level, Point p1, Point p2, Point p3, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		Random rand = new Random();
		int red = rand.nextInt(255) - 128;
		int green = rand.nextInt(255) - 128;
		int blue = rand.nextInt(255) - 128;
		
		if (level == 1){
			Polygon t = new Polygon();
			t.addPoint(p1.x, p1.y);
			t.addPoint(p2.x, p2.y);
			t.addPoint(p3.x, p3.y);
			
			g2.setStroke(new BasicStroke(0.5f));
			g2.setPaint(new Color(128 + red, 128 + blue, 128 + green));
			g2.drawPolygon(t);
		} else {
			Point p4 = midpoint(p1, p2);
			Point p5 = midpoint(p2, p3);
			Point p6 = midpoint(p1, p3);
			
			sierpinski(level - 1, p1, p4, p6, g);
			sierpinski(level - 1, p4, p2, p5, g);
			sierpinski(level - 1, p6, p5, p3, g);
		}
	}

	private Point midpoint(Point p1, Point p2) {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}
}
