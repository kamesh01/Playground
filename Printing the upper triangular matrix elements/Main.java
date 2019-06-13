import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    	Scanner sc = new Scanner(System.in);
    	int i,j;
    	int row = sc.nextInt();
    	int col = sc.nextInt();
    	int[][] matrix = new int[row][col];
    	// taking elements to form a matrix
    	for( i = 0; i < row; i++){
        	for( j = 0; j < col; j++){
            	matrix[i][j] = sc.nextInt();
            }
        }
    	upper_mat(matrix, row, col);	// function call
  }
  public static void upper_mat(int[][] mat, int row, int col){
  	int i,j,k;
    for( k = 0; k < col; k++){
    	for( i = 0, j = k; j < col; i++, j++){
        	System.out.print(mat[i][j]+" ");
        }
    }
  }
}