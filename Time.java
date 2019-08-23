import java.util.*;
class Time_class
{
  int h,m,s;
  Time_class()
  {
  h=0;
  m=0;
  s=0;
  }
  Time_class(int h,int m,int s)
  {
  this.h = h;
  this.m = m;
  this.s = s;
  }
  void advance(int a,int b,int c)
  {
  h += a;
  m += b;
  s += c;
  while(s>=60)
  {
  s-=60;
  m=m+1;
  }
  while(m>=60)
  {
  m-=60;
  h=h+1;
  }
  while(h>=24)
  {
  h=h-24;
  }
  }
  void reset(int a,int b,int c)
  {
  h=a;
  m=b;
  s=c;
  }
  void output()
  {
  System.out.println("The current time is " + h + ":" + m + ":" + s);
  }
}
class Time
{
   public static void main(String args[])
   {
      Time_class t = new Time_class();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the current time");
      t.h = sc.nextInt();
      t.m = sc.nextInt();
      t.s = sc.nextInt();
      int k = 1;
      while(k!=0)
      {
        System.out.println("Enter 1 to advance");
        System.out.println("Enter 2 to output");
        System.out.println("Enter 3 to reset");
        System.out.println("Enter 0 to exit");
        k = sc.nextInt();
        
        switch(k)
        {
          case 0: break;
          case 1: System.out.println("Enter the time to be advanced");
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();
                  t.advance(a,b,c);
                  break;
          case 2: t.output();
                  break;
          case 3: System.out.println("Enter the new time");
                  int d = sc.nextInt();
                  int e = sc.nextInt();
                  int f = sc.nextInt();
                  t.reset(d,e,f);
                  break;
          default: System.out.println("Invalid entry");
        }
      }
    }
}
