package inhabitants;

import java.util.ArrayList;

public class Observer {
	ArrayList<People> peopleList;
	
	public Observer() {
		peopleList=new ArrayList();
		
	}
	
	public void sendNotification() {
		for(People p: peopleList) {
			p.getNotification();
		}
	}
	
	public void addPeople(People p) {
		peopleList.add(p);
	}
	
	public void removePeople(People p) {
		peopleList.remove(p);
	}
	
}
