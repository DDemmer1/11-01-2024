package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		
		GameEntity[][] board = new GameEntity[10][8];
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = new GameField(j, i);
			}
		}
		
	
		
		Player player = new Player("Player");
		
		
		player.setX(-8);
		player.setY(-4);
		
		board[player.getY()][player.getX()] = player;
		
		for (int i = 0; i < board.length; i++) {
			
			for (int j = 0; j < board[i].length; j++) {
				
				if(board[i][j] instanceof Player) {
					System.out.print(" X ");
				} else {
					System.out.print(" - ");
				}
				
				
				
			}
			
			System.out.println();
			
			
		}
		
		
		
		
	}

}
