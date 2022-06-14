package Ab2;
import Ab.method_1;	//package Ab에서 main class를 로드함

public class ab2_method extends Ab.method_1{

	public static void main(String[] args){
		//@Override
		Ab.method_1 at = new Ab.method_1();
		at.recall();	//public 메소드 실행
		name();			//protected 메소드 실행
		at.main(args);	//main 메소드 실행
		//private는 무조건 그 클래스에서만
		

	}

}
