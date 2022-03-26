package javaprogram123;

public class Overlod {
public void test(int a) {
	System.out.println("1");
}

public void test(String a) {
	System.out.println("2");
}
public void test(int a, String b) {
	System.out.println("3");
}
public static void main(String[] args) {
	Overlod ov=new Overlod();
	ov.test(10);
	ov.test("sona");
	ov.test(1, "mona");
}
}
