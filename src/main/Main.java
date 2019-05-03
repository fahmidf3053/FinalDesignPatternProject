package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Main {

	private JFrame frmControlPanel;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmControlPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frmControlPanel = new JFrame();
		frmControlPanel.getContentPane().setBackground(new Color(0, 0, 0));
		frmControlPanel.setBackground(Color.GREEN);
		frmControlPanel.setTitle("Control Panel");
		frmControlPanel.setBounds(100, 100, 672, 398);
		frmControlPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlPanel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Where you want to go?");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(6, 88, 190, 57);
		frmControlPanel.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxMyIsland = new JCheckBox("My Island");
		chckbxMyIsland.setBounds(6, 182, 97, 23);
		frmControlPanel.getContentPane().add(chckbxMyIsland);
		
		JCheckBox chckbxIit = new JCheckBox("IIT Island");
		chckbxIit.setBounds(6, 232, 97, 23);
		frmControlPanel.getContentPane().add(chckbxIit);
		
//		URL img = this.getClass().getResource("giphy.gif");
//		System.out.println(img);
//		Icon icon = new ImageIcon(img);	
		
		Icon imgIcon = new ImageIcon(this.getClass().getResource("giphy.gif"));
		
		JLabel lblNewLabel_1 = new JLabel(imgIcon);
//		BufferedImage travel = ImageIO.read(new File("C:\\Users\\AGENTF3053\\Desktop\\java\\projectDP\\src\\main\\giphy.gif"));
//		lblNewLabel_1.setIcon(new ImageIcon(travel));
		lblNewLabel_1.setBounds(206, 0, 450, 359);
		frmControlPanel.getContentPane().add(lblNewLabel_1);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxMyIsland.isSelected())	
				{	
					Plane plane= new Plane(new MyIsland());
					plane.startPlane();
//					frmControlPanel.setVisible(false);
				}
				
				if(chckbxIit.isSelected())
				{	
					Plane plane= new Plane(new IITIsland());
					plane.startPlane();
//					frmControlPanel.setVisible(false);
				}
				if(!(chckbxMyIsland.isSelected()||chckbxIit.isSelected())){
					JOptionPane.showMessageDialog(frmControlPanel, "You must select minimum one item");
				
				}
			}
		});
		btnGo.setBackground(new Color(0, 255, 0));
		btnGo.setBounds(10, 290, 89, 23);
		frmControlPanel.getContentPane().add(btnGo);
	}
}
