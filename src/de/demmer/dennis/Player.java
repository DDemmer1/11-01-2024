package de.demmer.dennis;

public class Player extends GameEntity{
	
	String name;

	
	
	public Player(String name) {
		super(0,0);
		this.name = name;
	}
	
	
	
	public Player(int x, int y) {
		this("Player");
	}

	public void move() {
		
		
	}



	@Override
	public String getType() {
		return "Player";
	}
	

}
