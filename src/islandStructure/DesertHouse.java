package islandStructure;

import java.awt.Color;
import java.awt.Graphics2D;

import shapes.Circle;
import shapes.IShape;
import shapes.Line;
import shapes.Rectangle;

public class DesertHouse extends House{
	public DesertHouse() {
		
		Rectangle rectangle= new Rectangle(65, 148,275,100,Color.black);
		Line ln=new Line(65,148,150,50,Color.black);
		Line ln1=new Line(340,148,150,50,Color.black);
		
		Line line1= new Line(515,70,555,142,Color.black);
		Line line2= new Line(555,142,558,225,Color.black);
		Line line3= new Line(558,225,717,225,Color.black);
		Line line4= new Line(717,225,715,139,Color.black);
		Line line5= new Line(715,139,746,61,Color.black);
		
		components.add(rectangle);
		components.add(ln);
		components.add(ln1);
		components.add(line1);
		components.add(line2);
		components.add(line3);
		components.add(line4);
		components.add(line5);
	}
	@Override
	public void draw(Graphics2D g2d) {
		for(IShape s: components) {
			s.draw(g2d);
		}
	}
}