
public class Method12 {

	public static void main(String[] args) {
		//extends�� ����� �ڽ� class�� �ε��ϰ� �Ǹ� �ڵ����� �θ� class�� �԰� ����� ����
		bbox2 b = new bbox2();
		b.b2("�̼���");
		System.out.println(b.abc());	//���� abc()�� private�� ���ҷ���


	}

}

class bbox{	//�⺻ �ܺ� class1 main���� �ʿ��� ������ üũ
	protected String user_info;
	private String user_pw;
	public String user_rpw;
	public bbox() {
		//this.user_info = "ȫ�浿";
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd", "Ox5%sfd");
	}
	public String abc() {	
		String email = "hong@nate.com";
		return email;
	}
}

class bbox2 extends bbox{	//bbox�� ���� ��� ������ bbox2�� �����ϰ� ��
	//��, bbox�߿��� private���� ���õ� ���� �������� ����
	//bbox �μ��������� ��Ӹ���
	public void b2(String nm) {	//main class���� bbox2�� �ε� �� �ش� ���� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ� �� �� user_info�� �����ϰ� �Ǵ� ����
		this.user_info = nm;
		System.out.println(this.user_info);
		//System.out.println(this.user_pw); //private�� ��������
		System.out.println(this.user_rpw);
	}
}