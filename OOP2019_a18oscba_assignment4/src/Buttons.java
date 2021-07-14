import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Buttons implements ActionListener {
	private JButton restart;
	static JButton box[] = new JButton[9]; 
	Players players = new Players();
	Victory victory = new Victory();
	
	
	public Buttons() {
		
		
       generateButtons();

	}
	private void generateButtons() {
		  for(int i = 0; i <= 8; i++) //the create loop
	        {
	        	box[i] = new JButton("");
	            box[i].setText("");
	            box[i].addActionListener(this);
	            box[i].setEnabled(true);
	        }
	}
	  
	
	public JButton getButtons(int index) {
		return box[index];
	}//send JButton to the "place out" loop in window
	

	public JButton reset() {
		restart = new JButton("Restart");
		restart.addActionListener(this);
		return restart; //add the reset button
	}
	 private void resetButtons()
	    {
	        for(int i = 0; i <= 8; i++)
	        {
	            box[i].setText("");
	            box[i].setEnabled(true);
	        }
	    }
	
	
	 @Override
		public void actionPerformed(ActionEvent e) {
		 JButton clicked = (JButton)e.getSource();
		  if(e.getSource() != restart){
	        	if(players.playerTurn% 2 == 0) { //Get X or O on click depending on turn
		            
	             clicked.setText(players.getPlayer1());
		            players.playerTurn++;
		          clicked.setEnabled(false);
		           
		        }else {
		            clicked.setText(players.getPlayer2());
		            players.playerTurn++;
		          clicked.setEnabled(false);
		        	}          
	         	}else if(e.getSource() == restart) {
	         	resetButtons();
	         	players.playerTurn = 0;
	         	
	         }
		////////////////////////////////////////////////////////////////////////////
		  if(victory.checkIfWin() == true) // win or draw statements
          {
              JOptionPane.showMessageDialog(null, "Game Over");
              resetButtons();
              players.playerTurn = 0;
          }
		  if(players.playerTurn == 9) {
			  JOptionPane.showMessageDialog(null, "Draw");
			  players.playerTurn = 0;
			 
		  }
	        
		  
		}
	
	 
}
