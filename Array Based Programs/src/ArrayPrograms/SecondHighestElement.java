package ArrayPrograms;

import java.util.Arrays;

public class SecondHighestElement {
	public static void findElement(int[] array)
	{
		
		/*Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int n = array.length-1;
		System.out.println(""+array[n-1]);*/
		int highest = 0;
		int secondHighest = 0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>highest)
			{
				highest = array[i];
				secondHighest = highest;
			}
		}
		System.out.println(secondHighest);
	}
public static void main(String[] args) {
	int[] arr={1,5,2,4,9,3,7,55, 55};
	findElement(arr);
}
}
