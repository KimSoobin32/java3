package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ���빮��(��)
		 * ���Ե� ȸ������ �� ���� �����Ϳ��� ����Ʈ�� ���� ������� ����� �̸��� �����Ͽ� ���
		 *  ���
		 *  [���缺,�ѿ�,���Ѽ�,������,�赵��,���Ѱ�,ȫ�浿,���,�̼���,������,������]
		 *  free
		 *  
		 *  ���빮��
		 *  ���Ե� ��� ȸ���� ����Ʈ �� ��
		 *  ��, abstract ���
		 *  ��� : "ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�."
		 */
		user u = new user();
		u.cal();
		int tot = u.pr();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� : "+tot+ " �Դϴ�.");
		
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
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
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