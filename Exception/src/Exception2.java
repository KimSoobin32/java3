
public class Exception2 {

	public static void main(String[] args) {
		try {
			//test(); //메소드 호출 자체 에러, Exception과 관계가 없음
			Exception2 ex = new Exception2();
			String a = "홍길동2";
			
			ex.test(a);
		}catch(Exception z) {
			System.out.println(z);	//프로그램 끝
		}
	}
	
	public void test(String b) throws Exception,NumberFormatException{	//trycatch없으면  에러, throws는 메인메소드에서 예외처리 없이 해당메소드를 호출 할 경우 를 막기 위해
		int k = Integer.valueOf(b);
		System.out.println(k);
		System.out.println("test");
		Exception c = new Exception();
		throw c;	//문제사항 리턴, 예외처리 결과에 대한 값을 메인메소드로 다시 return시킴, 코드 맨 밑에 사용하며 throw는 return과 비슷한 성격을 가짐
	}

}
