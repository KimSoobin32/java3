
public class Exception2 {

	public static void main(String[] args) {
		try {
			//test(); //�޼ҵ� ȣ�� ��ü ����, Exception�� ���谡 ����
			Exception2 ex = new Exception2();
			String a = "ȫ�浿2";
			
			ex.test(a);
		}catch(Exception z) {
			System.out.println(z);	//���α׷� ��
		}
	}
	
	public void test(String b) throws Exception,NumberFormatException{	//trycatch������  ����, throws�� ���θ޼ҵ忡�� ����ó�� ���� �ش�޼ҵ带 ȣ�� �� ��� �� ���� ����
		int k = Integer.valueOf(b);
		System.out.println(k);
		System.out.println("test");
		Exception c = new Exception();
		throw c;	//�������� ����, ����ó�� ����� ���� ���� ���θ޼ҵ�� �ٽ� return��Ŵ, �ڵ� �� �ؿ� ����ϸ� throw�� return�� ����� ������ ����
	}

}
