package javaprogram123;

public class Reverstr {
	public static void main(String[] args) {
		
		 String s1="monalisa is cute";
		/*
		 StringBuilder s=new StringBuilder(s1);		
		 s.reverse();
		 System.out.println(s);
		 
		 */ 
		 String rev=" ";
		 
		 for(int i= s1.length()-1; i>=0;i--)
		 {
			 rev=rev+s1.charAt(i);
		
		 }
		 System.out.println(rev);
		
	
	}}
