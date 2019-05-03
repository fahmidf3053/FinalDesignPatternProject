package inhabitants;

import javax.swing.JOptionPane;

public class People {
	String name;
	
	public People(String name) {
		this.name=name;
	}
	
	public void getNotification() {
		String sms="Alert Notification to "+name;
		JOptionPane.showMessageDialog(null, sms);
	}
}
