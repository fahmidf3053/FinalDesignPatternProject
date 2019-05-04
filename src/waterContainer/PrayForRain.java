package waterContainer;

import javax.swing.JOptionPane;

public class PrayForRain implements IWork{
	IWork work;
	
	public void doWork(int ammount) {
		if(ammount<500) {
			System.out.println("Praying For Water");
			JOptionPane.showMessageDialog(null, "Praying For Water");
		}
		
		if(work!=null)
			this.work.doWork(ammount-700);
		
	}
	
	public PrayForRain goNext(IWork work) {
		this.work=work;
		return this;
	}
}
