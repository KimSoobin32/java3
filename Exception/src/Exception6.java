import java.security.PublicKey;

public class Exception6 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 사용자가 45*3+16+5+22*8 해당 연산 값의 최종 값을
		 * 외부클래스로 전송
		 * 해당 외부클래스에서는 해당 값이 짝수일 경우 예외 오류를 발생하며
		 * 홀수일 경우 "홀수값입니다."으로 다시 회신하도록 함
		 */
		/*
		 * 응용문제. 데이터파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} (Object b[]
		 * 해당 데이터 값 중 문자값만 출력되도록 재 배열
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter)로 전송
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성 (arraylist add
		 * getter에서 해당 배열을 return으로 보내도록 함
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리되도록 함	(paseint 예외
		 */		
		
		
		aa a = new aa();
		try {
			int res =  45*3+16+5+22*8;
			
			String str = a.pr(res);
			System.out.println(str);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}

	}

}

class aa{
	public String pr(int r) throws Exception{
		String msg="";
		if(r%2==0) {
			throw new Exception("짝수");
		}else {
			msg = "홀수값입니다.";
		}
		return msg;
	}
	
}