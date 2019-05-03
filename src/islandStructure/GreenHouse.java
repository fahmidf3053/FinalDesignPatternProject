package islandStructure;

import java.awt.Color;
import java.awt.Graphics2D;
import shapes.*;

import shapes.Circle;

public class GreenHouse extends House{
	public GreenHouse() {
		Circle circle = new Circle(71,60,100,Color.red);
		Circle circle1 = new Circle(221,60,100,Color.red);
		Circle circle2 = new Circle(150 ,5,100,Color.blue);
		Rectangle rectangle= new Rectangle(65, 148,275,100,Color.green);
		
		Line line1= new Line(515,70,555,142,Color.red);
		Line line2= new Line(555,142,558,225,Color.red);
		Line line3= new Line(558,225,717,225,Color.red);
		Line line4= new Line(717,225,715,139,Color.red);
		Line line5= new Line(715,139,746,61,Color.red);
		
		components.add(circle);
		components.add(circle1);
		components.add(circle2);
		components.add(rectangle);
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
