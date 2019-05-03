package shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Line implements IShape{
	int x1,y1,x2,y2;
	Color color;
	
	public Line(int x1,int y1,int x2,int y2,Color color) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.color=color;		
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(color);
		g2d.drawLine(x1, y1, x2, y2);
		
	}
	
	
	

}
