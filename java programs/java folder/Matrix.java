import java.util.Scanner;
class Matrix {
	public static void Mrevers(int[][] m){

		int[][] n = new int[3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				n[i][j] = m[j][i];
			}

		}

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int matrix[][] =  { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}};
		Mrevers(matrix);
	}
}