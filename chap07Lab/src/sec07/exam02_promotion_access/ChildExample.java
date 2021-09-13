package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;	//	자동형 형변환
		parent.method1();
		parent.method2();
		
		//자식에서 부모형으로 자동형변환된 부모형은 다시 자신으로 강제형변환 가능
		Child child2 = (Child)parent;	//	강제형 형변환
		child2.method1();
		child2.method2();
		child2.method3();
		
		Parent parent1 = new Parent();
		
		// 원래부모형은 자식으로 강제형 형변환 불가
		// Child2 = (Child)parent1;
		child2.method1();
		child2.method2();
		child2.method3();
	}
}
