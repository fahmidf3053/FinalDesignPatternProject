package main;

import java.awt.Graphics2D;

public class Singleton {
	
	 private static Singleton single_instance = null; 
	  
	    public Graphics2D g2d; 
	  
	    private Singleton() 
	    { 
	       g2d=null; 
	    } 
	  
	    public static Singleton getInstance() 
	    { 
	        if (single_instance == null) 
	            single_instance = new Singleton(); 
	  
	        return single_instance; 
	    }
	    
	    public void setg(Graphics2D g2d) {
	    	this.g2d=g2d;
	    }
	
}
