package java_test;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		/*
		 * �ش� �����Ͱ� �ִ� ��Ȳ �Դϴ�. �ش� ������ �� �ְ� ������ ����ڸ� ����� �Ͻÿ�.

			��� ��
			1�� : Daniel(98)
			{
				{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
				{"65","74","23","75","68","96","88","98","54"}
			}
			
			�� abstract�� �ʼ��� ����Ͻñ� �ٶ��ϴ�.
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
		
		System.out.println("1�� : "+this.arr[0][index]+"("+h+")");
		
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
		while(w<ea) {	//���ڹ迭�� ��ȯ
			sc2[w] = Integer.parseInt(sc[w]);
			w++;
		}
		//System.out.println(Arrays.toString(sc2));
		
		//�Ǵٸ� ���.. sort �� �Ǹ������� ���� ũ�� �̿�
		Arrays.sort(sc2);
		this.best =String.valueOf(sc2[ea-1]).intern();
		int c=0;
		for(String dd : sc) {
			if(dd==this.best) {
				System.out.printf("1�� : %s %s��",nm[c],dd);
			}
			c++;
		}
		//int ck = indexs(sc2);
		//System.out.printf("1�� : %s %s��",nm[ck],sc2[ck]);
		
	}
}