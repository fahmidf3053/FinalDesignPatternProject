package marriage;

public class MakeBond implements ICommand{
	IVows vow;
	
	public MakeBond(IVows vow) {
		this.vow=vow;
	}

	@Override
	public String execute() {
		return vow.makeBond();
		
	}

	@Override
	public String undo() {
		return vow.breakBond();
		
	}

}
