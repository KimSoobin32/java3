package Ab;

//method_1a.java
public class method_1 extends ide_mth1{	//package Ab2���� import�� �� �ֵ��� �ϸ�, �ܺ� Ŭ������ �����ϰ� ��� �������� ��
	public void recall() {	//Ab2��Ű���� �������� �޼ҵ�
		System.out.println("TEST");
	}	//�ٸ� ��Ű�� �ȿ��� ������ public ��� ��
	
	protected static void name() {	//protected static�� �����ؾ߸� Ab2��Ű���� ������ ��!! ,
		System.out.println("ȫ�浿");
	}	//��� �� �ٸ���Ű������ ��� ����

	public static void main(String[] args) {
		/* 
		 Arrays.sort : �迭 �������� ����(����,�ѱ�,����)
		 ��, ������ ��� �빮�ڰ� ���� ���� ������������ ���� ��
		 APPLE ..., apple...
		 		
		int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);	//��������
		System.out.println(Arrays.toString(number_data));
		
		String user_data[] = {"ȫ�浿","�̼���","�庸��","������"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		
		/*
		 * ������ 2�� �����ؼ� �ϳ��� ����, ����
		 * ���� ���Ե� ������� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� ��
		 * ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ���
		 * ����� main class���� �����
		 * 
		 * �迭 ������ :
		 * String member_ship[][] = {
		 * 	{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
		 * 	{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		 * };
		 */
		String a = "park";
		int b = 2000;	//������
		//String c = "����";
		ide_mth1 m1 = new ide_mth1();
		m1.setter(a,b);
		System.out.println(m1.getter());

	}

}

class ide_mth1 extends mth1{
	private String member_ship[][];
	private String name;
	private int hav;
	private int tot = 0;
	private String str;
	private String msg;
	public ide_mth1() {
		this.member_ship = new String[][]{
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
	}
	@Override
	public void setter(String data1, int data2) {//�ݺ�
		this.name = data1;
		this.hav = data2;
//		if(data3.equals("����")) {
//			this.loops();
//		}else {
//			this.loops2();
//		}
		this.loops();
	}
	public void loops() {	//static ������ �μ� �޾Ƽ� ���� ����ۿ� ����
		int w = 0;
		int wl = this.member_ship[0].length;
		while(w<wl) {
			if(this.name.equals(this.member_ship[0][w])) {
				this.tot = this.hav + Integer.parseInt(this.member_ship[1][w]);
				break;	//��� ���ư��°� ����
			}
			w++;
		}
		this.msg = "����";
	}
	@Override
	public void setter(int data3[]) {}
	@Override
	public String getter() {	//������޾����
		this.str = this.name+" ���� ����Ʈ�� "+this.tot+" "+this.msg+" �Ǿ����ϴ�.";
		return this.str;
	}
}