package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 넘버데이터1 3,6,9,12,15
		 * 넘버데이터2 2,4
		 * 
		 * 결과
		 * 3,6,9,12,15,2,4
		 */
		//Arrays.sort : 배열변수 형태에만 적용됨	//Integer c[] = Arrays.sort(num1); error
		Integer a[] = {3,6,9,12,15};
		Integer b[] = {2,4};
		
		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(b));
		
		int w=0;
		int l2 = num2.size();
		while(w<l2) {
			num1.add(num2.get(w));
			w++;
		}		
		System.out.println(num1);
		
		Collections.sort(num1);	//ArrayList, LinkedList sort 오름차순 정렬
		System.out.println(num1);
		
		int ea2 = num1.size();
		System.out.println(ea2);

	}

}
