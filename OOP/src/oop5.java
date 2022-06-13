
public class oop5 {
	//abstract 응용 기본 형태 - 인수값으로 추상 메소드로 값을 넘김
	public static void main(String[] args) {
		load1 ld1 = new load1();
		ld1.datain(20, 30);
		ld1.call();
		
		load2 ld2 = new load2();
		ld2.datain(20, 30);
		ld2.call();

	}

}

abstract class abclass{
	int data1,data2;
	public void datain(int d1, int d2) {	//기본 추상 메소드이며, 모든 데이터를 인수값 받아서 this 처리, 단, 외부 클래스에는 선언하지 않음
		this.data1 = d1;
		this.data2 = d2;
	}
	public abstract void plus();	//각각의 class에 기본으로 plus 메소드는 무조건 들어가야 함
	public void call() {
		this.plus();
	}
}

class load2 extends abclass{

	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();
	}
	public void avg() {
		System.out.println("홍길동");
	}
}

class load1 extends abclass{
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
}
