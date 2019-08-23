import java.util.*;
class EMPLOYEE
{
  String Employee_Number, name;
  double basic,da,IT,netsal,gross;
  void read()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee name");
    name = sc.nextLine();
    System.out.println("Enter the Employee number");
    Employee_Number = sc.nextLine();
    System.out.println("Enter the Basic salary");
    basic = sc.nextDouble();
   }
   void cal()
   {
   da = 75*basic/100;
   gross = basic + da;
   IT = (30*gross)/100;
   netsal = basic + da - IT;
   }
   void display()
   {
   System.out.println("Employee name: " + name);
   System.out.println("Employee number: " + Employee_Number);
   System.out.println("Employee DA: " + da); 
   System.out.println("Employee BASIC: " + basic);
   System.out.println("Employee IT: " + IT);
   System.out.println("Employee net salary: " + netsal);
   }
}
class Emp
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees");
    int n = sc.nextInt();
    EMPLOYEE[] E =  new EMPLOYEE[n];
    for(int i=0;i<n;i++)
    {
      E[i] = new EMPLOYEE();
      E[i].read();
      E[i].cal();
      E[i].display();
     }
   }
} 
   
