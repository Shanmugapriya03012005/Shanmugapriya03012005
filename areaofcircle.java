import java.util.Scanner;
class area
{
	double pi;
	double r;
	double cal()
	{
		
		return(pi*r*r);
	}
	void setd(double P,double R)
	{
		pi=P;
		r=R;
	
	}
}
public class areaofcircle
{
	public static void main(String arg[])
	{
		area aa=new area();
	    aa.setd(3.14,4);
		System.out.println(aa.cal());
		
		
	}
}
		