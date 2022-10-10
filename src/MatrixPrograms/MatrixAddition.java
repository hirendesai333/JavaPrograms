// Addition of 2 metric
package MatrixPrograms;

public class MatrixAddition {
	//creating two metrics
	static int[][] a = {
			{1,2,3},//{a0,a1,a2}
			{3,4,5},//{a3,a4,a5}
			{1,4,5} //{a6,a7,a8}
	};

	static int[][] b = {
			{1,2,3},
			{3,4,5},
			{2,3,1}
	};

	//creating another matrix to store the sum of two metrics
	static int[][] c = new int[3][3];
	public static void main(String[] args) {
		System.out.println("A length: "+a.length);
		System.out.println("B length: "+b.length);
		System.out.println("C length: "+c.length);

		//adding and printing addition of 2 metrics
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
	
}
