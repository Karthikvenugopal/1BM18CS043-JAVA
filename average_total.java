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
        System.out.println("Results");   
        for (i = 0 ; i < m ; i++)
        { 
            for (j = 0 ; j < n ; j++){
                System.out.println(arr[i][j]+"\t");  
            }
            System.out.println(arr[i][j]+"\t");     
            System.out.println(arr[i][++j]+"\t");  
        }
        System.out.printf("Total");             
        for (j = 0 ; j < n ; j++)
        {
            System.out.println(arr[i][j]);      
        }
        System.out.print("\n");
        System.out.printf("Average");           
        i++;         
        for (j = 0 ; j < n ; j++){
            System.out.println(arr[i][j]);      
        }
    }
}