package sec02.exam01_none_generic_type;

public class BoxExample {
	/*
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");	// Object o = "ȫ�浿" �ڵ�����ȯ �θ���<-�ڽ���
		String name = (String) box.get(); //	��������ȯ �ڽ���<-�θ���
		
		box.set(new Apple()); // Object o = new Apple(); �ڵ�����ȯ
		Apple apple = (Apple)box.get(); // ��������ȯ
	*/
	
	public class Box<T>{
		private T t;
		public T get() {
			return t;
	}
		public void set(T t) {
			this.t = t;
	}
	
	
	
	}
}