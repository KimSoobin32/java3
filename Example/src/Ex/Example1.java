package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		//�ܺ� class�� ����Ͽ� ���� ���μ����� �ۼ�
		/*
		 * ���� 2���� �迭 �����Ͱ� �ִ�. ��, 2���� �迭�� �ϳ��� �迭�� ��ħ
		 * �� ��� �ߺ��� ���� �ϳ��� ó��
		 * 1�� DB : 11,22,33,44,55
		 * 2�� DB : 8,10,11,19,44
		 * ������
		 * [8,10,11,19,22,33,44,55]
		 * ��Ʈ Collection �̿� ��, ArrayList LinkedList�� ��� ��
		 */
		/*
		 * 1. 1�� db, 2�� db �ߺ��� �� �� 2�� db ����
		 * 2. 2�� db�� 1�� db�� �߰�
		 * 3. 1�� db sort�� ����
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
//					break;	//�ѹ��� �ߺ��� ��츸 ����
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


