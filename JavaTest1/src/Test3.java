import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�");
		int n = s.nextInt();
		if(n>60) {
			System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		}else {
			if(n%2==0) {
				System.out.println("¦��");
			}else {
				System.out.println("Ȧ��");
			}
		}
		s.close();

	}

}
