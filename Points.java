import java.util.*;
import java.math.*;
public class Points
{
    int x,y;
    
    Points()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    Points(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Points(Points p)
    {
        x = p.x;
        y = p.y;
    }
    double dist(Points p)
    {
        double ans = Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y),2));
        return ans;
    }
    void display()
    {
        System.out.println("The coordinates of the point is ("+x+", "+y+")");
    }
}
