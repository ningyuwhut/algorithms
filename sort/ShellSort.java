public class ShellSort extends Sort
{
	public static void main(String[] args)
	{
		Integer[] array = { 22,12,443,1233,1234,11,432,4,598,8392,113,44,11};

		sort( array );

		show( array );

	}

	public static void sort( Comparable[] array )
	{
		int length = array.length;
		int interval = 1;

		while( interval < length/3 )
			interval = interval*3 + 1;

		while( interval >= 1 )
		{
			for( int i = interval; i < length; i++ )
			{
				for( int j = i- interval; j >= 0; j-= interval )
				{
					if( compare( array[j], array[j+interval] ) > 0 )
					{
						exchange( array, j, j+interval );
					}
					else
						break;
				}
			}
			interval /= 3;
		}
	}
}
