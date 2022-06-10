
public class Example5 {

	public static void main(String[] args) {
		/*
		 * extends를 사용하여 다음 결과에 대한 코드를 작성
		 * 숫자 두개를 입력
		 * 두개의 숫자를 확인하여 다음과 같이 체크
		 * 첫번째 숫자가 두번째 숫자보다 작을 경우
		 * 첫번째 숫자가 두번째 숫자보다 클 경우
		 * 첫번째 숫자가 두번째 숫자와 같을 경우
		 * 
		 * 첫번째 숫자가 클 경우 : 해당 두개의 값을 합친 결과값 출력
		 * 두번째 숫자가 클 경우 : 해당 범위만큼 숫자를 모두 더한 결과 값 출력
		 * 첫번째와 두번째 숫자가 같을 경우 : "해당 값이 같습니다."라고 메세지 출력
		 * 
		 */
		int a = 1;
		int b = 10;
		ex2 e = new ex2();
		e.check(a, b);
		int res = e.out();
		System.out.println(res);
		e = null;
		System.exit(0);
		System.gc();

	}

}

class ex1{
	protected int result = 0;
	//protected boolean same = false;
	public void check(int n1, int n2) {
		if(n1>n2) {
			this.result = n1+n2;
		} else if(n1<n2) {
			int d = n1;
			do {
				this.result += d;
				d++;
			}while(d<=n2);
			
		} else {
			//this.same = true;
			System.out.println("해당 값이 같습니다.");
			System.exit(0);
		}
	}
	
}

class ex2 extends ex1{
	public int out() {
//		if(this.same == true) {
//			System.out.println("해당 값이 같습니다.");
//		} else {
			//System.out.println(this.result);
//		}
		return this.result;
		
	}
}
