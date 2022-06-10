
public class Example3 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();	//다 쓰려면 상속받은 자식클래스 사용
		ih2.it("홍길동", "aaa5");
		ih2.print();

	}

}

class inherit1{
	private String nm;	//무조건 이 클래스, inherit1 해당 부분에서만 작동
	protected String pw;	//외부에서 접근은 못하지만 상속되면 가능, inherit1,2에서 모두 작동 되도록 하며, 외부에서 로드 못함
	String pw2;	//default
	public String aa = this.nm;	//필드가 우선적으로 처리됨 class->field->method
	static String bb;
	public String cc;	//private으로 받은 부분을 inherit2에서도 사용할 수 있도록 하기 위함
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		bb = this.nm;
		this.cc = this.nm;
	}
}

class inherit2 extends inherit1{
	public void print() {
		//System.out.println(this.nm+" "+this.pw); //nmx, pwo
		//System.out.println(this.aa+" "+this.pw); //null aaa5
		//System.out.println(bb+" "+this.pw); //홍길동 aaa5
		System.out.println(this.cc+" "+this.pw);	//홍길동 aaa5
	}
}