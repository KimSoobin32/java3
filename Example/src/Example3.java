
public class Example3 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();	//�� ������ ��ӹ��� �ڽ�Ŭ���� ���
		ih2.it("ȫ�浿", "aaa5");
		ih2.print();

	}

}

class inherit1{
	private String nm;	//������ �� Ŭ����, inherit1 �ش� �κп����� �۵�
	protected String pw;	//�ܺο��� ������ �������� ��ӵǸ� ����, inherit1,2���� ��� �۵� �ǵ��� �ϸ�, �ܺο��� �ε� ����
	String pw2;	//default
	public String aa = this.nm;	//�ʵ尡 �켱������ ó���� class->field->method
	static String bb;
	public String cc;	//private���� ���� �κ��� inherit2������ ����� �� �ֵ��� �ϱ� ����
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		bb = this.nm;
		this.cc = this.nm;
	}
}

class inherit2 extends inherit1{
	public void print() {
		//System.out.println(this.nm+" "+this.pw); //nmx, pwo
		//System.out.println(this.aa+" "+this.pw); //null aaa5
		//System.out.println(bb+" "+this.pw); //ȫ�浿 aaa5
		System.out.println(this.cc+" "+this.pw);	//ȫ�浿 aaa5
	}
}