
public class Victory implements TicTacFace{
	
	private boolean checkNeighbour(int i, int j)
    {
        if (Buttons.box[i].getText().equals(Buttons.box[j].getText()) && !Buttons.box[i].getText().equals("") )
            return true;
        else						//The used funktion to check if a player won
            return false;
    }
	public boolean checkIfWin() //The funktion copy pasted for all scenarios. 
    { // true will trigger the game over window.
        //checks the horizontal scenarios
        if( checkNeighbour(0,1) && checkNeighbour(1,2) ) 
            return true;
        else if( checkNeighbour(3,4) && checkNeighbour(4,5) )
            return true;	
        
        else if (checkNeighbour(6,7) && checkNeighbour(7,8))
            return true;
       
        //checks the vertical win scenarios
        else if ( checkNeighbour(0,3) && checkNeighbour(3,6))
            return true;  
        else if ( checkNeighbour(1,4) && checkNeighbour(4,7))
            return true;
        else if ( checkNeighbour(2,5) && checkNeighbour(5,8))
            return true;
        
        //checks the diagonal win scenarios
        else if ( checkNeighbour(0,4) && checkNeighbour(4,8))
            return true;  
        else if ( checkNeighbour(2,4) && checkNeighbour(4,6))
            return true;
        else 
            return false;
        
        
    }
}
