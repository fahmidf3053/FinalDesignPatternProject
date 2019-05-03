package cyberCafe;

import javax.swing.JOptionPane;

public class SoftwareEng {
	String name;
	CyberCafe cafe;
	
	public SoftwareEng(String name,CyberCafe cafe) {
		this.name=name;
		this.cafe=cafe;
	}
	
	public void sendMsg(String sms) {
		cafe.sendMsg(sms);
	}
	
	public void receiveMsg(String sms) {
		String msg="This is "+name+" receving: "+sms;
		JOptionPane.showMessageDialog(null,msg);
	}
}
