import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * 응용문제 관리자에서 메뉴를 활성화하는 프로세서입니다.
		 * 해당 메뉴 활성화는 2차 배열이며, 메뉴명, 활성화하는(Y,N)으로 구분
		 * 해당 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는
		 * 메뉴명을 1차배열로 재구성 후 메인에서 출력
		 * 결과 : [로켓배송,로켓프레시,골드박스,이벤트,추석]
		 * 단, private 및 return을 활용하여 프로그램 작성
		 */
		menus m = new menus();
		System.out.println(Arrays.toString(m.get()));

	}

}

class menus{
	private String arr[][];
	private String na[];

	public menus() {
		String ms[][] = {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}				
		};
		this.arr = ms;
		aa();
		//this.na = new String[this.arr[0].length];
	}
	public void aa() {
	int w = 0;
	int adl = arr[0].length;
	int ct = 0;
	//this.na = new String[adl];
	String ww[] = new String[adl];
	while(w<adl) {
		if(this.arr[1][w].equals("Y")) {
			//this.na[ct] = this.arr[0][w];
			ww[ct] = this.arr[0][w];
			ct++;
		}
		w++;
	}

	this.na = ww;
	
	}
	public String[] get() {
		return this.na;
	}
}

/*
class aaa{
	//field
	int a;
	String b;
	
	//constructor
	public aaa(){
		
	}
	
	//method(필수)
	public void
	public static void
	public String abc
}
*/