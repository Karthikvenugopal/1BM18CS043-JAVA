import java.util.*;
class Maximum
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the elements of the matrix");
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int max = a[0][0];
		for(int x[]: a){
			for(int y: x){
			if(max < y){
				max = y;
			}
		}
	}
		System.out.println("Maximum element = " + max);
		}
}

	
	