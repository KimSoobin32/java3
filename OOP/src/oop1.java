import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//��͸޼ҵ� ����
		op_method om = new op_method();
		
		
		
		
		

	}

}
//��͸޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ����� ����
//�ݺ���, �ܺ� class�� ����� �� ������ ������ ���� �ذ��ϱ� ���� �����ϴ� �޼ҵ� ���¸� ����
//�ܺ�Ŭ����
class op_method{	//��͸޼ҵ�� ���� Ŭ�������� ���
	Scanner sc = new Scanner(System.in);
	private String nm;
	
	public op_method(){	//���� ���� �޼ҵ�
		this.m1();
	}
	public void m1() {	//�޼ҵ� m1�� �۵�
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		this.nm = sc.next();
		this.m2();
	}
	public void m2() {	//m1�� ���� ������� m2�� Ȯ��
		if(this.nm.equals("ȫ�浿")) {
			sc.close();
			System.exit(0);
		}else {
			System.out.println("�ش� �̸��� �����ϴ�.");
			this.m1();	//m1�� �ٽ� �� ȣ��(��͸޼ҵ�)
		}
	}
}