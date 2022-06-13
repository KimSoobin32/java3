import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("번역하고자하는 색상을 한글로 표기하십시오?");
		String str = s.next();
		String color = null;
		switch(str) {
		case "빨강":
			color = "red";
			break;
		case "주황":
			color = "orange";
			break;
		case "노랑":
			color = "yellow";
			break;
		case "초록":
			color = "green";
			break;
		default:
			color = "해당 단어는 번역이 되지 않습니다.";
			break;
		}
		System.out.println(color);
		s.close();
	}

}
