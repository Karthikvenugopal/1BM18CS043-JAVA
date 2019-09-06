import java.util.*;
class Account
{
   String name, cno;
   double bal;
   void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the customer");
      name =  sc.nextLine();
      System.out.println("Enter the customer number");
      cno =  sc.nextLine();
      System.out.println("Enter balance");
      bal = sc.nextDouble();
   }
   void display()
   {
      System.out.println("Name: " + name);
      System.out.println("Customer number: " + cno);
      System.out.println("Balance: " + bal);
   }
}
class Sb extends Account
{
   double rate;
   int n,time;
   void input()
   {
      super.input();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rate of interest");
      rate = sc.nextInt();
      System.out.println("Enter time");
      time = sc.nextInt();
   }
   double compute()
   {
      return (bal*time*rate/100);
   }
   void output()
   {
      display();
      System.out.println("Interest: " + compute());
   }
}
class inheritance
{
   public static void main(String args[])
   {
      Sb s = new Sb();
      s.input();
      s.output();
   }
}
