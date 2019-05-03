package islandStructure;

import java.util.ArrayList;

public class DesertFauna extends Fauna{
	public DesertFauna() {
		faunaList.add("sad.gif");
		faunaList.add("sad1.gif");
		faunaList.add("sad2.gif");
	}
	
	@Override
	public ArrayList<String> grow() {
		// TODO Auto-generated method stub
		return faunaList;
	}
}
