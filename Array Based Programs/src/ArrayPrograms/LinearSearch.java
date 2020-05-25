package ArrayPrograms;

public class LinearSearch {
	public static int findElement(int[] array, int target)
	{
		int n = array.length;
		for(int i=0;i<n;i++)
		{
			if(array[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] arr = {2,3,5,6,7,8,9};
	int target = 3;
	int target1 = 5;
	int target2 = 9;
	int result = findElement(arr, target);
	int result1 = findElement(arr, target1);
	int result2 = findElement(arr, target2);
	System.out.println("Target element found at the index is : "+result);
	System.out.println("Target element found at the index is : "+result1);
	System.out.println("Target element found at the index is : "+result2);
}
}
