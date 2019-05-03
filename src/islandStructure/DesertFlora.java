package islandStructure;

import java.util.ArrayList;

public class DesertFlora extends Flora{
	public DesertFlora() {
		floraList.add("desert.png");
		floraList.add("strom.gif");
	}
	@Override
	public ArrayList<String> grow() {
		// TODO Auto-generated method stub
		return floraList;
	}
	

}
