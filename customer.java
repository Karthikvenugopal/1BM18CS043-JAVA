import java.util.*;
class customer
{
	Scanner sc=new Scanner(System.in);
	private double number,quantity,price,total_price,discount,net_price;
	private String name;
customer(double n,String name,double  q,double  p,double  tp,double  d,double  np)
{
	number=n;
	name=name;
	quantity=q;
	price=p;
	total_price=tp;
	discount=d;
	net_price=np;
}
void input()
{
	System.out.println("enter the customer number");
	number=sc.nextDouble();
	System.out.println("enter the customer name");
	name=sc.next();
	System.out.println("enter the quantity");
	quantity=sc.nextDouble();
	System.out.println("enter the price");
	price=sc.nextDouble();
 	caldiscount();
}
void caldiscount()
{
	total_price=price*quantity;
	if(total_price>=50000)
	{
		discount=0.25*(total_price);
	}
	else if(total_price>=25000)
	{
		discount=0.10*(total_price);
	}
	else System.out.println("no discount");
	net_price=total_price-discount;
}
void show()
{
	System.out.println("number=" +number);	
	System.out.println("name=" +name);
	System.out.println("quantity=" +quantity);
	System.out.println("net price=" +net_price);
}
}
class demo {
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		customer c=new customer(0,"",0,0,0,0,0);
		c.input();
		c.show();
	}
}
