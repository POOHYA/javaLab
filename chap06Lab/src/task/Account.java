/*19. ���� ���� ��ü�� Account ��ü�� �ܰ�(balance) �ʵ带 ������ �ֽ��ϴ�. balance �ʵ��
�������� �� �� ����, �ִ� �鸸 �������� ������ �� �ֽ��ϴ�. �ܺο��� balance �ʵ带 ������
�� �������� ���ϵ��� �ϰ�, 0 <= balance <= 1,000,000 ������ ���� ���� �� �ֵ��� Account Ŭ
������ �ۼ��� ������.
(1) Setter�� Getter�� �̿��ϼ���.
(2) 0�� 1,000,000�� MIN_BALANCE�� MAX_BALANCE ����� �����ؼ� �̿��ϼ���.
(3) Setter�� �Ű����� �����̰ų� �鸸 ���� �ʰ��ϸ� ���� balance ���� �����ϼ���.
*/
package task;
public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int blance;
	
	public void setBalance(int blance) {
		if (MIN_BALANCE<= blance && blance <= MAX_BALANCE) {
			this.blance=blance;
		}
	}
	
	public int getBalance() {
		return blance;
	}
}