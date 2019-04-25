import java.util.Scanner;

public class Lambdas
{
	public static void main(String arr[])
	{
		Lambda sum = (a,b)-> a+b;
		Scanner in = new Scanner(System.in);

		ystem.out.print("Enter a positive integers ");
		int n = in.nextInt();
		int x=0;
		int y=1;
		for(int i=1;i<n;i++)
		{
			System.out.print(x+" ");
			int su=sum.Fibonacci(x,y);
			x=y;
			y=su;
			
		}
	}
}

interface Lambda
{
	int Fibonacci(int a,int b);
}
