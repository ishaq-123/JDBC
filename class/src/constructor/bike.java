package constructor;

public class bike
{
int x;
int y;
	public bike() 
	{
		x=2010;
		y=70;
	}
public static void main(String[] args)
	{
		bike obj=new bike();
		System.out.println("Model "  + obj.x);
		System.out.println("Engine "  + obj.y +"cc");

	}

}
