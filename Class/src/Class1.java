/* �θ�Ŭ���� �� �ڽ�(����)Ŭ���� ���� */
public class Class1 {

	public static void main(String[] args) {
		/* �θ� �ν��Ͻ��� ������ ���� ������ �ڽ� Ŭ������ ���� ȣ������ ���� */
		parents p = new parents();	//Ŭ������ ���� ���ϸ� ���� ����
		p.p_box();
		parents.child pc = p.new child();	//�θ�Ŭ����.�ڽ�Ŭ���� �̸����� = �θ�Ŭ������.new �ڽ�Ŭ������ (�ν��Ͻ��� ����), parents.new(x)
		pc.c_box();

	}

}

class parents{	//�θ� Ŭ����
	String a = "ȫ�浿";	//�θ� �ʵ忡 �ִ� ��������(this)
	String b;
	class child{	//�ڽ� Ŭ���� - ���� (class���� -convert -java���� �ҽ� ����)
		int a = 20;
		public void c_box() {	//�ڽ� �޼ҵ�
			double c = 10.5;
			System.out.println(c);	//�ڽ� �޼ҵ� ���� ��������
			System.out.println(this.a);	//�ڽ�Ŭ���� ���� ��������
			System.out.println(parents.this.a);	//�θ�Ŭ���� ���� ��������
			System.out.println(parents.this.b);
		}
	}
	
	public void p_box() {	//�θ� �޼ҵ�
		String a = "�̼���";	//p_box�� �ִ� �������� ����
		this.b = a;
		System.out.println(this.a);	//ȫ�浿 ��������
		System.out.println(a);	//�̼��� ��������
	}
	//�޼ҵ� �� Ŭ������ ����
}