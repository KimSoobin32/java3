package java_test;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		/*
		 * 해당 데이터가 있는 상황 입니다. 해당 데이터 중 최고 고점자 사용자만 출력을 하시오.

			출력 예
			1등 : Daniel(98)
			{
				{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
				{"65","74","23","75","68","96","88","98","54"}
			}
			
			※ abstract는 필수로 사용하시길 바랍니다.
		 */
		
		
		
		score2 s = new score2();
		s.check();
		
		s.load();

	}

}

abstract class score1{
	String arr[][] = {
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
			};
	public abstract void check();
	
	public abstract int indexs(int[] data2);
	public abstract void load();
	
	
}

class score2 extends score1{
	static String best=null;
	@Override
	public void check() {

		int ea = this.arr[0].length;
		int h=Integer.parseInt(this.arr[1][0]);
		int index=0;

		int ww=0;
		while(ww<ea) {
			if(h<Integer.parseInt(this.arr[1][ww])) {
				h=Integer.parseInt(this.arr[1][ww]);
				//System.out.println(h+ " "+Integer.parseInt(arr[1][ww])+ " h:"+h);
				index = ww;
									
			}
			ww++;
		}
		
		System.out.println("1등 : "+this.arr[0][index]+"("+h+")");
		
	}
	
	@Override
	public int indexs(int[] data2) {
		int s=0;
		int z=0;
		while(s<data2.length) {
			if(data2[z]<data2[s]) {
				z = s;
			}
			s++;
		}
		return z;
	}
	
	@Override
	public void load() {
		String[] nm = { "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String[] sc = {"65","74","23","75","68","96","88","98","54"};
		int ea = sc.length;
		int sc2[] = new int[ea];
		int w=0;
		while(w<ea) {	//숫자배열로 변환
			sc2[w] = Integer.parseInt(sc[w]);
			w++;
		}
		//System.out.println(Arrays.toString(sc2));
		
		//또다른 방법.. sort 후 맨마지막이 제일 크다 이용
		Arrays.sort(sc2);
		this.best =String.valueOf(sc2[ea-1]).intern();
		int c=0;
		for(String dd : sc) {
			if(dd==this.best) {
				System.out.printf("1등 : %s %s점",nm[c],dd);
			}
			c++;
		}
		//int ck = indexs(sc2);
		//System.out.printf("1등 : %s %s점",nm[ck],sc2[ck]);
		
	}
}