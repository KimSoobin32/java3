package java_test;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		/*
		2�� ����
		{ "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" }
		������ ���� ������ �ֽ��ϴ�.
		�ش� ��ٱ��ϴ� ������ŭ ��ü ���� ����Ͽ� �� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		[���� 1���� ����]
		��� = 250
		���� = 200
		���� = 700
		�� = 2300
		��ġĵ = 1100
		��� = 850
		[������]
		�����Ͻð��� �ϴ� �� ���� �ݾ��� :  XXXXX �� �Դϴ�.
		�� ���� 1���� ���� ���� ���� �迭�� ���� �����Ͻñ� �ٶ��, �ش� �迭 �⺻���� ���� ���� ������ �ʾƾ� �մϴ�.
		���� 1���� ���� ���� ������ ������ java ���Ͽ��� �ε� �Ͽ� �������ñ� �ٶ��ϴ�.
		test2.java test2_data.java�� �Բ� �̿��մϴ�.
		*/
		
//		test2_data d = new test2_data();
//		String arr[] = { "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
//		
//		int w=0;
//		int h=0;
//		int pr2=0;
//		while(w<arr.length) {
//			pr2 = Integer.parseInt(arr[w].split("=")[1]);
//			//System.out.println(pr2 + " "+d.price[w]);
//			h +=  pr2*d.price[w];
//			w++;
//		}
//		System.out.println("�����Ͻð��� �ϴ� �� ���� �ݾ��� : "+h+" �� �Դϴ�.");
		basket b =new basket();
		b.basket_data();
		System.out.println("�����Ͻð��� �ϴ� �� ���� �ݾ��� : "+b.total+" �� �Դϴ�..");

	}

}

class basket extends test2_data{
	static int total = 0;
	public void basket_data() {
		String user[] = { "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" };
		System.out.println(Arrays.toString(this.money));
		int w=0;
		int h=0;
		int pr2=0;
		while(w<user.length) {
		pr2 = Integer.parseInt(user[w].split("=")[1]);
		//System.out.println(pr2 + " "+d.price[w]);
		this.total +=  pr2* Integer.parseInt(this.money[w].split("=")[1]);
		w++;
	}
	}
}
