package islandStructure;

public class Desert implements ICountry{

	@Override
	public House BuildHouse() {
		House h= new DesertHouse();
		return h;
	}

	@Override
	public Flora createFlora() {
		Flora f=new DesertFlora();
		return f;
	}

	@Override
	public Fauna createFauna() {
		Fauna f=new DesertFauna();
		return f;
	}

}
