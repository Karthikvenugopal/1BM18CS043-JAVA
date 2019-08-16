import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements to be sorted");
	for(int i = 0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n-1;j++)
	{
	if(a[j]>a[j+1])
	{
	int temp = a[j];
	a[j] = a[j+1];
	a[j+1] = temp;
	}
	}
	}
	System.out.println("Sorted array is");
	for(int i = 0;i<n;i++)
	{
	System.out.println(a[i]);
	}
}
}
	