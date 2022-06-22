import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		//intern() : equals를 사용하지 않고 == (부등기호로 사용가능)
		String data[] = {"홍길동"};
		//String data[] = new String[] {"홍길동"} true
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();
		String d = new String("홍길동");
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		
		System.out.println(a==c);
		
//		if(c==e) {
//			System.out.println("값이 같습니다.");
//		}
		//.equals안쓰려면 .intern() , a,b,e는 상관ㄴㄴ
		//equals쓰지 말자(느림)
		
		String h = new String(data[0]);	//배열값
		//new String :소속이 없는 자유분방한 자료형 (무자,숫자,배열값)

	}

}
