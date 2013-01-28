import java.lang.Math;

public class MergeSortBU extends Sort
{
	public static void main(String[] args)
	{
		Integer[] array = {1,99,12,432,123,231,443,22,98,2323,98,932,11,32,392,4,221,99,28};
		sort( array );
		check( array );
		show( array );
	}

	public static void sort( Comparable[] array )
	{
		int length = array.length;
		Comparable[] auxiliary = new Comparable[length];

		for( int l = 1; l < length; l = l + l )
		{
			for( int i = 0; i < length - l; i = i+l+l )
			{
				merge( array, auxiliary, i, i+l-1, Math.min(i+l+l-1, length-1) );
			}
		}
	}

	private static void merge( Comparable[] array, Comparable[] auxiliary, int low, int mid, int high )
	{
		int length = array.length;
		int i = low;
		int j = mid + 1;

		for( int k = low; k <= high; ++k )
		{
			if( i > mid ) 
				auxiliary[k] = array[j++];
			else if( j > high )
				auxiliary[k] = array[i++];
			else if( compare( array[i], array[j] ) > 0 )
				auxiliary[k] = array[j++];
			else 
				auxiliary[k] = array[i++];
		}

		for( int k = low; k <= high; ++k )
			array[k] = auxiliary[k];
	}
}
