package sec03.exma01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	Student(String name, String ssn, int studentNo){
		super(name,ssn);//자식에서 부모생성자를 호출
		this.studentNo = studentNo;
	}
	
}
