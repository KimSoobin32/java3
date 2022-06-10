import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("주소 :");
		String ad = s.nextLine();
		
		System.out.println("전화번호 :");
		String tel = s.nextLine();
		
		System.out.println("해당정보를 확인해주세요");
		System.out.printf("주소: %s		전화번호: %s",ad,tel);
		s.close();
		

		
		
	}

}
