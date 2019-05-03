package islandStructure;

import java.util.ArrayList;


public abstract class Flora {
	ArrayList<String> floraList;
	
	public Flora() {
		floraList=new ArrayList();
	}
	
	abstract public ArrayList<String> grow(); 
}
