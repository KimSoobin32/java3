
public class Class2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 더블 클래스를 이용하여 자식클래스에 결과값을 출력하는 프로세서 제작
		 * 클래스는 2가지 있다.
		 * 부모 클래스 명 : mother
		 * 자식 클래스 명 : child
		 * 메인 클래스에서 mother클래스로 값을 전달 값은
		 * 30, 50 숫자값을 적용
		 * child에서 부모 클래스에 있는 값을 받아 두개의 숫자를 곱한 값을 출력
		 * 
		 */
		mother m = new mother();
		m.m_me(30, 50);
		mother.child mc = m.new child();
		mc.c_me();

	}

}

class mother{
	int n1,n2;
	public void m_me(int a, int b) {
		//System.out.println(a+" "+b);
		this.n1 = a;
		this.n2 = b;
	}
	
	class child{
		int aa = mother.this.n1;
		int bb = mother.this.n2;
		public void c_me() {			
			//System.out.println(mother.this.n1 * mother.this.n2);
			int cc = this.aa * this.bb;
			System.out.println(cc);
		}
	}
}
