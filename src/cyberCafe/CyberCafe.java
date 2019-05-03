package cyberCafe;

import java.util.ArrayList;


public class CyberCafe {
	ArrayList<SoftwareEng> softList;
	ArrayList<City> cityList;
	
	
	public CyberCafe() {
		softList=new ArrayList();
		cityList=new ArrayList();
		
		
	}
	
	public void sendMsg(String sms) {
		for(City c:cityList) {
			c.receiveMsg(sms);
		}
	}
	
	public void receiveMsg(String sms) {
		for(SoftwareEng e: softList) {
			e.receiveMsg(sms);
		}
	}
	
	public void addEng(SoftwareEng e) {
		softList.add(e);
	}
	
	public void addCity(City c) {
		cityList.add(c);
	}
	
}
