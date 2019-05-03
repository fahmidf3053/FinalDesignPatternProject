package islandStructure;

public class Factory {
	String reg;
	ICountry country;
	
	public Factory(String reg) {
		this.reg=reg;
	}
	
	public ICountry createCountry() {
			if(reg.equals("myIsland")) {
				country = new Green();
			}
			
			else 
				country = new Desert();
			
			return country;
	}
}
