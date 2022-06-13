import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력");
		int n = s.nextInt();
		if(n>60) {
			System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		}else {
			if(n%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}
		s.close();

	}

}
