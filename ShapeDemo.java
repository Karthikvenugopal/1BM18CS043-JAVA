import java.util.*;
abstract class Shape
{
   int l,b;
   abstract void printArea();
}
class Rectangle extends Shape
{
   void printArea()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length and breadth");
      l = sc.nextInt();
      b = sc.nextInt();
      System.out.println("Area = " + l*b);
   }
}
class Triangle extends Shape
{
   void printArea()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length and height");
      l = sc.nextInt();
      b = sc.nextInt();
      System.out.println("Area = " + ((l*b)/2.0));
   }
}
class Circle extends Shape
{
   void printArea()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius");
      l = sc.nextInt();
      b = 0;
      System.out.println("Area = " + (3.14*l*l));
   }
}
class ShapeDemo
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Shape ref = null;
      System.out.println("Enter 1 for rectangle");
      System.out.println("Enter 2 for triangle");
      System.out.println("Enter 3 for circle");
      int c = sc.nextInt();
      switch(c)
      {
         case 1: ref = new Rectangle();
                 ref.printArea();
                 break;
         case 2: ref = new Triangle();
                 ref.printArea();
                 break;
         case 3: ref = new Circle();
                 ref.printArea();
                 break;
      }
  }
}        
