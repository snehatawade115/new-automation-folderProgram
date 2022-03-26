package javaprogram123;

public class Removralphabet {
	public static void main(String[] args) {
		String s="fdtcg4fyj6hju8hg8bg5";
		String numericstring=" ";
		
		for(int i=0; i<s.length();i++)
		{
			//if(Character.isDigit(s.charAt(i))) //to print number
			if(!Character.isDigit(s.charAt(i)))	//to print charecter
			{
				numericstring=numericstring+s.charAt(i);
			}
		}
		System.out.println(numericstring);
	}
}
