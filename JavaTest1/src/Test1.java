import java.util.Scanner;
//http://mekeyace.dothome.co.kr/javatest.txt
public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("on/off ют╥б");
		String str = s.next();
		if(str.equals("on")) {
			System.out.println("true");
		}else if(str.equals("off")){
			System.out.println("false");
		}
		s.close();

	}

}
