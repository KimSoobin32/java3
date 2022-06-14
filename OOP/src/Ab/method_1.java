package Ab;

//method_1a.java
public class method_1 extends ide_mth1{	//package Ab2에서 import할 수 있도록 하며, 외부 클래스도 동일하게 모두 가져오게 함
	public void recall() {	//Ab2패키지와 공유설정 메소드
		System.out.println("TEST");
	}	//다른 패키지 안에서 쓸때는 public 써야 함
	
	protected static void name() {	//protected static을 적용해야만 Ab2패키지와 공유가 됨!! ,
		System.out.println("홍길동");
	}	//상속 시 다른패키지에서 사용 가능

	public static void main(String[] args) {
		/* 
		 Arrays.sort : 배열 오름차순 정렬(숫자,한글,영문)
		 단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬 됨
		 APPLE ..., apple...
		 		
		int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);	//오름차순
		System.out.println(Arrays.toString(number_data));
		
		String user_data[] = {"홍길동","이순신","장보고","김유신"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		
		/*
		 * 변수를 2개 생성해서 하나는 문자, 숫자
		 * 현재 가입된 사용자의 아이디를 확인 후 해당 포인트가 적립되도록 함
		 * 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력
		 * 출력은 main class에서 사용함
		 * 
		 * 배열 데이터 :
		 * String member_ship[][] = {
		 * 	{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
		 * 	{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		 * };
		 */
		String a = "park";
		int b = 2000;	//적립금
		//String c = "감소";
		ide_mth1 m1 = new ide_mth1();
		m1.setter(a,b);
		System.out.println(m1.getter());

	}

}

class ide_mth1 extends mth1{
	private String member_ship[][];
	private String name;
	private int hav;
	private int tot = 0;
	private String str;
	private String msg;
	public ide_mth1() {
		this.member_ship = new String[][]{
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
	}
	@Override
	public void setter(String data1, int data2) {//반복
		this.name = data1;
		this.hav = data2;
//		if(data3.equals("증감")) {
//			this.loops();
//		}else {
//			this.loops2();
//		}
		this.loops();
	}
	public void loops() {	//static 쓰려면 인수 받아서 쓰는 방법밖에 없음
		int w = 0;
		int wl = this.member_ship[0].length;
		while(w<wl) {
			if(this.name.equals(this.member_ship[0][w])) {
				this.tot = this.hav + Integer.parseInt(this.member_ship[1][w]);
				break;	//계속 돌아가는거 방지
			}
			w++;
		}
		this.msg = "증감";
	}
	@Override
	public void setter(int data3[]) {}
	@Override
	public String getter() {	//결과값받아출력
		this.str = this.name+" 님의 포인트가 "+this.tot+" "+this.msg+" 되었습니다.";
		return this.str;
	}
}