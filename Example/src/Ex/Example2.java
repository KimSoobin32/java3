package Ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
	
		/*
		 * ȸ������ DB�� �ִ� ��Ȳ
		 * �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� �� ���ο����� ���
		 * ��, DB�� �ε� �� �߻�Ŭ�������� �ε尡 �ǵ��� ��
		 * {"�̸�","��Ż�","��ȭ��ȣ","����","�ּ�","�̸���","����Ʈ"}
		 */
		/*
		 {
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
			//ArrayList�� ���� �� �޸� �Ҵ� �����Ǵ� ��Ȳ�� �߻��� �� ����
//			this.al = new ArrayList<>(Arrays.asList(this.arr[d][5]));
//			if(this.al.get(0).indexOf(email)!=-1) {	//�迭.indexOf�Ұ� ex [hong@gmail.com]
//				this.total++;
//			}
			
			//���� ������ �迭�������� ī������ �ϰ� �� indexOf -1(����), -1���� ��� ������ ���� ����
			if(this.arr[d][5].indexOf(email)!=-1) {
				this.total += 1;
			}
			d++;
		}while(d<this.ea);
		
		
		
	}
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
