/*********************************************************************
 Author    : Luc Gaupin 
 Course    : 2021 Summer COP3804
 Professor : Michael Robinson 
 Program # : 1
 Program Purpose/Description: learn how to use 2D arrays, as well as display a 2d array data

 Due Date  : 06/04/2021 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Luc Gaupin }..........
*********************************************************************/

public class GaupinLPgm1 
{
	public static void arrays( int numbers2d[][], int row, int col, int x, int y, int sum )
	{
		System.out.println( "\n\nProcessing 2D Array..." );
		for( x = 0; x < row; x++ ) //process rows
		{
			for( y = 0; y < col; y++ ) //process columns
			{
				numbers2d[x][y] = ( (x + y) * 3); //load array with data
			}
		}
	}// end public static void process2dArray( int numbers2d[][], int row, int col, int x, int y )
	
	public static void displayArray( int numbers2d[][], int row, int col, int x, int y, int sum )
	{
		System.out.println( "\nDisplaying 2D Array..." );
		for( x = 0; x < row; x++ ) //process rows
		{
			for( y = 0; y < col; y++ ) //process columns
			{
				if ( ((x + y) * 3) < 15 ) //test for variable width
				{
					System.out.printf( "" ); //display space
				}
				System.out.printf( "%4d", numbers2d[x][y] ); //display 2d array data 
			}
			System.out.println( ); //display line feed
		}
	}// end public static void displayArray( int numbers2d[][], int row, int col, int x, int y, int sum )
	
	public static void arraySum( int numbers2d[][], int row, int col, int x, int y, int sum )
	{
		System.out.println( "\n\nAdding Up 2D Array Data..." );
		
		System.out.println( "\nDisplaying 2D Array Added Data..." );
		for( x = 0; x < row; x++ ) //process rows
		{
			for( y = 0; y < col; y++ ) //process columns
			{
				sum = sum + numbers2d[x][y]; //adds up 2d array data
			}
		}
		System.out.printf( "The Added Data Is: %d", sum ); //display 2d array data
	}// end public static void arraySum( int numbers2d[][], int row, int col, int x, int y, int sum )

	public static void main( String[] args ) 
	{
		// variable declaration
		int row = 15, col = 15;
		int x = 0, y = 0;
		int sum = 0;
		
		// 2d array declaration
		int numbers2d[][] = new int[ row ][ col ];
		
		// call array(), displayArray(), and arraySum() method to run the program
		arrays( numbers2d, row, col, x, y, sum );
		displayArray( numbers2d, row, col, x, y, sum );
		arraySum( numbers2d, row, col, x, y, sum );

		System.out.printf("\n\nMy Name Is: Luc Gaupin\n");
    } //end public static void main( String[] args )
}// end public class GaupinLPgm1 
