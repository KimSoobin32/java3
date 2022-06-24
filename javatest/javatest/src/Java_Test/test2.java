package Java_Test;

import java.util.Scanner;

public class test2 {
	/*
	 유재석 : 8000000
	강호동 : 7220000
	신동엽 : 5087000
	정상훈 : 4134420
	아이유 : 3328000
	한지민 : 2326500

	 */

	public static void main(String[] args) {
		out2 o2 = new out2();
		o2.cal();

	}

}

class out2 implements test2_interface {
	int totout=0;
	int fi=0;
	Scanner sc = null;
	public void cal() {

		this.sc = new Scanner(System.in);
		int w=0;
		int out=0;
		while(w<emp.length) {
			System.out.println("이체를 시작합니다. ["+emp[w]+"님]에게 이체하실 금액을 입력해 주세요: ");
			out = sc.nextInt();
			this.totout += out;
						
			w++;
		}
		sc.close();
		this.pr();

	}
	
	public void pr() {
		this.fi = company - this.totout;
		System.out.println("총 이체한 금액은 "+this.totout+" 이며, 총 잔고금액은 "+this.fi+" 입니다.");
	}
	
}