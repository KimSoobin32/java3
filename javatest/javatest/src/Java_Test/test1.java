package Java_Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		out1 o1 = new out1();
		o1.ques();
		
		
		
	}

}

class out1 extends test1_abstract{
	Scanner sc = null;
	LinkedList<String> li = new LinkedList<>(Arrays.asList(this.basicsub));
	@Override
	public void ques() {
		this.sc = new Scanner(System.in);
		System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3] �� ������ �ּ���?");
		int op = sc.nextInt();
		if(op==1) {
			sel1();
		}else if(op==2) {
			sel2();
		}else if(op==3) {
			sel3();
		}
		
				
	}
	@Override
	public void sel1() {
		System.out.println("�߰��� ������� �Է��ϼ���?");
		String sub = sc.next().intern();

		boolean ck = false;
		int w=0;
		while(w<li.size()) {
			if(sub==li.get(w).intern()) {
				
				ck=true;
				break;
			}
			w++;
		}
		if(ck==true) {
			System.out.println("�̹� ��ϵ� ������� �ֽ��ϴ�.");
			
		}else {
			this.li.add(sub);
			System.out.println("���������� ��� �Ǿ����ϴ�.");
			
		}
		
		
		
		
		ques();
		
	}
	@Override
	public void sel2() {
		System.out.println("������ ������� �Է��ϼ���?");
		String sub = sc.next().intern();

		int w=0;
		boolean ck = false;
		while(w<li.size()) {
			if(sub==li.get(w).intern()) {				
				ck=true;
				break;
			}
			w++;
		}
		
		if(ck==false) {
			System.out.println("�ش� ������� �����ϴ�.");
			
		}else {
			this.li.remove(sub);
			System.out.println("���������� ���� �Ǿ����ϴ�.");
			
		}
		
		ques();
	}
	@Override
	public void sel3() {

		System.out.println(this.li);
		ques();
		
	}
	
	
}