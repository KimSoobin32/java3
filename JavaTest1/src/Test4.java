import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�");
		int gu = s.nextInt();
		if(gu<0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
		}else {
			int d = 1;
			do {
				System.out.println(gu+"*"+d+"="+gu*d);
				d++;
			}while(d<=9);
		}
		s.close();

	}

}
