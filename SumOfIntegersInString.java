package ArrayPrograms;

public class SumOfIntegersInString {
	public static void separatingIntegersFromString(String[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			String str = arr[i];
			char[] ch = str.toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(Character.isDigit(ch[j]))
				{
					int num = Integer.parseInt(ch[j]+"");
					sum = sum+num;
				}
			}
		}
		System.out.println("Sum is "+sum);
	}
public static void main(String[] args) {
	String[] arr = {"2AA","3BB","7CC","5DD", "6EE"};
	separatingIntegersFromString(arr);
}
}
