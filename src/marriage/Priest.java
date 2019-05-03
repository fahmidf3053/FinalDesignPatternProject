package marriage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Priest {
	public Priest() {
		JFrame frame=new JFrame();
		frame.setTitle("Marriage Ceremony");
		frame.setBounds(250, 250, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Command command=new Command();
		JTextField male=new JTextField();
		male.setBounds(50, 10, 300, 30);
		frame.getContentPane().add(male);
		
		JTextField female=new JTextField();
		female.setBounds(50, 41, 300, 30);
		frame.getContentPane().add(female);
		
		JLabel lbl=new JLabel("");
		lbl.setBounds(50, 110, 300, 50);
		
		JButton btn = new JButton("Make Bond");
		btn.setBounds(50, 75, 100, 30);
		frame.getContentPane().add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=male.getText();
				String b=female.getText();
				
				Vows vow=new Vows(a,b);
				String result=vow.makeBond();
				lbl.setText(result);
				command.addCommand(new MakeBond(vow));
				
			}
		});
		
		JButton btn1 = new JButton("Undo");
		btn1.setBounds(200, 75, 100, 30);
		frame.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				String result=command.undo();
				lbl.setText(result);
				
			}
		});
		
		frame.getContentPane().add(lbl);
		
	}
}
