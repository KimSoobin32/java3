import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		//intern() : equals�� ������� �ʰ� == (�ε��ȣ�� ��밡��)
		String data[] = {"ȫ�浿"};
		//String data[] = new String[] {"ȫ�浿"} true
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String("ȫ�浿");
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		
		System.out.println(a==c);
		
//		if(c==e) {
//			System.out.println("���� �����ϴ�.");
//		}
		//.equals�Ⱦ����� .intern() , a,b,e�� �������
		//equals���� ����(����)
		
		String h = new String(data[0]);	//�迭��
		//new String :�Ҽ��� ���� �����й��� �ڷ��� (����,����,�迭��)

	}

}
