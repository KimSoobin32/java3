/* 부모클래스 및 자식(내부)클래스 연동 */
public class Class1 {

	public static void main(String[] args) {
		/* 부모가 인스턴스에 적용이 되지 않으면 자식 클래스는 절대 호출하지 못함 */
		parents p = new parents();	//클래스는 선언 안하면 접근 못함
		p.p_box();
		parents.child pc = p.new child();	//부모클래스.자식클래스 이름생성 = 부모클래스명.new 자식클래스명 (인스턴스에 적용), parents.new(x)
		pc.c_box();

	}

}

class parents{	//부모 클래스
	String a = "홍길동";	//부모 필드에 있는 전역변수(this)
	String b;
	class child{	//자식 클래스 - 보안 (class파일 -convert -java파일 소스 노출)
		int a = 20;
		public void c_box() {	//자식 메소드
			double c = 10.5;
			System.out.println(c);	//자식 메소드 전용 지역변수
			System.out.println(this.a);	//자식클래스 전용 전역변수
			System.out.println(parents.this.a);	//부모클래스 전용 전역변수
			System.out.println(parents.this.b);
		}
	}
	
	public void p_box() {	//부모 메소드
		String a = "이순신";	//p_box에 있는 지역변수 선언
		this.b = a;
		System.out.println(this.a);	//홍길동 전역변수
		System.out.println(a);	//이순신 지역변수
	}
	//메소드 안 클래스도 가능
}