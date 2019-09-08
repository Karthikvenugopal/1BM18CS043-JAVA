import java.util.*;
class Sort 
{ 
    void sorting(int arr[]) 
    { 
        int n = arr.length; 
        int count = 0;
        for (int i = 0; i < n-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                    count++;
                }
            }
            int temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp; 
        } 
        System.out.println(count);
    }
}
class End_sort
{
    public static void main(String args[]) 
    { 
        Sort ob = new Sort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        } 
        ob.sorting(arr);
    } 
}
