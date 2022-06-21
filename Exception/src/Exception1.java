
/*
 * Exception : try,catch와 함께 사용을 하게 됨. (예외 처리사항)
 * - RuntimeException (Error 발생 시 예외 처리 체크를 안함) - Null, Class, Array size (:RuntimeException 많이 발생하는 형태)
 * - OtherException (예외처리 체크사항 모두 함)
 * Exception 종류
 * Arithmetic : 0으로 나눌 때 발생
 * NullPointer : null 객체를 참조할 때
 * ClassCast : 클래스형 변환
 * NumberFormat : 숫자형으로 변환
 * ArrayIndexOutOfBound : 배열 참조 시 인덱스 번호 오류
 * IOException : 입출력 문제 발생 O
 * Exception : 전체 예외처리 현황 O
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try: 해당 값을 int로 변경함1
			a = Integer.valueOf(b);	//error발생 : a1라는 문자인데 강제로 숫자로 변환시 a라는 문자로 인하영 오류2
			//int a = Integer.valueOf("1");
		}catch(NumberFormatException e) {
			System.out.println(e);	//어떤 부분에서 문제가 발생3
		}finally {	//예외처리 하고 난 후 처리
			b = b.replaceAll("[a-zA-Z]", "");	//데이터 재처리4
			a = Integer.valueOf(b);	//다시 문법을 재작성해서 사용5
			//a = Integer.valueOf("1강감찬"); error
			
		}
		
		System.out.println(b);
		System.out.println(a);	//최종 결과값 출력6

	}

}
