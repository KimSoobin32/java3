
public class Class3 {

	public static void main(String[] args) {
		apink m = new apink();
		m.f_method("�̺���");
		
		apink.cafe LA = m.new cafe();
		LA.call();

	}

}

abstract class father{	//�߻� Ŭ���� (abstract�� ����ϸ� �߻�)
	public String u_name;	//�������� ���� (abstract�� �����Ƿ� �߻��� �ƴ�)
	public abstract void f_method(String name);	//�߻� �޼ҵ�
}

class apink extends father{
	@Override
	public void f_method(String name) {	//�߻� �޼ҵ带 ���� �޼ҵ�� ��ȯ
		this.u_name = name;	//�߻� �޼ҵ忡 �ִ� ���������� ���� �̰���
		
	}
	
	class cafe{	//f_method override �Ұ�(�ܵ���) extends ���߱⶧��
		String msg = apink.this.u_name;	//�θ�Ŭ������ �ִ� ���������� �ڽ� Ŭ���� ���������� �̰�
		public void call() {
			String msg2 = this.msg + "�� ¯!!";
			System.out.println(msg2);
		}
	}
}