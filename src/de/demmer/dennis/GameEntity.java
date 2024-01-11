package de.demmer.dennis;

public abstract class GameEntity {
	
	
	private int y;
	private int x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y < 0) {
			System.err.println(y + " ist zu klein. Muss >0 sein.");
			y = 0;
		}
		this.y = y;
	}
	
	
	

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		if(x < 0) {
			System.err.println(x + "ist zu klein. Muss >0 sein.");
			x = 0;
		}
		this.x = x;
	}
	
	public GameEntity(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Should return the type of GameEntity
	 * 
	 * @return Type of GameEntity
	 */
	public abstract String getType();
	

	

}
