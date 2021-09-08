package sec13.exam02_constructor_access.package1;

public class A {
	//필드
	A a1;
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A (boolean b) {	}
	A(int b)	{}
	private A(String s) {}
}
