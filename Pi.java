import java.awt.*;
import javax.swing.*;
import java.util.*;

@SuppressWarnings("serial")
public class Pi extends JApplet {
	
	public static final int SIZE = 1000;
	Dimension totalsize;
	
	public void init() {
		setSize(SIZE, SIZE);
		setBackground(Color.BLACK);
	}
	public void paint (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		Dimension d = getSize();
		int x = SIZE/2;
		int y = SIZE/2;
		int r = SIZE/2;
		int diameter = r*2;
		
		int xc = x - r;
		int yc = y - r;
		
		g2.setPaint(Color.BLACK);
		g2.fillRect(0, 0,  d.width, d.height);
		
		g2.setPaint(Color.WHITE);
		g2.setStroke(new BasicStroke(0.5f));
		g2.drawOval(xc, yc, diameter, diameter);
		
		double inside = 0;
		double total = 0;
		double pi = 0;
		
		while(true) {
				Random rand = new Random();
				int xP = rand.nextInt(SIZE);
				int yP = rand.nextInt(SIZE);
				
				Point center = new Point(x, y);
				Point p = new Point(xP, yP);
				
				if (distance(p, center) < r) {
					g2.setColor(Color.green);
					g2.drawRect(xP, yP, 0, 0);
					inside++;
				} else {
					g2.setColor(Color.blue);
					g2.drawRect(xP, yP, 0, 0);
				}
				total++;
				
				pi = (inside/total)*4;
				
				System.out.println(pi);
		}
	}
	public static int distance(Point p1, Point p2) {
		int xD = Math.abs(p1.x-p2.x);
		int yD = Math.abs(p1.y-p2.y);
		
		int d = (int) Math.sqrt(xD*xD + yD*yD);
		
		return d;
	}
}
