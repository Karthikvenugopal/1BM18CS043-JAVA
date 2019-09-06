import java.util.*;
class Queuedemo
{
   int q[];
   int f,r,n;
   Queuedemo(int n)
   {
      this.n = n;
      q= new int[n];
      f=-1;r=-1;
   }
   void enqueue(int a)
   {
      if(r == n-1)
      {
         System.out.println("Queue overflow");return;
      }
      if(f == -1)
      {
         f = 0;
      }
      q[++r] = a;
    }
    int dequeue()
    {
       if(f>r)
       {
          System.out.println("Queue underflow");
          return -9999;
       }
       return q[f++];
    }
    void display()
    {
       if(f>r)
       {
          System.out.println("Queue is empty");return;
       }
       System.out.println("Contents of the queue are");
       for(int i =f;i<=r;i++)
       {
          System.out.println(q[i]);
       }
    }
}
class Queue
{
   public static void main(String args[])
   {
      Queuedemo qu = new Queuedemo(10);
      int f = 1;
      Scanner sc = new Scanner(System.in);
      while(f != 0)
      {
        System.out.println("Enter 0 to exit \nEnter 1 to enqueue\nEnter 2 to dequeue\nEnter 3 to display");
        f = sc.nextInt();
        switch(f)
        {
          case 0: break;
          case 1: System.out.println("Enter the number to be input");
                  int a = sc.nextInt();
                  qu.enqueue(a);
                  break;
          case 2: int j = qu.dequeue();
                  if(j == -9999)
                  {
                    break;
                  }
                  System.out.println("Deleted element is " + j);
                  break;
          case 3: qu.display();
                  break;
          default: System.out.println("Invalid option");
        }
      }
   }
}
          
                   
