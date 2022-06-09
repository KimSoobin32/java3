/*
 * extends : 자식 클래스에서 하나의 부모만 로드
 * implements : 자식 클래스에서 여러개의 부모를 로드 (애노테이션 무조건 사용) - 확장성 좋음
 */
public class Inter implements ime1,ime2{	//extends는 여러개 붇을 수 없음
	@Override
	public void c1() {
		System.out.println(names);	//인수전달 x, 호출만
		System.out.println("interface_1");
	}
	@Override
	public void c2() {
		System.out.println("interface_2");
	}

	public static void main(String[] args) {
		Inter it = new Inter();
		it.c1();
		it.c2();

	}

}
