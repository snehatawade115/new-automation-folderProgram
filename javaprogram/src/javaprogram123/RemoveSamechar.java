package javaprogram123;

public class RemoveSamechar {
	public static void main(String[] args) {
		String s="programming";
		
		StringBuilder obj= new StringBuilder();
		s.chars().distinct().forEach(c->obj.append((char)c));
		System.out.println(obj);
		
		
	}

}
