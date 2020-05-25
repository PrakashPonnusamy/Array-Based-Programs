package ArrayPrograms;

public class SeggreagatingZerosAndOnes {
	public static void separatingElements(int[] array)
	{
		int n = array.length;  // 0,1,0,1,0,1,0,1
		int j = 0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				array[j++]=array[i];
			}
		}
		while(j<n)
		{
			array[j++]=1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]);
		}
		
	}
public static void main(String[] args) {
	int[] arr = {0,1,0,1,0,1,0,1};
	separatingElements(arr);
}
}
