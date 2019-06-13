import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    // creating matrix1 and taking user input
    int[][] mat1 = new int[row][col];
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	mat1[i][j] = sc.nextInt();
        }
    }
    // creating matrix2 and taking user input
    int[][] mat2 = new int[row][col];
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	mat2[i][j] = sc.nextInt();
        }
    }
    int[][] result = new int[row][col];
    // subtracting mat1 - mat2
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	result[i][j] = mat1[i][j] - mat2[i][j];
        }
    }
    // printing matrix after subtraction
    for(int i = 0; i < row; i++){
    	for(int j = 0; j < col; j++){
        	System.out.print(result[i][j]+" ");
        }
      	System.out.println("");
    }
  }
}