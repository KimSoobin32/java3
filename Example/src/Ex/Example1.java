package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		//외부 class를 사용하여 다음 프로세서를 작성
		/*
		 * 다음 2개의 배열 데이터가 있다. 단, 2개의 배열을 하나의 배열로 함침
		 * 그 대신 중복된 값은 하나로 처리
		 * 1번 DB : 11,22,33,44,55
		 * 2번 DB : 8,10,11,19,44
		 * 결과출력
		 * [8,10,11,19,22,33,44,55]
		 * 힌트 Collection 이용 단, ArrayList LinkedList를 사용 시
		 */
		/*
		 * 1. 1번 db, 2번 db 중복값 비교 및 2번 db 삭제
		 * 2. 2번 db를 1번 db에 추가
		 * 3. 1번 db sort로 정렬
		 */

		outclass ot = new outclass();
		ot.filter();

	}

}
class outclass{
	
	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;
	ArrayList<Integer> c1 = null;
	public void filter() {
		Integer a[], b[];
		a = new Integer[]{11,22,33,44,55};
		b = new Integer[]{8,10,11,19,44};
		this.a1 = new ArrayList<>(Arrays.asList(a));
		this.b1 = new ArrayList<>(Arrays.asList(b));
		int w=0;
		do {
			int ww=0;
			int z = this.b1.size();
			while(ww<z) {
				if(this.a1.get(w)==this.b1.get(ww)) {
//					this.b1.remove(ww);
//					break;	//한번만 중복일 경우만 가능
					this.b1.remove(ww);
					this.b1.add(ww,0);
				}
				ww++;
			}
			w++;
		}while(w<this.a1.size());
		//System.out.println(this.b1);
		
		int t=0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}
		Collections.sort(this.a1);
		System.out.println(this.a1);
	}
	
}


