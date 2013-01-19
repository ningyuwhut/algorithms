public class InsertionSort extends Sort
{
	public static void main( String[] args )
	{
		Integer[] array = { 33,55,12,134,12,553,232,564,993,1242,432 };

		sort( array );
		show( array );
	}

	public static void sort( Comparable[] array )
	{
		
		for( int i = 1; i < array.length; ++i )
		{
			for( int j = i-1; j >= 0 ; --j )
			{
				if( compare( array[j], array[j+1] ) > 0 )
				{
					exchange( array, j, j+1 );
				}
				else
					break;
			}
		}
	}
}
