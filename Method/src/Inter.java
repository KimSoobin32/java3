/*
 * extends : �ڽ� Ŭ�������� �ϳ��� �θ� �ε�
 * implements : �ڽ� Ŭ�������� �������� �θ� �ε� (�ֳ����̼� ������ ���) - Ȯ�强 ����
 */
public class Inter implements ime1,ime2{	//extends�� ������ ���� �� ����
	@Override
	public void c1() {
		System.out.println(names);	//�μ����� x, ȣ�⸸
		System.out.println("interface_1");
	}
	@Override
	public void c2() {
		System.out.println("interface_2");
	}

	public static void main(String[] args) {
		Inter it = new Inter();
		it.c1();
		it.c2();

	}

}
