import java.util.*;

class T1 implements Runnable{
	Thread t;
	T1()
	{
		t = new Thread(this,"T1");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMSCE");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println("BMS thread interrupt");
			}
		}
	}
}
class T2 implements Runnable{
	Thread t;
	T2()
	{
		t = new Thread(this,"T2"); 
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
		
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("BMS thread interrupt");
			}
		}
	}	
}
class Threading
{
	public static void main(String args[])
	{
		T1 ob1 = new T1();
		T2 ob2 = new T2();
	}
}
	
