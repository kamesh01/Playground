import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] matrix = new int[row][col];
    // taking user input
	for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	matrix[i][j] = sc.nextInt();
        }
    }
    int[][] transpose = new int[col][row];
    // making transpose of the matrix
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	transpose[j][i] = matrix[i][j];
        }
    }
    // diplaying the transposed matrix
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	System.out.print(transpose[j][i]+" ");
        }
      	System.out.println("");
    }
  }
}