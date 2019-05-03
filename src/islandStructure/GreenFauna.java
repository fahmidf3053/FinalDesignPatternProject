package islandStructure;

import java.util.ArrayList;

public class GreenFauna extends Fauna{
	
	public GreenFauna() {
		faunaList.add("happy.gif");
		faunaList.add("happy1.gif");
		faunaList.add("happy2.gif");
	}
	
	@Override
	public ArrayList<String> grow() {
		// TODO Auto-generated method stub
		return faunaList;
	}

}
