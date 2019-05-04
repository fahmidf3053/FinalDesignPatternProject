package waterContainer;

import javax.swing.JOptionPane;

public class TakingWater implements IWork{
	IWork work;
	public void doWork(int ammount) {
		if(ammount>500) {
			System.out.println("Taking Water");
			JOptionPane.showMessageDialog(null, "Taking Water");
		}
		
		if(work!=null)
			this.work.doWork(ammount-700);
		
	}
	
	public TakingWater goNext(IWork work) {
		this.work=work;
		return this;
	}
	
	
}
