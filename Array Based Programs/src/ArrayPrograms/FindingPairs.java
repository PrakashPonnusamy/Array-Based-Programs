package ArrayPrograms;

public class FindingPairs {
	public static void findPair(int[] array, int target)
	{
		int count = 0;
		int n= array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==target)
				{
					count++;
					System.out.println("Pairs are : "+array[i]+", "+array[j]);
				}
			}
		}
		System.out.println("Number of Pairs are : "+count);
	}
public static void main(String[] args) {
	int[] arr = {2,4,5,6,7,3,4,9,11,1};
	int target = 12;
	findPair(arr, target);
}
}
