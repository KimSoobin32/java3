import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ϰ����ϴ� ������ �ѱ۷� ǥ���Ͻʽÿ�?");
		String str = s.next();
		String color = null;
		switch(str) {
		case "����":
			color = "red";
			break;
		case "��Ȳ":
			color = "orange";
			break;
		case "���":
			color = "yellow";
			break;
		case "�ʷ�":
			color = "green";
			break;
		default:
			color = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�.";
			break;
		}
		System.out.println(color);
		s.close();
	}

}
