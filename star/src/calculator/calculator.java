    package calculator;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;


	public class calculator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Addition obj =new Addition();

		}

	}
	class Addition extends JFrame implements ActionListener
	{
		private static final long serialVersionUID =1L;
		private static final JButton True =null;
		
		JTextField t1 ,t2;
		JButton b,b1,b2,b3;
		JLabel l;
		public Addition()
		{
			t1=new JTextField(10);
			t2=new JTextField(10);
			
		 l =new JLabel ("Result");
		 b=new JButton("+");
		 b1=new JButton("-");
		 b2=new JButton("*");
		 b3=new JButton("/");
		 
		 add(t1);
		 add(t2);
		 add(l);
		 add(b);
		 add(b1);
		 add(b2);
		 add(b3);
		 b.addActionListener(this);//Action Listener is an interface
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 
		 setLayout(new FlowLayout());
		 setVisible (true);
		 setSize (500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent event)
		{
	int n1=Integer.parseInt(t1.getText());
	int n2=Integer.parseInt(t2.getText());
	if (event.getSource()==b)
	{
		int value=n1+n2;
		l.setText(value+"");
		t1.setText("");
		t2.setText("");
		}
	else if (event.getSource()==b1)
	{
		int value=n1-n2;
		l.setText(value+"");
		t1.setText("");
		t2.setText("");
	}
	else if(event.getSource()==b2)
	{
		int value=n1*n2;
		l.setText(value+"");
		t1.setText("");
		t2.setText("");
	}
	else if(event.getSource()==b3)
	{
		float value=n1/n2;
		l.setText(value+"");
		t1.setText("");
		t2.setText("");
	}
		}
	}