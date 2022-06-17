package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 사용자가 직접 숫자를 입력 (Scanner)
		 * 단, 사용자가 문자를 입력할 경우 예외처리가 진행
		 * 총 숫자 입력은 7번이며, 해당 숫자 사용자가 입력한 숫자를 오름차순을로 정렬
		 * 
		 * "숫자를 하나 입력해 주시길 바랍니다 : " - 7번
		 * [6,22,37,44,45,80,100]
		 * 
		 * 추가옵션 - 짝수와 홀수값을 별도로 배열을 관리하도록 함
		 * [6,22,44,80,100]
		 * [37,45]
		 */
		Scanner s = new Scanner(System.in);
		int w=0;

		LinkedList<Integer> al1 = new LinkedList<>();	//홀수
		LinkedList<Integer> al2 = new LinkedList<>();	//짝수
		while(w<7) {
			System.out.println("숫자를 하나 입력해 주시길 바랍니다 : ");
			try {
				Integer n = Integer.valueOf(s.next());
				if(n%2==0) {
					al2.add(n);
				}else {
					al1.add(n);
				}
				w++;
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요.");

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
