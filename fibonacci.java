import java.util.*;
public class fibonacci
	{
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci numbers to be printed");
		int n = sc.nextInt();
		int a=0,b=1,c;
		if(n == 1)
		{
		System.out.println(a);
		}
		else if(n == 2)
		{
		System.out.println(a+"\n"+b);
		}
		else
		{
		System.out.println(a+"\n"+b);
		for(int i = 2;i < n;i++)
		{
		c = a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		}
		}
	}  
	 