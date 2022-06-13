import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단을 입력");
		int gu = s.nextInt();
		if(gu<0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
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
