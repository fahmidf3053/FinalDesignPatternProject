package shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements IShape{
	int x,y,r;
	Color color;
	
	public Circle(int x,int y, int r,Color color) {
		this.x=x;
		this.y=y;
		this.r=r;
		this.color=color;
	}

	@Override
	public void draw(Graphics2D g2d) {
//		System.out.println("Drawing Circle :"+x+" "+y+" "+r);
		g2d.setColor(color);
		g2d.fillOval(x, y, r, r);		
		
	}
	
	

}
