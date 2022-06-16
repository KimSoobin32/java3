import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : "홍길동", "이순신", "유관순" 세개의 데이터가 있습니다.
		 * 메인 클래스에서 문자를 하나 전송
		 * 단, 문자가 null 보낼 수 있으며, 배열 데이터와 관계 없는 "강감찬"이라고 보낼 수도 있음
		 * 외부 클래스명 : data_list 이며
		 * 추상 클래스명 : v_construct 이다.
		 * 외부 클래스 안에 내부 클래스 명은 : check 이다.
		 * 
		 * [결과형태]
		 * 메인 class에서 강감찬을 적용할 경우
		 * 내부 클래스에서 "해당 사용자는 가입자가 아닙니다."출력
		 * 메인 class에서 이순신을 적용할 경우
		 * 내부 클래스에서 "해당 사용자가 있습니다."출력
		 * 단, ArrayList로 배열을 로드
		 * 
		 * 내부에서 프린트
		 */
		String name ="이순신";
		data_list d = new data_list();
		d.set(name);
		
//		data_list.check c = d.new check();
//		c.call();

	}

}

abstract class v_construct{
	String user_name;
//	String arr[] = {"홍길동", "이순신", "유관순"};
//	ArrayList<String> ulist = new ArrayList<>(Arrays.asList(arr));
	public abstract void set(String n);
	
}

class data_list extends v_construct{
	String name;
	@Override
	public void set(String n) {
		if(n==null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		}else {
			this.name = n;
			check c = new check();	//메소드 안 클래스 선언가능!
			c.db();
		}		
	}
	
	class check{
		String n = data_list.this.name;	//부모클래스에서 받은 값을 자식 클래스로 이관
		String arr[];	//필드에 배열을 받는 객체 생성
		ArrayList<String> users = null;	//ArrayList util을 필드에 객체 생성
		//ArrayList<String> users = new ArrayList<>(Arrays.asList(arr)); 읽는 순서 때문에 오류(field->method)
//		ArrayList<String> users = data_list.this.ulist;
		public void db() {
			//해당 필드에 있는 ArrayList를 인스턴스로 적용함
			this.arr = new String[] {"홍길동", "이순신", "유관순"};
			this.users = new ArrayList<>(Arrays.asList(this.arr));	//this로 처리
			this.call();	//최종 DB와 사용자 정보를 비교하는 메소드
		}
		
		public void call() {
			
			int w = 0;
			int wl = this.users.size();
			String msg = "";
			while(w<wl) {
				try {
					if(this.n.equals(this.users.get(w))) {
						msg = "해당 사용자가 있습니다.";
						break;
					} else {
						msg = "해당 사용자는 가입자가 아닙니다.";
					}
					
				}catch(Exception e) {
					msg = "해당 사용자는 가입자가 아닙니다.n";
				}
				w++;
			}
			System.out.println(msg);
			
			
		}
		
	}
}
