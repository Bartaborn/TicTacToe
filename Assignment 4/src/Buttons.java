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
		  for(int i = 0; i <= 8; i++)
	        {
	        	box[i] = new JButton("");
	            box[i].setText("");
	            box[i].addActionListener(this);
	            box[i].setEnabled(true);
	        }
	}
	  
	
	public JButton getButtons(int index) {
		return box[index];
	}
	

	public JButton reset() {
		restart = new JButton("Restart");
		restart.addActionListener(this);
		return restart;
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
	        	if(Players.playerTurn% 2 == 0) {
		            
	             clicked.setText(players.getPlayer1());
		            Players.playerTurn++;
		          clicked.setEnabled(false);
		           
		        }else {
		            clicked.setText(players.getPlayer2());
		            Players.playerTurn++;
		          clicked.setEnabled(false);
		        	}          
	         	}else if(e.getSource() == restart) {
	         	resetButtons();
	         	Players.playerTurn = 0;
	         	
	         }
		////////////////////////////////////////////////////////////////////////////
		  if(victory.checkIfWin() == true)
          {
              JOptionPane.showMessageDialog(null, "Game Over");
              resetButtons();
              Players.playerTurn = 0;
          }
		  if(Players.playerTurn == 9) {
			  JOptionPane.showMessageDialog(null, "Draw");
			  Players.playerTurn = 0;
		  }
	        
		  
		}
	
	 
}
