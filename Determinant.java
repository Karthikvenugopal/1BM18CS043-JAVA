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