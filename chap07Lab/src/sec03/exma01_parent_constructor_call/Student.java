package sec03.exma01_parent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	Student(String name, String ssn, int studentNo){
		super(name,ssn);//�ڽĿ��� �θ�����ڸ� ȣ��
		this.studentNo = studentNo;
	}
	
}
