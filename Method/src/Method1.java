
public class Method1 {

	public static void main(String[] args) {
		tests t = new tests();
		t.a1++;	//2
		t.a2++;	//2
		t.name1();
		t.b1 += "������";	//����
		t.b2 += "������";	//ȫ��
		t.name2();
		
		tests tt = new tests();
		tt.a1++;	//�� ��ü �����ϸ� �ʱ�ȭ�� 2
		tt.a2++;	//3
		t.name1();
		tt.b1 += "������";	//�̰�
		tt.b2 += "������";	//ȫ����
		tt.name2();
				
	}

}

class tests{
	int a1 = 1;	//(��������)���ο� ��ü ���� �� class�� ȣ�� �� 1�̶�� ���ڸ� �ٽ� ������ ��
	public static int a2 = 1;	//(���� ����)�������� �޸𸮿� ���(���� �ʱ�ȭ ��Ű�� �ʴ� �̻� �������� ����)
	//���ο� ��ü ���� �� class�� ȣ���ϴ��� 1�̶�� ���ڰ� �ƴ� �޸� ��ϵ� �������� ���������� ������ ��
	
	String b1 = "�̼���";	//�ʹݵ����͸� �̿� ��
	public static String b2 = "ȫ�浿";	//������ �����ϸ鼭 �߰� ��
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
	}
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
	}
}