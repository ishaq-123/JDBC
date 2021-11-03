package form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
	public class creatform 
	{
	  public static void main(String args[])  
		    {  
		    JFrame f= new JFrame("TextField Example");  
		    JTextField t1,t2,t3,t4,t5;  
		    t1=new JTextField("Product_id");  
		    t1.setBounds(50,100, 200,30); 
		    
		    t2=new JTextField("Product_name");  
		    t2.setBounds(50,150, 200,30);  
		    
		    t3=new JTextField("Product_category");  
		    t3.setBounds(50,200, 200,30);  
		    
		    t4=new JTextField("Product_price");  
		    t4.setBounds(50,250, 200,30);
		    
		    t5=new JTextField("Product_Expiray_Date");  
		    t5.setBounds(50,300, 200,30);  
		    
		    f.add(t1); f.add(t2);f.add(t3);f.add(t4);f.add(t5);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    }  
		    }  

