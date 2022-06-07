
public class Method1 {

	public static void main(String[] args) {
		tests t = new tests();
		t.a1++;	//2
		t.a2++;	//2
		t.name1();
		t.b1 += "유관순";	//이유
		t.b2 += "유관순";	//홍유
		t.name2();
		
		tests tt = new tests();
		tt.a1++;	//새 객체 생성하면 초기화됨 2
		tt.a2++;	//3
		t.name1();
		tt.b1 += "강감찬";	//이강
		tt.b2 += "강감찬";	//홍유강
		tt.name2();
				
	}

}

class tests{
	int a1 = 1;	//(동적변수)새로운 객체 생성 및 class를 호출 시 1이라는 숫자를 다시 가지게 됨
	public static int a2 = 1;	//(정적 변수)변수값을 메모리에 등록(강제 초기화 시키지 않는 이상 지워지지 않음)
	//새로운 객체 생성 및 class를 호출하더라도 1이라는 숫자가 아닌 메모리 등록된 최종값을 지속적으로 가지게 됨
	
	String b1 = "이순신";	//초반데이터만 이용 시
	public static String b2 = "홍길동";	//데이터 유지하면서 추가 시
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
	}
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
	}
}