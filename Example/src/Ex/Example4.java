package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ����ڰ� ���� ���ڸ� �Է� (Scanner)
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����
		 * �� ���� �Է��� 7���̸�, �ش� ���� ����ڰ� �Է��� ���ڸ� ������������ ����
		 * 
		 * "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ� : " - 7��
		 * [6,22,37,44,45,80,100]
		 * 
		 * �߰��ɼ� - ¦���� Ȧ������ ������ �迭�� �����ϵ��� ��
		 * [6,22,44,80,100]
		 * [37,45]
		 */
		Scanner s = new Scanner(System.in);
		int w=0;

		LinkedList<Integer> al1 = new LinkedList<>();	//Ȧ��
		LinkedList<Integer> al2 = new LinkedList<>();	//¦��
		while(w<7) {
			System.out.println("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ� : ");
			try {
				Integer n = Integer.valueOf(s.next());
				if(n%2==0) {
					al2.add(n);
				}else {
					al1.add(n);
				}
				w++;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���.");

			}
			
			//w++;
		}
		Collections.sort(al1);
		Collections.sort(al2);
		System.out.println(al2);
		System.out.println(al1);
		
		s.close();
	}

}
