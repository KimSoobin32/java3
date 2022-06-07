
public class Method5 {

	public static void main(String[] args) {
		
		cdb c = new cdb();
		/*
		c.d1 = "홍길동";


		c.data2();
		
		c.d3= "이순신";
		c.data1();
		
		c.d1="유관순";
		System.out.println(c.data3());
		*/
		// c.d2 = "강감찬"; //private으로 선언한 객체 이므로 main class에서 로드 못함
		c.data2("강감찬");
		//cdb.data1(); //불가
		String result = c.data3();
		System.out.println(result);
	}

}
class cdb{
	//필드
	String d1 = null;	//void, 자료형 메소드 로드 가능
	private String d2;
	
	public static String d3;	//다 사용가능
	
	public static void data1() {	//static자료형 외에는 로드가 불가능함
		//System.out.println(d1); //필드 못읽어옴(로드 못함)
		System.out.println(d3);
		//System.out.println(this.d2); //static은 this 못 씀
		/*
		 * String d1 = ""; //따로 놀음(실행 가능)
		 * System.out.println(d1);
		 */
	}
	public void data2(String user) {
		this.d2 = user;	//or d2 = user
		System.out.println(d2);	//or this.d2
	}
	public String data3() {
		/*
		String a = ""; 
		//or String a = null;
		return a; //값 지정 안하고 실행시키기
		or 그냥 return null; //int면 0
		*/
//		String a = d1;
		String a = this.d2;
		return a;
		
	}
}
