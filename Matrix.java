import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
	int m1,n1,m2,n2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the order of matrix A");
	m1 = sc.nextInt();
	n1 = sc.nextInt();
	System.out.println("Enter the order of matrix B");
	m2 = sc.nextInt();
	n2 = sc.nextInt();
	while((m1 != m2)&&( n1 != n2))
	{
	System.out.println("Order of the two matrices are different.");
	System.out.println("Enter the order of matrix A");
	m1 = sc.nextInt();
	n1 = sc.nextInt();
	System.out.println("Enter the order of matrix B");
	m2 = sc.nextInt();
	n2 = sc.nextInt();
	}
	int a[][] = new int[m1][n1];
	int b[][] = new int[m2][n2];
	int sum[][] = new int[m1][n1];
	int diff[][] = new int[m1][n1];
	System.out.println("Enter elements of array A");
	for(int i=0;i<m1;i++)
	{
	for(int j=0;j<n1;j++)
	{
	a[i][j] = sc.nextInt();
	}
	}
	System.out.println("Enter elements of array B");
	for(int i=0;i<m2;i++)
	{
	for(int j=0;j<n2;j++)
	{
	b[i][j] = sc.nextInt();
	}
	}
	System.out.println("Sum matrix");
	for(int i=0;i<m1;i++)
	{
	for(int j=0;j<n1;j++)
	{
	sum[i][j]=a[i][j]+b[i][j];
	System.out.print(sum[i][j] + " ");
	}
	System.out.print("\n");
	}
	System.out.println("Difference matrix");
	for(int i=0;i<m1;i++)
	{
	for(int j=0;j<n1;j++)
	{
	diff[i][j]=a[i][j]-b[i][j];
	System.out.print(diff[i][j] + " ");
	}
	System.out.print("\n");
	}
	}
}
