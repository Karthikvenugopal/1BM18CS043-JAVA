import java.util.*;
class average_total 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students and the number of subjects");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double arr[][] = new double[(m+2)][(n+2)];
        double total, average;
        int i, j;
        for (i = 0 ; i < m ; i++)
            {
            System.out.println("Student " + (i+1));
            total = 0;
            for (j = 0 ; j < n ; j++){
                System.out.println("Enter the Marks in subject " + (j+1));
                arr[i][j] = sc.nextDouble();
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/n;
            arr[i][++j] = average;
        }
        for (j = 0 ; j < n ; j++){
            total = 0;
            for (i = 0 ; i < m ; i++){
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/m;
            arr[++i][j] = average;
        }
        System.out.println("Results\n");
        System.out.print("Student\t\t");
        for(i = 0;i < m;i++)
        {
            System.out.print("Marks" + i + "\t");
        }
        System.out.print("Total\tAverage");
        System.out.println("\n");
        for (i = 0 ; i < m ; i++)
        { 
            System.out.print("Student " + (i+1)+"\t");
            for (j = 0 ; j < n+2 ; j++){
                System.out.print(arr[i][j]+"\t");  
            }
            System.out.println("\n");
        }
        System.out.print("Total \t\t");             
        for (j = 0 ; j < n ; j++)
        {
            System.out.print(arr[i][j]+"\t");      
        }
        System.out.println("\n");
        System.out.print("Average\t\t");           
        i++;         
        for (j = 0 ; j < n ; j++){
            System.out.print(arr[i][j]+"\t");      
        }
        System.out.println("\n");
    }
}
