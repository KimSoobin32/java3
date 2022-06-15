package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 숫자금액을 입력
		 * 해당 숫자 금액 횟수는 총 8번
		 * 0~n까지 입력가능하며
		 * 해당 입력이 모두 끝나면 최종 합계 금액을 출력
		 * 예시)
		 * 입금할 금액을 적으세요.
		 * 500,600,500,400,200,100,50,50
		 * 결과)총 입금 금액은 : 2400 원 입니다.
		 */
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		
		
		int w=0;
		int tot = 0;
		while(w<=7) {
			System.out.println("입금할 금액을 적으세요.");
			String price = s.next();	
			try {
				int n = Integer.parseInt(price);
				l.add(n);
				tot += l.get(w);			
				w++;
			}catch(Exception e) {
				System.out.println("숫자만 입력");
			}
			
		}
		System.out.println("총 입금 금액은 : "+tot+" 원 입니다.");
		System.out.println(l);
		
		
//		while(true) {
//			System.out.println("입금할 금액을 적으세요.");
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
//				System.out.println("숫자만 입력");
//			}											
//		
//		}
//		System.out.println("총금 "+tot);
//		System.out.println("list "+l);
		
		s.close();

	}

}
