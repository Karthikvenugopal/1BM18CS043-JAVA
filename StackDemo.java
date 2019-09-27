import java.util.*;
interface Stack
{
   void push();
   void pop();
   void display();
   boolean isempty();
}
class StackTest implements Stack
{
   int size = 10;
   int s[] = new int[size];
   int top = -1;
   public void push()
   {
     Scanner sc = new Scanner(System.in);
     if(top == (size-1))
     {
        size += 10;
        int k[] =  new int[size];
        for(int i = 0;i<=top;i++)
        {
           k[i] = s[i];
        }
        s = k;
     }
     System.out.println("Enter the element to be pushed");
     s[++top] = sc.nextInt();
   }
   public void pop()
   {
      if(isempty())
      {
         System.out.println("Stack is empty");
         return;
      }
      System.out.println(s[top--] + " is popped");
   }
   public boolean isempty()
   {
      if(top == -1)
      {
        return true;
      }
       return false;
   }
   public void display()
   {
      if(isempty())
      {
         System.out.println("Stack is empty");
         return;
      }
      System.out.println("Stack contents are");
      for(int i = top;i>=0;i--)
      {
         System.out.println(s[i]);
      }
   }
}
class StackDemo
{
   public static void main(String args[])
   {
      Stack ref = new StackTest();
      int k = 1;
      Scanner sc = new Scanner(System.in);
      while(k!=0)
      {
         System.out.println("Enter 0 to exit");
         System.out.println("Enter 1 to push");
         System.out.println("Enter 2 to pop");
         System.out.println("Enter 3 to display");
         k = sc.nextInt();
         switch(k)
         {
           case 0: break;
           case 1: ref.push();
                   break;
           case 2: ref.pop();
                   break;
           case 3: ref.display();
                   break;
           default: System.out.println("Invalid");
         }
     }
   }
}
