package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class (BOX����)
		//float, char, byte, long, short (�⺻Ÿ��)
		//wrapper class : Byte, Integer, Long, Double
		
		int a = new Integer(20);		//unboxing ����
		Integer b = new Integer(20);	//new Integer(boxing ����)
		//int b = new Integer(20);
		if(a==b) {
			System.out.println(a+b);
		}
		
		Integer no1 = 10;	//unboxing (new ������ boxing
		
		
		Integer no = new Integer(99);	//boxing
		int aa = no;	//�ڵ� unboxing
		
		Integer bb = no.intValue();	//unboxing
		System.out.println(bb);
		
		/*
		 * �ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ߸� �񱳰� �̷����
		 */

	}

}
