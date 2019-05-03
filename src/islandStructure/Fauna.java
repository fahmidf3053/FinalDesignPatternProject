package islandStructure;

import java.util.ArrayList;

public abstract class Fauna {
	ArrayList<String> faunaList;
	
	public Fauna() {
		faunaList=new ArrayList();
	}
	
	abstract public ArrayList<String> grow(); 
}
