package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��:"+channel+"�� DMB�ݼۼ����� �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä��:"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB��ۼ����� ����ϴ�.");
	}
}
