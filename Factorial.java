import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		int count=1;
		for(int i=1;i<=number;i++)
		{
			count*=i;
			
		}
		System.out.println(count+" the factorial of "+number);
		
	}
}