    package task;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;


	public class ans {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Addition obj =new Addition();

		}

	}
	class Addition extends JFrame implements ActionListener
	{
		private static final long serialVersionUID =1L;
		private static final JButton True =null;
		
		JTextField t1 ,t2,t3;
		JButton b,b1,b2,b3,b4;
		JLabel l;
		public Addition()
		{
			t1=new JTextField(10);
			t2=new JTextField(10);
			t3=new JTextField(10);
			
		 l =new JLabel ("answer");
		 b4=new JButton("=");
		 
		 add(t1);
		 add(t2);
		 add(t3);
		 add(l);
		 add(b4);
		 b4.addActionListener(this);
		 
		 setLayout(new FlowLayout());
		 setVisible (true);
		 setSize (500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent event)
		{
	int x=Integer.parseInt(t1.getText());
	int y=Integer.parseInt(t2.getText());
	int z=Integer.parseInt(t3.getText());
	
	int value =x+y-3/z;
	l.setText(value+"");
		}
	}