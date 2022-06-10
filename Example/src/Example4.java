
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 두개의 값을 외부 클래스로 보냄
		 * 해당 클래스에서 두개의 값을 계산
		 * 계산 형식은 다음과 같다.
		 * 3, 10을 보내게 되면 두개의 값의 합을 구함
		 * 나머지 외부 클래스에서 해당 결과값을 출력하는데,
		 * 두개의 합 값이 짝수, 홀수 인지를 출력하는 extends를 구현
		 */
		int a = 3;
		int b = 11;
		pr p = new pr();
		p.hap(a, b);
		p.print();
		
	}

}
class ma{

	protected int tot;
	public void hap(int n1, int n2) {
		this.tot = n1+n2;
	}
	
}

class pr extends ma{
	public void print() {
		System.out.println(this.tot);
		if(this.tot%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}
}