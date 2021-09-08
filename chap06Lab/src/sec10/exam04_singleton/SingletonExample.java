package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		//	private 싱글톤 접근방법
		//	인스턴트에 접근하면 자동을 생성자 실행
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다");}
			else {
				System.out.println("다른 singleton 객체입니다");}
		
		
	}

}
