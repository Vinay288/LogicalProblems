import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		System.out.println("enter the value for rows and column of the array");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		Object[][] array=new Object[row][column];
		System.out.println("enter "+ (row*column)+" values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++ ) {
				array[i][j]=s.next();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++ ) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}