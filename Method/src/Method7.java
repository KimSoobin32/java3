import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		
		apink ap = new apink("홍길동",25,"test@gmail.com",-1000);
//		apink ap = new apink(null);
//		ap.names("홍길동");
		//System.out.println(ap.nm2); //유출 (접근성 문제)
		System.out.println(ap.data()); //허락된 데이터만 출력(로드)
		System.out.println(ap.data2());
	}

}

class apink{
	//private선언은 class 필드에서 생성햐야 함
	String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
//		this.nm = nm1;
//		System.out.println(this.nm);
		if(this.nm == "홍길동") {
			this.nm = "hong";
			String e[] = this.email.split("@");	//가공, 이메일중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			//System.out.println(Arrays.toString(e));
			this.email_cp = e[1];
			
		}
	}
	//, int age2, String email3, int point4
	//객체 생성하면 자동 실행(public class명 동일 메소드)-바로 로드
	public apink(String nm1, int age2, String email3, int point4) {	//private를 안에서 사용하지 못함
//		this.nm = nm1;
//		System.out.println(this.nm);
		/*
		this.age = age2;
		this.email = email3;
		this.point = point4;
		*/
		//setter 형태
		this.nm = nm1;
		this.email = email3;
		if(point4 < 0) {
			this.point = 0;
		}else {
			this.point = point4;
		}
		//names();
		
	}
	public String data() {
		names();
		
		//return this.nm;
		return this.email_cp;
		//return 밑에는 코드는 모두 오류가 발생, return은 맨 마지막에 사용하는 코드
	}
	public int data2() {
		//getter 형태
		return this.point;
	}
}