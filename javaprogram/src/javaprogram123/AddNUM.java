
package javaprogram123;

public class AddNUM {
	public static void main(String[] args) {
	String s="yui2gv81jikjh8tfgg5";
	int digit=0;
	String numericstring=" ";
	
	for(int i=0; i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			numericstring=s.substring(i,i+1);
			digit=digit+Integer.parseInt(numericstring);
		}
	}
	System.out.println(digit);

}
}