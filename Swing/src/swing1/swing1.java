package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class (BOX상태)
		//float, char, byte, long, short (기본타입)
		//wrapper class : Byte, Integer, Long, Double
		
		int a = new Integer(20);		//unboxing 상태
		Integer b = new Integer(20);	//new Integer(boxing 상태)
		//int b = new Integer(20);
		if(a==b) {
			System.out.println(a+b);
		}
		
		Integer no1 = 10;	//unboxing (new 있으면 boxing
		
		
		Integer no = new Integer(99);	//boxing
		int aa = no;	//자동 unboxing
		
		Integer bb = no.intValue();	//unboxing
		System.out.println(bb);
		
		/*
		 * 박싱과 박싱을 비교할 때는 equals를 사용해야만 비교가 이루어짐
		 */

	}

}
