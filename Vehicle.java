import java.util.*;
class Vehicle 
{
    static String mod, col;
    static int year, tot;
    Vehicle( String mod, String col, int year)
    {
       this.mod = mod;
       this.col = col;
       this.year = year;
    }
    void Output ()
    {
       System.out.println("Car Details");
       System.out.println("Vehicle Model:"+" "+mod+"\nVehicle Year:"+" "+year+"\nVehicle color:"+col);
    }
    static void Tot()
    {
       System.out.println("\nTotal  Number of Cars : " +  Vehicle.tot);
    }
}
class Vehicledemo
{
    public static  void main(String args[])
    {
       System.out.println("Enter the number of  vehicles:");
       Scanner sc = new Scanner (System.in);
       Vehicle.tot = sc.nextInt();
       for( int i = 0;i<Vehicle.tot;i++)
       {
          System.out.println("Enter the vehicle model: ");
          Vehicle.mod = sc.next(); 
          System.out.println("Enter the Year of Manufacturing: ");
          Vehicle.year = sc.nextInt(); 
          System.out.println("Enter the Vehicle  colour: ");
          Vehicle.col = sc.next(); 
          Vehicle ob = new Vehicle(Vehicle.mod,Vehicle.col,Vehicle.year); 
          ob.Output();
       }
       Vehicle ob = new Vehicle(Vehicle.mod,Vehicle.col,Vehicle.year); 
       Vehicle.Tot();
    }
}
