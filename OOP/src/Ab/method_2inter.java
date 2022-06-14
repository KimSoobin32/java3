package Ab;
//interface : 원래 기능 - 메소드만 선언, 추가로 연산을 처리하는 형태의 default가 추가됨(java14)
public interface method_2inter {	//ex 1창고, 2창고..
	//public String members; interface는 메소드임, class가 아니기 때문에 필드 쓸 수 없음
	//interface는 메소드이므로 필드에 자료형을 선언할 수 없음
	public String names();
	//abstract 은 default 없음
	default void setbox(String name) {	//setter
		//this.nm = name; 필드에 못 올림 this(x)
		System.out.println(name);
	};
	//interface에는 default 선언하면 연산 메소드를 사용함
	default String box3() {	//getter
		return null;
	}
}

interface method_2re extends method_2inter{	//interface에 extends로 부모 interface를 로드 할 수 있다.
	
}