/**
 * 
 */

/**
 * @author Adrien
 *
 */
import java.util.Scanner;
public class Art {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		int numRows, r, i, a, b , c;
		System.out.println("Enter number of rows : ");
		numRows = key.nextInt();//numRows = 3
		for (r = 1 ; r <= numRows; r++)
		{  
			for (i = 0; i<= numRows -r; i++)
				System.out.print("*");
			
			for (i = 1; i <= r ; i++ )
				System.out.print(" ");
			
		System.out.println();
		}
		
		System.out.println("Enter value of a :");
		a = key.nextInt();//a = 3
		for(r = 1; r <= a; r++)
		{
			for(i = 2 ; i <= a - r; i++)
				System.out.print(" ");
			
					System.out.print(" ");
			for( i = 1; i <= r ; i++ )
				System.out.print("*");
			
			for(i=2 ; i == r; i++ )
			    System.out.print("*");
		System.out.println();	
			
		}
		
		b = 5 ;  
			System.out.println();
		for (r = 1; r <=b; r++ )
		{c = 1 ;
			for (i = 0; i <= b-r ; i++)
				System.out.print(c++);
			
		System.out.println();
			
		}

	}

}
