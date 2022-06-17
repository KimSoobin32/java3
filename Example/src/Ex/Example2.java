package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
	
		/*
		 * 회원정보 DB가 있는 상황
		 * 해당 정보 중에서 naver.com 메일 주소를 사용하는 총 고객인원수를 출력
		 * 단, DB를 로드 시 추상클래스에서 로드가 되도록 함
		 * {"이름","통신사","전화번호","나이","주소","이메일","포인트"}
		 */
		/*
		 {
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
		}
		 */
		bb b = new bb();
		//b.db();
		b.setter("naver.com");
		int tot = b.pr();
		System.out.println(tot);

	}

}

abstract class aa{
	String arr[][];
	ArrayList<String> al = null;
	public abstract void db();
	public abstract int pr();	//getter
	public abstract void setter(String email);
}

class bb extends aa{
	//private String arr[][];
	int ea = 0;
	int total = 0;
	@Override
	public void setter(String email) {
		
		System.out.println(email);
		this.db();
		int d=0;
		
		do {
			//ArrayList로 생성 시 메모리 할당 오버되는 상황이 발생할 수 있음
//			this.al = new ArrayList<>(Arrays.asList(this.arr[d][5]));
//			if(this.al.get(0).indexOf(email)!=-1) {	//배열.indexOf불가 ex [hong@gmail.com]
//				this.total++;
//			}
			
			//원시 형태의 배열사항으로 카운팅을 하게 됨 indexOf -1(없음), -1외의 모든 정수는 값이 있음
			if(this.arr[d][5].indexOf(email)!=-1) {
				this.total += 1;
			}
			d++;
		}while(d<this.ea);
		
		
		
	}
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
		
		this.ea = this.arr.length;
		
		this.pr();
		
	}
	
	@Override
	public int pr() {
//		int w = 0;
//		int wl = this.arr.length;
//		int wdl = this.arr[0].length;
//		int ct = 0;
//		while(w<wl) {
//			int ww = 0;
//			while(ww<wdl) {
//					if(this.arr[w][ww].indexOf("naver.com") != -1) {
//						ct++;
//					}
//											
//				ww++;
//			}
//			w++;
//		}
//		System.out.println(ct);
//		return ct;
		return this.total;
		
	}
}
