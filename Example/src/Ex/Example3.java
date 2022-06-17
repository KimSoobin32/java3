package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 응용문제(숙)
		 * 가입된 회원정보 중 현재 데이터에서 포인트가 적은 순서대로 사용자 이름을 정렬하여 출력
		 *  결과
		 *  [정재성,한울,서한솔,강은형,김도형,서한결,홍길동,김실,이선영,차은우,정재혁]
		 *  free
		 *  
		 *  응용문제
		 *  가입된 모든 회원의 포인트 총 합
		 *  단, abstract 사용
		 *  결과 : "회원 전체의 포인트 합계는 : 34390 입니다."
		 */
		user u = new user();
		u.cal();
		int tot = u.pr();
		System.out.println("회원 전체의 포인트 합계는 : "+tot+ " 입니다.");
		
		u.to();
	}

}

abstract class basic{
	String arr[][];
	ArrayList<String[]> al = null;
	public abstract void db();
	public abstract int pr();	//getter
	public abstract void cal();	//setter

	
}

class user extends basic{
	private int tot=0;
	@Override
	public void db() {
		this.arr = new String[][] {
			 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		this.al = new ArrayList<>(Arrays.asList(this.arr));

		
	}
	@Override
		public void cal() {
			this.db();
			int w=0;
			while(w<this.al.size()) {
				//System.out.println(al.get(w)[6]);
				this.tot += Integer.parseInt(this.al.get(w)[6]);
				w++;
			}
			
		}

	@Override
	public int pr() {
		return this.tot;
		
	}
	
	public void to() {
		int w=0;
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<String[]> al3 = new ArrayList<>();
		while(w<this.al.size()) {
			//System.out.println(this.arr[w][6]);
			//Arrays.sort(this.arr[w]);
			//System.out.println(Arrays.toString(this.arr[w]));
			al2.add(Integer.parseInt(this.arr[w][6]));
			w++;
		}
		Collections.sort(al2);
		System.out.println(al2);
	}
}