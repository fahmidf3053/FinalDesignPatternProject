package islandStructure;

public class Green implements ICountry{

	@Override
	public House BuildHouse() {
		House h= new GreenHouse();
		return h;
	}

	@Override
	public Flora createFlora() {
		Flora f=new GreenFlora();
		return f;
	}

	@Override
	public Fauna createFauna() {
		Fauna f= new GreenFauna();
		return f;
	}

}
