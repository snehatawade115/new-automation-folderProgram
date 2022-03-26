package javaprogram123;

public class CarOccarance {
	public static void main(String[] args) {
		String s="Java is a Programming language";
		
		int totalCount=s.length();
		int tremoveCount=s.replace("a", "").length();
		int count=totalCount-tremoveCount;
		System.out.println("mynew value="+ count);
	}
}


