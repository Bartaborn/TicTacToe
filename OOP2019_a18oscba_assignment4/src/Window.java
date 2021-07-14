import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;



public class Window extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Buttons b = new Buttons();
	
	public Window(String name) {
		super(name);
		Border border = BorderFactory.createLineBorder(Color.RED, 1); // creates a border
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(25,15,10,15));
		contentPane.setLayout(new BorderLayout(0,25));
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		
		JPanel options = new JPanel();
		contentPane.add(options, BorderLayout.NORTH);
		options.setLayout(new FlowLayout(FlowLayout.CENTER));
		options.setBackground(Color.DARK_GRAY);
		options.add(b.reset());
		options.setBorder(border);//add created border
		
		//Design consists of 2 panels in 1 panel(contentPane)
		
		JPanel board = new JPanel();
		contentPane.add(board, BorderLayout.CENTER);
		board.setLayout(new GridLayout(3,3));
		board.setBackground(Color.WHITE);
		board.setBorder(border);
		 for(int i = 0; i <= 8; i++)
	        {
	            
	            board.add(b.getButtons(i));  
	            
	        }//Loop that places out the buttons from the loop that created buttons.
		
	}
	  
	 
	

	
	
}
