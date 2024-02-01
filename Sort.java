public class Sort
{
	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{

			for(int j=0; j<arr.length-i; j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
				}
			}

		}
	}

}
