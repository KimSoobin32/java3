public class Test2 {

	public static void main(String[] args) {
		int a = 49;
		String msg = null;
		if(a>=90) {
			msg = "등급 A 입니다.";
		}else if(a>=70 && a<=89) {
			msg = "등급 B 입니다.";
		}else if(a>=50 && a<=69) {
			msg = "등급 C 입니다.";
		}else {
			msg = "일반 등급 입니다.";
		}
		System.out.println(msg);
		

	}

}
