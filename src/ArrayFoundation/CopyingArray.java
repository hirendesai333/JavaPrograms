//copying array 

package ArrayFoundation;

public class CopyingArray {
	public static void main(String[] args) {
		//declare a source array 
		char[] sourceArr = {'P','R','E','M','I','X'};
		
		//declare a destination array
		char[] destArr = new char[4];
		
		//copying array using System.arraycopy() method
	    System.arraycopy(sourceArr, 2, destArr, 0, 4); 
	    
	    //printing destination array
	    System.out.println(String.valueOf(destArr));
	    
	}
	
}
