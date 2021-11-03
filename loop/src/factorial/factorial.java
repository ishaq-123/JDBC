package factorial;

public class factorial 
{
public static void main(String[] args) 
	{
	int n=5;
	int fact=n;
	for (int x=(n-1);x>1;x--)
	{
		fact=fact*x;
	}
	System.out.println("Factorial of "  +n+  " is " + fact);
}
}

