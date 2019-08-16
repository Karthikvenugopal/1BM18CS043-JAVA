import java.util.*;
class Rectangle
{
int l,b,area;

void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length and breadth");
l = sc.nextInt();
b = sc.nextInt();
}
void calculate()
{
area = l*b;
}
void output()
{
System.out.println("The area of a rectangle with length " + l + " and breadth " + b + " is " + area);
}
}

class Rarea
{
	public static void main(String args[])
	{
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	r1.input();
	r2.input();
	r1.calculate();
	r2.calculate();
	r1.output();
	r2.output();
	}
}
	
