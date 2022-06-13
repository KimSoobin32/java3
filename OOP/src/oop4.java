
public class oop4 {
	//추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		
		//ab_1 a1 = new ab_1(); 못 씀
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
		ab.ab_b();

	}

}

abstract class ab_1{	//추상 클래스(외부에서 로드가 절대 안됨) - 자체 실행 안됨

	public void ab_a() {	//환경 설정 용, 자식에는 이거 중복나지 않게..
		System.out.println("부모 클래스입니다.");
	}
	public void ab_b() {	//free 구성(인수값 없는 메소드), 자식클래스에서 사용해도 되고 안해도 됨
		
	}//free일 경우 abstract 추천, 선언이나 환경 설정이 필요하면 abstract 못 씀
//	public abstract int b() {
//		
//	} 라고 못 씀 abstract는(인테페이스처럼..
	public abstract int b();	//추상 메소드(free구성) - 자체 실행 안됨, 무조건 자식 클래스에서 사용, 리턴메소드에서 주로 사용
}
//abstract로 선언한 건 무조건 써야함
class ab_2 extends ab_1{
	
	@Override
	public void ab_b(){
		System.out.println(this.c());
	}
	@Override
	public int b() {	//실제 메소드 + 추상메소드(오버라이드)
		return 55;
	}
	public int c() {
		return 99;
	}
//	public int c() {
//		return 99;
//	} 쓰려면 abstract 올려놓고 써라
}
