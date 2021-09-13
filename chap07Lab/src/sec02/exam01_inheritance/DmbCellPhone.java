package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널:"+channel+"번 DMB반송수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널:"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송수신을 멈춥니다.");
	}
}
