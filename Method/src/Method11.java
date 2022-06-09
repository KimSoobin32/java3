import App.App1;	//다른 package를 로드 시 import하여 사용함
//외부 package에서 App1.java파일 로드 및 기본 파일을 로드하여 사용
public class Method11 {

	public static void main(String[] args) {
		//blue b = new blue();
		App1 b = new App1();	//main메소드를 로드하게 됨
		//System.out.println(b.box());
		b.main(args);
		b.abox();	//main메소드 안에서 abox라는 void메소드를 로드하는 부분
	}

}
