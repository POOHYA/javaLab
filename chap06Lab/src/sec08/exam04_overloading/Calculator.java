package sec08.exam04_overloading;

public class Calculator {
	//정사각형
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형의 넓이
	//overloading
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	
}
