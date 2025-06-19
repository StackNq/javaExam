import java.util.*;
class matrixSumMul{
	public static void main (String [] args){
		System.out.println("Matrix A:");
		matrix a = new matrix();
        int[][] matrixA = a.getinput();
		System.out.println("Matrix A:");
		matrix b = new matrix();
        int[][] matrixB = b.getinput();
		
		if (a.r==b.r && a.c==b.c){
			int [][] sum= new int[a.r][a.c];
			for (int i = 0; i < a.r; i++) {
				for (int j = 0; j < a.c; j++) {
					sum[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}

			System.out.println(" Matrix sum :");
			for (int i = 0; i < a.r; i++) {
				for (int j = 0; j < a.c; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Addition not possible (dimentions must be same)");
		}
		if (a.r==b.c && a.c==b.r){
			int [][] pro= new int[a.r][b.c];
			for (int i = 0; i < a.r; i++) {
				for (int j = 0; j < b.c; j++) {
					for (int k = 0; k < a.c; k++) {
						pro[i][j] += matrixA[i][k] * matrixB[k][j];
					}
				}
			}
			System.out.println(" Matrix product:");
			for (int i = 0; i < a.r; i++) {
				for (int j = 0; j < b.c; j++) {
					System.out.print(pro[i][j] + " ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Multiplication not possible (row and column number of matrix A should be same as column and row number of matrix B respectively)");
		}
	}
}

class matrix{
	int r,c;
	int [][] getinput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row number : ");
		this.r = sc.nextInt();
		System.out.print("Enter column number : ");
		this.c = sc.nextInt();
		int [][] arr= new int[r][c];
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
				System.out.printf("\nEnter value of row %d  column %d: ",i+1,j+1);
                arr[i][j] = sc.nextInt();
            }
        }
		return arr;
	}
}
