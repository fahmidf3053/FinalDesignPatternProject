package main;

public class Plane {
	private IIsland island;
	
	public Plane(IIsland island) {
		
		this.island=island;
		
	}
	
	public void startPlane() {
		island.goToIsland();
	}
}
