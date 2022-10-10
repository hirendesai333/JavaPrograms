//2D Array
package MatrixPrograms;

public class MultidimensionalArray {
	public static void main(String[] args) {
		//declare 2d array
		int[][] multiArr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//printing array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multiArr[i][j]+" ");
			}
			System.out.println("");
			
		}
		
	}
}
