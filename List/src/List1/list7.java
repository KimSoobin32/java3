package List1;

import java.util.ArrayList;

public class list7 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ArrayList �Ǵ� LinkedList �� �߿� ���ϴ� �޼ҵ带 ����
		 * 2���迭 ����
		 * �ش� ������ ���� ��� ���Ͽ� ¦������ Ȧ�������� Ȯ��
		 * Integer data[][] = {
		 * 	{10,20,30,40,50,60,70},
		 * 	{3,6,9,12,15,17,19}
		 * }
		 * ����� �� ���� 361 �̰� Ȧ�� �Դϴ�.
		 */
		 Integer data[][] = {
			 {10,20,30,40,50,60,70},
			 {3,6,9,12,15,17,19}
		 };
		 ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> d1 = new ArrayList<>();
		 ArrayList<Integer> d2 = new ArrayList<>();
		 
		 
		 int wwl = data[0].length;
		 
		 int ww=0;
		 while(ww<wwl) {
			 d1.add(data[0][ww]);
			 d2.add(data[1][ww]);
			 ww++;
		 }
		 al.add(d1);
		 al.add(d2);
			
		 
		 int d=0;
		 int dl = al.size();
		 int ddl = al.get(1).size();
		 int tot=0;
		 String msg = "";
		 String oe = "";
		 do {
			 int dd=0;
			 do {
				 //System.out.println(data[d][dd]);
				 //System.out.println(al.get(d).get(dd));
				 tot += al.get(d).get(dd);
				 dd++;
			 }while(dd<ddl);			 
			 d++;
		 }while(d<dl);
		 if(tot%2==0) {
			 oe = "¦��";
		 }else {
			 oe = "Ȧ��";
		 }
		 msg = "�� ���� "+tot+" �̰� "+oe+" �Դϴ�.";
		 System.out.println(msg);
//		 System.out.println("a"+d1);
//		 System.out.println("b"+d2);
//		 System.out.println("c"+al);
	}

}
