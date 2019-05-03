package cyberCafe;

import javax.swing.JOptionPane;

public class City {
	String name;
	CyberCafe cafe;
	
	public City(String name,CyberCafe cafe) {
		this.name=name;
		this.cafe=cafe;
	}
	
	public void sendMsg(String sms) {
		cafe.receiveMsg(sms);
	}
	
	public void receiveMsg(String sms) {
		String msg="This is "+name+" receving: "+sms;
		JOptionPane.showMessageDialog(null,msg);
	}
	
}
