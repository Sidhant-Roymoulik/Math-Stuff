/*	November 2, 2018
 * 	Sidhant Roymoulik
 * 	Requires DrawingPanel Class
 * 	Using Straight Lines to Draw Curves (Advanced Pattern Recognition)
 */

import java.awt.*;

public class CurvesAdv {
	final static Color B = Color.BLACK;
	final static Color G = Color.GREEN;
	final static Color R = Color.RED;
	final static Color W = Color.WHITE;
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(800, 800);
		Graphics g = panel.getGraphics();
		g.setColor(B);
		g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(panel.getWidth()/2, 0);
		Point p3 = new Point(panel.getWidth()  , 0);
		Point p4 = new Point(0                 , panel.getHeight()/2);
		Point v  = new Point(panel.getWidth()/2, panel.getHeight()/2);
		Point p5 = new Point(panel.getWidth()  , panel.getHeight()/2);
		Point p6 = new Point(0                 , panel.getHeight());
		Point p7 = new Point(panel.getWidth()/2, panel.getHeight());
		Point p8 = new Point(panel.getWidth()  , panel.getHeight());
		
		int n = 50;
		while(panel.getWidth()%n!=0 && panel.getHeight()%n!=0) {
			n--;
		}
		if(n > panel.getWidth()/2 || n > panel.getHeight()/2) {
			throw new IllegalArgumentException("n cannot be greater than half either the width or "
					                         + "height of the panel.");
		}
		
		drawCurve(g, p1, v, p2, n, panel);
		drawCurve(g, p2, v, p3, n, panel);
		drawCurve(g, p3, v, p5, n, panel);
		drawCurve(g, p5, v, p8, n, panel);
		drawCurve(g, p8, v, p7, n, panel);
		drawCurve(g, p7, v, p6, n, panel);
		drawCurve(g, p6, v, p4, n, panel);
		drawCurve(g, p4, v, p1, n, panel);

	}
	public static void drawCurve(Graphics g, Point p1, Point v, Point p2, 
								 int n, DrawingPanel panel) {
		int x1Diff = p1.x - v.x;
		int y1Diff = p1.y - v.y;
		int x2Diff = p2.x - v.x;
		int y2Diff = p2.y - v.y;
		
		g.setColor(R);
		for(int i = 0; i < n + 1; i++) {
			g.drawLine(p1.x - x1Diff/n*i, p1.y - y1Diff/n*i, v.x + x2Diff/n*i, v.y + y2Diff/n*i);
			panel.sleep((1000/n)*3/2);
		}
	}
}
