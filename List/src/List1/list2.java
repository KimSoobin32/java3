package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * ���빮��. �ش� ������ �� �� �޸�� �����ʹ� ��� ����
		 * �� ������
		 * {"�����","������","��â��","�ڵ���","�̰���","�����","������"}
		 * ���
		 * �����,������
		 */
		String member[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		int ml = mb.size();
		System.out.println(ml);
		int w = 0;
		while(w<ml) {
			int ww = 0;
			//int ml2 = mb.size();	//node�� ������ �ٽ� �ľ���
			while(ww<=0) {
				if(!mb.get(ww).equals("�����") && !mb.get(ww).equals("������")) {	//!mb.get(0).equals("�����")
					mb.remove(0);
					//��,�� �ڿ� �� ������
					//System.out.println(mb);
				}
				ww++;
			}
			w++;
		}
		System.out.println(mb);
		
		/*
		 * ���빮�� ¦���� ���ڸ� ��� ����
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
