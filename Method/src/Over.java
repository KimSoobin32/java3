
public class Over {

	public static void main(String[] args) {
		
//		pt p = new pt();
//		p.display();

		cd c = new cd();
		c.display("���� ���� �� ���");	//�����ε�
		c.display();	//�������̵�
	}

}
/*
 * �����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ����
 * �������̵�(override) : �θ� Ŭ�������� ��ӹ��� ���� �޼ҵ带 ����ϴ� ���� ����
 */
class pt{
	public void display() {
		System.out.println("�θ� �ܺ� ���� ��");
	}
}

class cd extends pt{
	//aaaa() �޼ҵ�� �ֳ����̼��� ������� ����. �θ� class���� �������� �ʾ���
	//@Override //�θ� ���µ� ���� problems
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	@Override	//�ֳ����̼�(ǥ��) ���� �߻� �� Ȯ�� (�������̵忡��), �θ�Ŭ������ �̸� ������ �ֱ���
	public void display() {	//�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display(); //�θ� �ִ� ���� �Ӽ� �޼ҵ尪�� ������ �� ���
	}
	public void display(String msg) {	//�����ε�
		System.out.println(msg);
	}
}