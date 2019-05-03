package islandStructure;

import java.awt.Graphics2D;
import java.util.ArrayList;

import shapes.*;

public abstract class House {
	ArrayList<IShape> components;
	
	public House() {
		components=new ArrayList();
	}
	
	abstract public void draw(Graphics2D g2d);
}
