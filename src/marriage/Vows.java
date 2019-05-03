package marriage;

public class Vows implements IVows{
	String male,female;
	
	public Vows(String male,String female) {
		this.male=male;
		this.female=female;
	}
	
	public String makeBond() {
		String s="Making Bond between "+male+" and "+female;
		return s;
	}
	
	public String breakBond() {
		String s="Breaking Bond between "+male+" and "+female;
		return s;
	}
	
}
