package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 2�� �迭����, �������� ����
public class Arrays_more {

	public static void main(String[] args) {
		String member_data[][] = new String[][] {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"}
		};
		//String[] : 2���迭 �̻�, Integer[] : 2���迭 �̻� 
		ArrayList<String[]> list = new ArrayList<>(Arrays.asList(member_data));
		
		int w=0;
		while(w<list.size()) {
			System.out.println(list.get(w)[2]);	//.get(�ݺ���)[�ε��� ����]
			w++;
		}

	}

}