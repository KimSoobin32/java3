
public class Method12 {

	public static void main(String[] args) {
		//extends를 사용한 자식 class를 로드하게 되면 자동으로 부모 class도 함계 사용이 가능
		bbox2 b = new bbox2();
		b.b2("이순신");
		System.out.println(b.abc());	//만약 abc()가 private면 못불러옴


	}

}

class bbox{	//기본 외부 class1 main에서 필요한 사항을 체크
	protected String user_info;
	private String user_pw;
	public String user_rpw;
	public bbox() {
		//this.user_info = "홍길동";
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd", "Ox5%sfd");
	}
	public String abc() {	
		String email = "hong@nate.com";
		return email;
	}
}

class bbox2 extends bbox{	//bbox에 대한 모든 정보를 bbox2와 공유하게 됨
	//단, bbox중에서 private으로 셋팅된 값은 공유하지 않음
	//bbox 인수값있으면 상속못함
	public void b2(String nm) {	//main class에서 bbox2를 로드 후 해당 값에 인수값을 적용하여 bbox class에 있는 필드 명 중 user_info에 적용하게 되는 형태
		this.user_info = nm;
		System.out.println(this.user_info);
		//System.out.println(this.user_pw); //private는 못가져옴
		System.out.println(this.user_rpw);
	}
}