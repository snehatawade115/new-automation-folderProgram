package javaprogram123;

public class B extends A{
	public void test() {
		System.out.println("test");
	}
	public void home() {
		System.out.println("home");
	}
	public void car() {
		System.out.println("car");
	}
	public void marry() {
		System.out.println("marry");
	}
	public void lion() {
		System.out.println("lion");
	}
	public void show() {
		System.out.println("show");
	}
	
	public static void main(String[] args) {
	/*	B b=new B();
		b.car();
		b.home();
		b.marry();
		b.test();
		b.fly();
		b.monkey();
		b.lion();
		
		A a1=new A();
		a1.car();
		a1.marry();
		a1.test();
		a1.fly();
		a1.monkey();*/
		
		//upcasting
		A a=new B();
		a.car();
		a.marry();
		a.test();
		a.fly();
		a.monkey();
		
		
		
		
	}
}
