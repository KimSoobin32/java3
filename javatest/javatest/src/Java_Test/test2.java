package Java_Test;

import java.util.Scanner;

public class test2 {
	/*
	 ���缮 : 8000000
	��ȣ�� : 7220000
	�ŵ��� : 5087000
	������ : 4134420
	������ : 3328000
	������ : 2326500

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
			System.out.println("��ü�� �����մϴ�. ["+emp[w]+"��]���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���: ");
			out = sc.nextInt();
			this.totout += out;
						
			w++;
		}
		sc.close();
		this.pr();

	}
	
	public void pr() {
		this.fi = company - this.totout;
		System.out.println("�� ��ü�� �ݾ��� "+this.totout+" �̸�, �� �ܰ�ݾ��� "+this.fi+" �Դϴ�.");
	}
	
}