package javaprogram123;

public class DuplicateArryFind {
	public static void main(String[] args) {
		String arr[]= {"apple","mango","cake","mango","milk","cake"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate value=" +arr[i]);
				}
			}
		}
	}
}
