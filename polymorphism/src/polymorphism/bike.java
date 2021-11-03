package polymorphism;

public class bike 
{
	
		void run()
		{
			System.out.println("Running");
		
	}
		public bike() 
	{
		class Splindor extends bike
		{
		void run()
		{
			System.out.println("Running is safetly with 60km");
		}
	}
	}

	public static void main(String[] args) 
	{
		bike a=new bike();
		a.run();
		Splindor b=new Splindor();
		b.run();
}

}


