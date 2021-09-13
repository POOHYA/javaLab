package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// 
		Calculator myCalc = new Calculator();
		
		//정사각형넓이
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형넓이
		double result2 = myCalc.areaRectangle(10,20);
		
		
		System.out.println("정사각형:"+result1);
		System.out.println("직사각형:"+result2);
		
	}

}