import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink("ȫ�浿",25,"test@gmail.com",-1000);
//		apink ap = new apink(null);
//		ap.names("ȫ�浿");
		//System.out.println(ap.nm2); //���� (���ټ� ����)
		System.out.println(ap.data()); //����� �����͸� ���(�ε�)
		System.out.println(ap.data2());
	}

}

class apink{
	//private������ class �ʵ忡�� ������� ��
	String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
//		this.nm = nm1;
//		System.out.println(this.nm);
		if(this.nm == "ȫ�浿") {
			this.nm = "hong";
			String e[] = this.email.split("@");	//����, �̸����߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			//System.out.println(Arrays.toString(e));
			this.email_cp = e[1];
			
		}
	}
	//, int age2, String email3, int point4
	//��ü �����ϸ� �ڵ� ����(public class�� ���� �޼ҵ�)-�ٷ� �ε�
	public apink(String nm1, int age2, String email3, int point4) {	//private�� �ȿ��� ������� ����
//		this.nm = nm1;
//		System.out.println(this.nm);
		/*
		this.age = age2;
		this.email = email3;
		this.point = point4;
		*/
		//setter ����
		this.nm = nm1;
		this.email = email3;
		if(point4 < 0) {
			this.point = 0;
		}else {
			this.point = point4;
		}
		//names();
		
	}
	public String data() {
		names();
		
		//return this.nm;
		return this.email_cp;
		//return �ؿ��� �ڵ�� ��� ������ �߻�, return�� �� �������� ����ϴ� �ڵ�
	}
	public int data2() {
		//getter ����
		return this.point;
	}
}