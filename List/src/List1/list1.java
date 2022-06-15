package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(추가), get(데이터로드), remove(삭제), size(index갯수) : ArrayList라는 util 메소드에서 사용하는 부분
		//Arrays.asList : 로드할 배열 변수를 적용
		//중요 : add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨. 단, index번호를 적용 후 값을 실행하면 해당 index부분에 추가됨
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);
		
		int ea = mb.size();
		//System.out.println(ea);4
		
		mb.add("김유신");
		//System.out.println(mb);[이순신, 홍길동, 유관순, 강감찬, 김유신]

		
		mb.remove(1);
		//System.out.println(mb);[이순신, 유관순, 강감찬, 김유신]

		
		mb.add(3,"세종대왕");
		//System.out.println(mb);[이순신, 유관순, 강감찬, 세종대왕, 김유신]
		
		String checks = mb.get(2);
		System.out.println(checks);	//강감찬
		
		/* ArrayList에는 int를 사용하지 않음(Integer) 사용 주의! */
		
		/* 응용문제 
		 * 본데이터 15,22,37,8,11,19,41
		 * 해당 본테이터 커스텀하여 다음 결과 처럼 출력
		 * [7,15,22,8,11,39,41]
		 * 
		 */
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		num.remove(2);
		num.remove(4);
		num.add(0,7);
		num.add(5,39);
		
		System.out.println(num);
		
		
		

	}

}
