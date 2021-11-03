package form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class registration {

		public static void main(String args[])  
		    {  
		    JFrame f= new JFrame("TextField Example");  
	 
		    JLabel t1;  
		   
		    
		    t1=new  JLabel("");  
		    t1.setBounds(50,100, 200,30);  
		    
		    JButton b1=new JButton("Click Here");  
		    b1.setBounds(50,150,150,30);  
		    
		    
		    b1.addActionListener(new ActionListener()
		    {  
		    	public void actionPerformed(ActionEvent e){  
		    	            t1.setText("Welcome to Javatpoint.");  
		    	        }  
		    	    });  
  
	    
		    f.add(t1); 
 
		    f.add(b1);

		    
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    
		    }  
		    
		      

	

}
