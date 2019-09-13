import java.util.*;
class PERSON
{
   String name, address;
   int age;
      
   void accept()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name, age and address of the person");
      name = sc.next();
      age = sc.nextInt();
      address = sc.next();
   }
   void display()
   {
      System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
   }
}
class STUDENT extends PERSON
{
   int rollno, sem;
   void accept()
   {
      super.accept();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rollno and semester of the student");
      rollno = sc.nextInt();
      sem = sc.nextInt();
   }
   void display()
   {
      super.display();
      System.out.println("Rollno: " + rollno + "\nSemester: " + sem);
   }
}
class EXAM extends STUDENT
{
   int marks1,marks2;
   double avg;
   void accept()
   {
      super.accept();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the marks of two subjects");
      marks1 = sc.nextInt();
      marks2 = sc.nextInt();
      calc();
   }
   void calc()
   {
      avg = (marks1+marks2)/2.0;
   }
   void display()
   {
      super.display();
      System.out.println("Average: " + avg);
   }
}
class demo
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int j=0;
       System.out.println("Enter the number of students");
       int n = sc.nextInt();
       EXAM k[] = new EXAM[n];
       double max=0;
       for(int i = 0;i<n;i++)
       {
          k[i] = new EXAM();
          k[i].accept();
          if(max < k[i].avg)
          {
             max = k[i].avg;
             j = i;
          } 
       }
       System.out.println("TOPPER OF THE CLASS IS");
       k[j].display();
   }
}
   
   
