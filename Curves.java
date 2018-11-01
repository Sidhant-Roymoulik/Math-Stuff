/*	November 1, 2018
 * 	Sidhant Roymoulik
 * 	
 * 	Using Straight Lines to Draw Curves
 */

import java.awt.*;

public class Curves {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(800, 800);
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, panel.getWidth(), panel.getHeight());
		while(true) {
		//drawCurve(g, 0, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2, 50, 4, panel);
		//drawCurve(g, panel.getWidth()/2, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2, 50, 3, panel);
		//drawCurve(g, panel.getWidth()/2, 0, panel.getWidth()/2, panel.getHeight()/2, 50, 2, panel);
		//drawCurve(g, 0, 0, panel.getWidth()/2, panel.getHeight()/2, 50, 1, panel);
		
		g.setColor(Color.WHITE);
		drawCurve(g, panel.getWidth()/2, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2, 50, 1, panel);
		g.setColor(Color.WHITE);
		g.fillRect(0, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2);
		g.setColor(Color.BLACK);
		g.drawRect(0, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2);
		drawCurve(g, 0, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2, 50, 2, panel);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, panel.getWidth()/2, panel.getHeight()/2);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, panel.getWidth()/2, panel.getHeight()/2);
		drawCurve(g, 0, 0, panel.getWidth()/2, panel.getHeight()/2, 50, 3, panel);
		g.setColor(Color.WHITE);
		g.fillRect(panel.getWidth()/2, 0, panel.getWidth()/2, panel.getHeight()/2);
		g.setColor(Color.BLACK);
		g.drawRect(panel.getWidth()/2, 0, panel.getWidth()/2, panel.getHeight()/2);
		drawCurve(g, panel.getWidth()/2, 0, panel.getWidth()/2, panel.getHeight()/2, 50, 4, panel);
		g.setColor(Color.WHITE);
		g.fillRect(panel.getWidth()/2, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2);
		g.setColor(Color.BLACK);
		g.drawRect(panel.getWidth()/2, panel.getHeight()/2, panel.getWidth()/2, panel.getHeight()/2);
		System.out.println("Finished");
		}
	}
	public static void drawCurve(Graphics g, int x, int y, int width, int height, int n, int direction, DrawingPanel panel) {
		int xGap = width/n;
		int yGap = height/n;
		g.setColor(Color.BLACK);
		for(int i = 0; i < n + 1; i++) {
			if(direction==1)
				g.drawLine(x, y + i*yGap, x + width - i*xGap, y);
			if(direction==2)
				g.drawLine(x + width - i*xGap, y, x + width, y + height - i*yGap);
			if(direction==3)
				g.drawLine(x + width, y + height - i*yGap, x + i*xGap, y + height);
			if(direction==4)
				g.drawLine(x + i*xGap, y + height, x, y + i*yGap);
			panel.sleep(20);
		}
	}
}
