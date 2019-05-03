package islandStructure;

import java.util.ArrayList;

public class GreenFlora extends Flora{
	
	public GreenFlora() {
		floraList.add("green.gif");
		floraList.add("waterfall.gif");
	}
	@Override
	public ArrayList<String> grow() {
		// TODO Auto-generated method stub
		return floraList;
	}
	
}
