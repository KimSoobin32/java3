
public class Method3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 인수값 2개의 숫자를 적용하여 계산되도록 함
		 * 최종 계산값을 받아서 결과를 출력
		 * 157, 45
		 * 157 * 45
		 * 최종결과값 출력 : 7065
		 */
		cal c = new cal();
		int result = c.mul(157, 45);
		System.out.println("최종결과값 출력 : "+result);
		
		c.m2();
		
		c.mul();
		
		/*
		 * 응용문제 다음 숫자 하나를 해당 메소드로 전달
		 * 해당 메소드에서는 다음과 같이 처리
		 * 숫자 3을 전달하면 3*1 ~ 3*9까지의 모든 결과값을 더하여
		 * sysout으로 출력
		 */
		int hap = c.gu(4);
		System.out.println(hap);
		
		String ck = c.mb("hong1");
		System.out.println(ck);
	}

}
//static void, void 메소드는 return 불가
class cal{
	public int mul(int a, int b) {
		int r = a * b;
		return r;
	}
	public void mul() {	//같은 메소드 명이라도 인자값으로 구분 됨
		System.out.println("연습입니다.");
	}
	public void m2() {
		int z = mul(100,200);	//같은 클래스라 객체 생성 안하고 그냥 호출
		System.out.println(z);
	}
	public int gu(int g) {
		int w = 1;
		int h = 0;
		while(w<=9) {
//			System.out.println(g+"*"+w+"="+g*w);
			h = (g*w) + h;
//			if(h>100) {
//				break;
//			}
			w++;
		}
		return h;	//반복문 안에는 return 못 씀
		//return 사용 시 절대 반복문 안에 적용하면 안됨
		//또한 조건문이라도 더블로 return 사용 안됨	
	}
	public String mb(String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";	//return "ok"(x)
		}else {
			msg = "cancel";	//return "cancel"(x)
		}
		return msg;	//해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴
	}
}