package javaprogram123;

public class Reverseword {
	public static void main(String[] args) {
		String s="my name sona";
		String[] Splitvalue= s.split(" ");
		
		
		int size= Splitvalue.length-1;		
		for(int i=size; i>=0;i--) {
		
		System.out.print(Splitvalue[i]+" ");
}
}
	}