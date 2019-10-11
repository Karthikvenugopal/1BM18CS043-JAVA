import java.util.*;
class Account
{
    String name, accno;
    char type;
    double bal;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, accno, and balance");
        name = sc.nextLine();
        accno = sc.nextLine();
        bal = sc.nextDouble();
    }
    void output()
    {
        System.out.println("Name: " + name +"\nA/c no: " + accno + "\nAccount type: " + type + "\nBalance: " + bal);
    }
}
class Sav_acc extends Account
{
    double rate,time;
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of interest and time");
        rate = sc.nextDouble();
        time = sc.nextDouble();
    }
    void calc()
    {
    	double b = bal;
        bal = bal * (Math.pow((1 + rate / 100), time));
        System.out.println("Compound interest: " + (bal - b));
    }
    void deposit()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount to be deposited");
       double dep = sc.nextDouble();
       bal = bal + dep;
       System.out.println("Balance: " + bal);
       }
    void withdraw()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the amount to be debited");
    	double deb = sc.nextDouble();
    	if(bal < deb)
    	{
    		System.out.println("Your balance is " + bal + ". " + deb + " cannot be withdrawn.");
    		return;
    	}
    	bal = bal - deb;
    	System.out.println("Balance: " + bal);
    	
    }
    void output()
    {
        super.output();
        System.out.println("Balance: " + bal);
    }
}
class Curr_acc extends Account
{
        void input()
        {
           super.input();
        }
	 void cheque()
        {
    	   Scanner sc = new Scanner(System.in);
       	   System.out.println("Enter the amount on cheque and the name of receiver on the cheque");
    	   double deb = sc.nextDouble();
    	   String debn = sc.nextLine();
    	   if(bal<1000)
    	   {
    	      bal = bal - 500;
    	      System.out.println("Your account balance has fallen below the minimum amount. Rs 500 was debited as fine.");
    	   }
    	   if(bal-500 < deb)
      	   {
    		System.out.println("Your balance is " + bal + ".  Your cheque has bounced.");
    		return;
    	   }
    	   bal = bal - deb;
    	   System.out.println(deb + " was debited to your account and was credited to " + debn);
    	   System.out.println("Balance: " + bal);
        }
	void output()
        {
           super.output();
           System.out.println("Balance: " + bal);
        }
}
	
	
	
	
	
class Bank
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);int k;
	   System.out.println("Enter the account type");
	   char type = sc.next().charAt(0);
	   if(type == 's')
	   {
	      Sav_acc sb = new Sav_acc();
	      sb.input();
	      sb.type = type;
	      sb.calc();
	      
	      while(true)
	      {
	      System.out.println("Enter the 1 to withdraw 2 to deposit 3 to display details 0 to exit");
	       k = sc.nextInt();
	      switch(k)
	      {
	        case 0: System.exit(0);
	        case 1: sb.withdraw();break;
	        case 2: sb.deposit();break;
	        case 3: sb.output();break;
	        default: System.out.println("Invalid input");
	      }
	      }}
	   if(type == 'c')
	   {
	     Curr_acc cb = new Curr_acc();
	     cb.input();
	     cb.type = type;
	     while(true)
	      {
	      System.out.println("Enter the 1 to cheque 2 to display details 0 to exit");
	      k = sc.nextInt();
	      switch(k)
	      {
	        case 0: System.exit(0);
	        case 1: cb.cheque();break;
	        case 2: cb.output();break;
	        default: System.out.println("Invalid input");
	     }
	}}
	}
	}
	
