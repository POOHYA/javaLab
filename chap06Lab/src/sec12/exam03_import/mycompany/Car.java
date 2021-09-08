package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankok.SnowTire;
//import sec12.exam03_import.hyindai.*; // 현대의모든클래스
import sec12.exam03_import.hyindai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;
// ctrl+shift+O -> 자동으로 패키지 import

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
}