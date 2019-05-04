package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import cyberCafe.City;
import cyberCafe.CyberCafe;
import cyberCafe.SoftwareEng;
import inhabitants.Observer;
import inhabitants.People;
import islandStructure.*;
import marriage.Priest;
import waterContainer.*;

public class IITIsland implements IIsland{
	ArrayList<String> floraList;
	ArrayList<String> faunaList;
	
	JFrame frame;
	JPanel panel;
	@Override
	public void goToIsland() {
		Factory factory = new Factory("IIT");
		ICountry country= factory.createCountry();
		Fauna fauna=country.createFauna();
		Flora flora=country.createFlora();
		House house=country.BuildHouse();
		
		floraList= flora.grow();
		faunaList=fauna.grow();
		
		frame = new JFrame("Welcome to IIT");
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 1000, 700);
		frame.getContentPane().add(scrollPane);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension( 700,1240));
		panel.setLayout(null);
		scrollPane.setViewportView(panel);
		
		
//		for(String s: floraList) {
//			System.out.println(s);
//		}
//		for(String s: faunaList) {
//			System.out.println(s);
//		}
		
		
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
//				System.out.println(e.getX() + "," + e.getY());	
//				Graphics2D g2d = (Graphics2D) panel.getGraphics();
//				house.draw(g2d);
				Singleton single=Singleton.getInstance();
				single.setg( (Graphics2D) panel.getGraphics());
				house.draw(single.g2d);
				
			}
		});
		
		
//		g2d.setColor(Color.red);
//		g2d.drawOval(139, 81, 50,50);
		
		JButton collect=new JButton("Collect Water");
		collect.setBounds(565,230,150,30);
		collect.setBackground(Color.gray);
		panel.add(collect);
		
		collect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IWork work=new TakingWater().goNext(new TakingWater().goNext(new PrayForRain()));
				work.doWork(1500);
			}
		});
		
		JButton day = new JButton("Special Day");
		day.setBounds(770,20,150,30);
		day.setBackground(Color.magenta);
		panel.add(day);
		
		day.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Priest priest=new Priest();
			}
		});
		
		
		
		Icon imgIcon1 = new ImageIcon(this.getClass().getResource(floraList.get(0)));
		Icon imgIcon2 = new ImageIcon(this.getClass().getResource(floraList.get(1)));
		Icon imgIcon3 = new ImageIcon(this.getClass().getResource(faunaList.get(0)));
		Icon imgIcon4 = new ImageIcon(this.getClass().getResource(faunaList.get(1)));
		Icon imgIcon5 = new ImageIcon(this.getClass().getResource(faunaList.get(2)));
		
		JLabel lbl1=new JLabel(imgIcon2);
		lbl1.setBounds(0,300,500,350);
		panel.add(lbl1);
		
		JLabel lbl2=new JLabel(imgIcon4);
		lbl2.setBounds(0,351,500,1000);
		panel.add(lbl2);
		
		JLabel lbl3=new JLabel(imgIcon3);
		lbl3.setBounds(701,310,220,300);
		panel.add(lbl3);	
		
		JLabel lbl4=new JLabel(imgIcon1);
		lbl4.setBounds(501,310,180,200);
		panel.add(lbl4);
		
		JLabel lbl5=new JLabel(imgIcon5);
		lbl5.setBounds(500,750,500,300);
		panel.add(lbl5);
		
		
		JInternalFrame frm=new JInternalFrame(("Disaster Monitoring System"),false,false,false,false);
		frm.moveToFront();
        frm.setBounds(1025,11,300,349);
        frm.setVisible(true);
        frm.getContentPane().setLayout(null);
        Icon img = new ImageIcon(this.getClass().getResource("radar.gif"));
        JLabel lab = new JLabel(img);
        lab.setBounds(0, 10, 300, 250);
        JButton btn= new JButton("ALERT");
        btn.setBounds(90, 270, 100, 30);
        btn.setBackground(Color.red);
        btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Observer observer=new Observer();
				People people=new People("Fahmid");
				People people1=new People("Ahmed");
				People people4=new People("Rakib");
				People people5=new People("Fuad");
				People people2=new People("Agent");
				observer.addPeople(people);
				observer.addPeople(people1);
				observer.addPeople(people2);
				observer.addPeople(people4);
				observer.addPeople(people5);
				observer.sendNotification();
			}
		});
        
        
        frm.getContentPane().add(btn);
        frm.getContentPane().add(lab);
        frame.getContentPane().add(frm);
        
        
        JInternalFrame frm2=new JInternalFrame(("Cyber Cafe"),false,false,false,false);
		frm2.moveToFront();
        frm2.setBounds(1025,362,300,350);
        frm2.setVisible(true);
        Icon img1 = new ImageIcon(this.getClass().getResource("cafe.gif"));
        JLabel lab1 = new JLabel(img1);
        lab1.setBounds(0, 10, 300, 250);
        JButton btn1= new JButton("Enter");
        btn1.setBounds(90, 270, 100, 30);
        btn1.setBackground(Color.cyan);
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CyberCafe cafe=new CyberCafe();
				SoftwareEng eng=new SoftwareEng("Fahmid",cafe);
				SoftwareEng eng1=new SoftwareEng("Fuad",cafe);
				SoftwareEng eng2=new SoftwareEng("Rakib",cafe);
				City city=new City("Dhaka",cafe);
				City city1=new City("Chittagong",cafe);
				City city2=new City("Syhlet",cafe);
				cafe.addEng(eng);
				cafe.addEng(eng1);
				cafe.addEng(eng2);
				cafe.addCity(city);
				cafe.addCity(city1);
				cafe.addCity(city2);
				eng.sendMsg("Our island is awsome");
				city.sendMsg("Our city is busy");
				
				
			}
		});
        
        
        frm2.getContentPane().setLayout(null);
        frm2.getContentPane().add(btn1);
        frm2.getContentPane().add(lab1);
        frame.getContentPane().add(frm2);
		
		
		
	}
	

}
