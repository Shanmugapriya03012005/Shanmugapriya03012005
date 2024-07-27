import java.util.Scanner;
public class Gamescore
{
	public static void main(String arg[])
	{
	    System.out.println("enter the game score");
		Scanner s=new Scanner(System.in);
		int score=s.nextInt();
		if(score<50)
		{
			System.out.println("should improve");
		}
		else if(score==50||score>50&&score<70)
		{
			System.out.println("Great Job!!");
		}
		else
		{
			System.out.println("Excellent");
		}
	}
}
		