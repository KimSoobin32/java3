
public class Method3 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� ��
		 * ���� ��갪�� �޾Ƽ� ����� ���
		 * 157, 45
		 * 157 * 45
		 * ��������� ��� : 7065
		 */
		cal c = new cal();
		int result = c.mul(157, 45);
		System.out.println("��������� ��� : "+result);
		
		c.m2();
		
		c.mul();
		
		/*
		 * ���빮�� ���� ���� �ϳ��� �ش� �޼ҵ�� ����
		 * �ش� �޼ҵ忡���� ������ ���� ó��
		 * ���� 3�� �����ϸ� 3*1 ~ 3*9������ ��� ������� ���Ͽ�
		 * sysout���� ���
		 */
		int hap = c.gu(4);
		System.out.println(hap);
		
		String ck = c.mb("hong1");
		System.out.println(ck);
	}

}
//static void, void �޼ҵ�� return �Ұ�
class cal{
	public int mul(int a, int b) {
		int r = a * b;
		return r;
	}
	public void mul() {	//���� �޼ҵ� ���̶� ���ڰ����� ���� ��
		System.out.println("�����Դϴ�.");
	}
	public void m2() {
		int z = mul(100,200);	//���� Ŭ������ ��ü ���� ���ϰ� �׳� ȣ��
		System.out.println(z);
	}
	public int gu(int g) {
		int w = 1;
		int h = 0;
		while(w<=9) {
//			System.out.println(g+"*"+w+"="+g*w);
			h = (g*w) + h;
//			if(h>100) {
//				break;
//			}
			w++;
		}
		return h;	//�ݺ��� �ȿ��� return �� ��
		//return ��� �� ���� �ݺ��� �ȿ� �����ϸ� �ȵ�
		//���� ���ǹ��̶� ����� return ��� �ȵ�	
	}
	public String mb(String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";	//return "ok"(x)
		}else {
			msg = "cancel";	//return "cancel"(x)
		}
		return msg;	//�ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ
	}
}