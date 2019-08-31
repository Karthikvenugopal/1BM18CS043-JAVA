import java.util.*;
class Matrix
{
    double k[][]=new double[2][2];
    int m,n;
    Matrix()
    {
        for(int i=0;i<2;i++)
	{
	    for(int j=0;j<2;j++)
	    {
	        k[i][j]=0;
	    }
	}
    }
    Matrix(int p,int q)
    {
        m=p;
	n=q;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements of the Matrix");
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        k[i][j]=sc.nextDouble();
	    }
	}
    }
    Matrix(Matrix m1)
    {
	m=m1.m;
	n=m1.n;
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        k[i][j]=m1.k[i][j];
            }
        }
    }
    double determinant()
    {
        return (k[0][0]*k[1][1])-(k[0][1]*k[1][0]);
    }
    void inverse()
    {
        double temp;
	double det=determinant();
	if(det!=0.0)
	{			
	    temp=k[0][0];
	    k[0][0]=k[1][1];
	    k[1][1]=temp;
	    k[0][1]=0-k[0][1];
	    k[1][0]=0-k[1][0];
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
		{
		    k[i][j]=k[i][j]/det;
		}
	    }
	}
	else
	{
	    System.out.println("Inverse can not b determined");
        }
    }
    boolean isSing()
    {
        if(determinant()!=0.0)
	{	
	    return false;
	}
	else 
	{
	    return true;
	}
    }
    void output()
    {
        if(determinant()!=0.0)
        {
            for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            System.out.print(k[i][j]+" ");
		}
		System.out.print("\n");
	    }
	}
     }
}
class Determinant
{
	public static void main(String args[])
	{
	    Matrix m1= new Matrix(2,2);
	    Matrix m2 = new Matrix(m1);
	    double k =m1.determinant();
	    System.out.println("Determinant of the matrix is: " + k);
	    System.out.println("Inverse of the matrix is: ");
	    m1.inverse();
	    m1.output();
	    System.out.println("\nSingularity:\n" + m1.isSing());
        }
}
