
public class Method2 {

	public static void main(String[] args) {
		//default package�� ��� �� �ش� class���� ȣ���ϸ� ��
		//��, package�� ���� ���� ���� ���� ��ܿ� package�� �����ؾ� ��
		/*
		 * tests ts = new tests(); 
		 * ts.a2++; 
		 * System.out.println(ts.a2);
		 */
		info i = new info();
		/* error */
//		System.out.println(i.data1(20));
//		System.out.println(i.data2(20));
		
		/* success */
		System.out.println(i.data3(20));
		
		/*
		 * data4 �޼ҵ� return���� result������ �޾Ƽ� ó��
		 */
		String result = i.data4("ȫ�浿");
		System.out.println(result);
	}

}

class info{
	/*
	 * static �Ǵ� void �޼ҵ忡�� return�̶�� ��ɾ ������� ����
	 */
	public static void data1(int abc) {
		int z = abc + 20;
		/* error */
//		System.out.println(z);
//		return z;
	}
	public void data2(int abc) {
		int z = abc + 20;
		/* error */
//		System.out.println(z);
//		return z;
	}
	/*
	 * �ڷ��� �޼ҵ��� ���ϸ�, ������ return�� ����ؾ� ��
	 * ��, sysout�� ������� ����(return���� sysout���� �����ó�� ����)
	 */
	public int data3(int abc) {
		int z = abc + 20;
		return z;
	}
	public String data4(String abc) {
		String z = abc + "�� ȯ���մϴ�.";
		return z;
	}
}