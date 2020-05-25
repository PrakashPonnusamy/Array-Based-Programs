package ArrayPrograms;

public class BinarySearch {
	public static int findElement(int[] array, int target)
	{
		int n = array.length;
		int first = 0;
		int last = n-1;
		while(first<=last)
		{
			int mid = (	first+last)/2;
			if(array[mid]==target)
			{
				return mid;
			}
			else if(array[mid]<target)
			{
				first = mid+1;
			}
			else  // array[mid]>target
			{
				last = mid=1;
			}
			return -1;
		}
		
		return -1;
	}
public static void main(String[] args) {
	int[] arr = {2,4,5,7,6,8,9};
	int target = 0;
	int result = findElement(arr, target);
	System.out.println(result);
}
}
