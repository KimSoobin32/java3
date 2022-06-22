import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 데이터파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} (Object b[]
		 * 해당 데이터 값 중 문자값만 출력되도록 재 배열
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter)로 전송
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성 (arraylist add
		 * getter에서 해당 배열을 return으로 보내도록 함
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리되도록 함
		 */
		try {
			Object o[] = {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
			bb b = new bb();
			b.setter(o);
			
			LinkedList<String> res = b.getter();	//return받는 값이 배열 class이므로 해당 class명으로 선언 후 받아야 됨
			System.out.println(res);

		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	

}

class bb{	
	LinkedList<String> al = new LinkedList<>();

	public void setter(Object[] d) throws Exception{
		//System.out.println(Arrays.toString(d));
		int w=0;
		int ea = d.length;
		//int check = Integer.valueOf((int)d[1]);
//		int ck = (int)d[0];
//		System.out.println(ck);
		//String str = new String((String)d[0]);
//		String str = (String)d[0];
//		System.out.println(str);
		do {	//반복문 안 trycatch
			try {
				String check = String.valueOf((String)d[w]);	//해당 배열을 로드 시 (자료형)변환을 하는 이유는 Object배열이므로 선언하였음
				//System.out.println(check);
				this.al.add(check);
				
			}catch (Exception ex) {	//자식 클래스에서 문제 발생 시 출력되는 catch문, 단, throw 사용하면 다시 main으로 전달됨, 중요사항은 throw로 전달 시 해당 반복문은 종료하게 됨
				//throw ex;	//->main에서 처리 (반복문 나감)
				//System.out.println(ex);	//여기서 처리 (반복문 계속 진행)
			}

			
			w++;
		}while(w<ea);
		
	}
	public LinkedList<String> getter() {	//배열 class
		
		return this.al;
	}
	
}