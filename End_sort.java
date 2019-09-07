import java.util.*;
public class End_sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        int[] a = new int[100];
        int count = 0;
        int flag=1;
        System.out.println("Enter the elements of the list");
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int temp;
        while(flag == 1)
        {
            for(int j = 1;j<n;j++)
            {
                if(a[j]>max)
                {
                    max = a[j];
                }
                if(n==1)
                {
                    flag = 0;
                    break;
                }
            }
            temp = a[n-1];
            a[n-1] = max;
            max = temp;
            n = n-1;
            max = a[0];
            count = count + 1;
        }
        System.out.println("Number of steps required for sorting is " + count);
    }
}
