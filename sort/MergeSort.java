public class MergeSort extends Sort
{
	private static Comparable[] auxiliaryArray;

	public static void main( String[] args )
	{
		String[] array = { "E","E","G","M","R","A","C","E","R","T"};
		sort( array );
		show( array );
	}
	public static void sort( Comparable[] array )
	{
		auxiliaryArray = new Comparable[array.length];

		sort( array, 0, array.length-1 );
	}

	private static void sort( Comparable[] array, 
								int low,
								int high
			)
	{
		if( low < high )
		{
			int middle = low + (high-low)/2;

			sort( array, low, middle );
			sort( array, middle+1, high );
			merge( array, low, middle, high );
		}
	}

	private static void merge( Comparable[] array,
								int low,
								int middle,
								int high
			)
	{
		int i = low, j = middle+1;

		for( int k = low; k <= high; ++k )
		{
			if( i > middle ) auxiliaryArray[k] = array[j++];

			else if ( j > high ) auxiliaryArray[k] = array[i++];
			else if( compare( array[i], array[j] ) < 0 )
				auxiliaryArray[k] = array[i++];
			else
				auxiliaryArray[k] = array[j++];
		}

		for( int k = low; k <= high; ++k )
			array[k] = auxiliaryArray[k];
	}
}
