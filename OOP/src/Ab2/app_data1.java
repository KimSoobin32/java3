package Ab2;

public interface app_data1 {
	//String a;	//�ʵ忡 �ڷ����� ����ִ� ���� ����� ��� ���� ��ü�� �ȵ�
	String a = null;	//������ �� ����
	int b = 0;
	public void user_join();	//���� ������ �޼ҵ�� this ��� ����
	default void aaa() {	//default���� this����� ������ (���� ���� ���)
		System.out.println(this.a);
	}
}
