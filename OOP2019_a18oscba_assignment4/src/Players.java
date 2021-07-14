
public class Players {
	private String player;
	public int playerTurn;
	public Players() {
		
	}
	public String getPlayer1() {
		return this.setPlayer("X");
		
	}
	
	public String getPlayer2() {
		return this.setPlayer("O");
	}
	public String getPlayer() {
		return player;
	}
	private String setPlayer(String player) {
		this.player = player;
		return player;
	}
	
}


