import java.util.*;
public class Quadratic
	{
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (b*b)-(4*a*c);
		if(d == 0)
		{
		float r = -b/(2*a);
		System.out.println("The roots are real and equal. "+r+" and "+r);
		}
		else if(d>0)
		{
		float r1 = (float)(-b +  Math.sqrt(d))/(2*a);
		float r2 = (float)(-b - Math.sqrt(d))/(2*a);
		System.out.println("The roots are real and distinct. "+r1+" and "+r2);
		}
		else
		{
		System.out.println("The roots are imaginary");
		}
		}
	}
