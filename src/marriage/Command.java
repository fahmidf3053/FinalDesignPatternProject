package marriage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Command implements ICommand{
	ICommand executeList;
	ArrayList<ICommand> undoList;
	public Command() {
		undoList=new ArrayList();
	}
	
	public void addCommand(ICommand command) {
		executeList=command;
		undoList.add(command);
	}

	@Override
	public String execute() {
		return executeList.execute();
		
	}

	@Override
	public String undo() {
		int lastIndex = undoList.size() - 1;
		String s="";
		if(lastIndex>-1)
		{
			s=undoList.get(lastIndex).undo();
			undoList.remove(lastIndex);
			return s;
			
		}
		else
		{	
			JOptionPane.showMessageDialog(null,"Nothing to undo!");
			System.out.println("Nothing to undo!");
		}
		
		return s;
	}

}
