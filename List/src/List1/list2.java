package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 해당 데이터 값 중 휴면고객 데이터는 모두 삭제
		 * 고객 데이터
		 * {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"}
		 * 결과
		 * 정재욱,하윤성
		 */
		String member[] = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		int ml = mb.size();
		System.out.println(ml);
		int w = 0;
		while(w<ml) {
			int ww = 0;
			//int ml2 = mb.size();	//node의 갯수를 다시 파악함
			while(ww<=0) {
				if(!mb.get(ww).equals("정재욱") && !mb.get(ww).equals("하윤성")) {	//!mb.get(0).equals("정재욱")
					mb.remove(0);
					//정,하 뒤에 는 못지움
					//System.out.println(mb);
				}
				ww++;
			}
			w++;
		}
		System.out.println(mb);
		
		/*
		 * 응용문제 짝수의 숫자를 모두 삭제
		 * 10,7,6,1,11,37,41,22
		 * 
		 * 7,1,11,37,41
		 */
		Integer number[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(number));
		
		int no = num.size();
		int z =0;
//		do {
//			num.remove(0);
//			int no2 = num.size();
//			System.out.println(no2);
//			z++;
//		}while(z<no);
		
		do {			
			int no2 = num.size();
			int zz=0;
			do {
				if(num.get(zz)%2==0) {
					num.remove(zz);
					break;
					//System.out.println(num.get(zz));
				}				
				zz++;
			}while(zz<no2);
			z++;
		}while(z<no);
		System.out.println(num);
		
//		int nl = num.size();
//		int d = 0;
//		while(d<nl) {
//			int dd = 0;
//			int nl2 = num.size();
//			while(dd<nl2) {
//				
//				if(num.get(dd)%2==0) {
//					System.out.println("dd" + num.get(dd));
//					//num.remove(num.indexOf(num.get(dd)));
//					num.remove(dd);
//				}
//				dd++;
//			}
//			
//			d++;
//		}
//		System.out.println(num);
		

	}

}
