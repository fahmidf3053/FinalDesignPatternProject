package marriage;

public class BreakBond implements ICommand{
	IVows vow;
	
	public BreakBond(IVows vow) {
		this.vow=vow;
	}

	@Override
	public String  execute() {
		return vow.breakBond();
		
	}

	@Override
	public String undo() {
		return vow.makeBond();
		
	}
}
