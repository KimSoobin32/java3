package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� ���ڱݾ��� �Է�
		 * �ش� ���� �ݾ� Ƚ���� �� 8��
		 * 0~n���� �Է°����ϸ�
		 * �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ���
		 * ����)
		 * �Ա��� �ݾ��� ��������.
		 * 500,600,500,400,200,100,50,50
		 * ���)�� �Ա� �ݾ��� : 2400 �� �Դϴ�.
		 */
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		
		
		int w=0;
		int tot = 0;
		while(w<=7) {
			System.out.println("�Ա��� �ݾ��� ��������.");
			String price = s.next();	
			try {
				int n = Integer.parseInt(price);
				l.add(n);
				tot += l.get(w);			
				w++;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է�");
			}
			
		}
		System.out.println("�� �Ա� �ݾ��� : "+tot+" �� �Դϴ�.");
		System.out.println(l);
		
		
//		while(true) {
//			System.out.println("�Ա��� �ݾ��� ��������.");
//			String price = s.next();	
//			try {
//				int num = Integer.parseInt(price);
//				l.add(num);
//				tot += l.get(w);
//				w++;
//				if(l.size()>7) {
//					break;
//				}
//			}catch(Exception e) {
//				System.out.println("���ڸ� �Է�");
//			}											
//		
//		}
//		System.out.println("�ѱ� "+tot);
//		System.out.println("list "+l);
		
		s.close();

	}

}
