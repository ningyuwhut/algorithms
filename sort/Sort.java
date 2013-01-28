public class Sort
{
	public static int compare(Comparable a, Comparable b )
	{
		return a.compareTo(b);
	}

	public static void exchange( Comparable[] array, int i, int j )
	{
				Comparable tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
	}

	public static void show( Comparable[] array )
	{
		for( int i = 0; i < array.length; ++i )
			System.out.print( array[i] + " " );
		
	}

	public static void check( Comparable[] array )
	{
		for( int i = 0; i < array.length; ++i )
			assert( compare(array[i], array[i+1]) < 0 );
	}
}
