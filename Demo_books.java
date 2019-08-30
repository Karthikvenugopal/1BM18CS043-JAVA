import java.util.*;
public class Book
{
     String name,author;
     int price,num_pages;
     
     Book()
     {
         name = null;
         author = null;
         price = 0;
         num_pages = 0;
     }
     void input()
     {
         System.out.println("Enter the name of the book, the author, the price and number of pages \n");
         Scanner sc = new Scanner(System.in);
         name = sc.nextLine();
         author = sc.nextLine();
         price = sc.nextInt();
         num_pages = sc.nextInt();
     }
     public String toString()
     {
         return ("Name: " + name + "\nAuthor: " + author + "\nPrice: ₹ " + price + "\nNumber of pages: " + num_pages);
     }
}
public class Demo_books
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n  = sc.nextInt();
        Book b[] = new Book[n];
        for(int i=0;i<n;i++)
        {
            b[i] =  new Book();
            b[i].input();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}
