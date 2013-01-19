public class SelectionSort extends Sort
{
	public static void main(String[] args)
	{
		Integer[] array = { 12,1,233,123,53,1232,553,1423,22 };
		sort( array);
		for( int i = 0; i < array.length; ++i )
			System.out.print( array[i] + " "  );

		String[] string = { "asd", "wer", "werg", "isj", "oowq", "aqe", "ij"};
		sort( string);
		for( int i = 0; i < string.length; ++i )
			System.out.print( string[i] + " " );
	}

	public static void sort(Comparable[] array)
	{
		int length = array.length;

		for( int i = 0; i < length; ++i )
		{
			int min = i;

			for( int j = i+1; j < length; ++j )
			{
				if( compare(array[j], array[min]) < 0  )
					min = j;
			}

			if( min != i )
			{
				exchange( array, i, min );
			}
		}
	}

}
