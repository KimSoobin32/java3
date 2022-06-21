import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		try {
			ex e = new ex();
			e.loader("data");
			
			//자기자신을 바로 예외상황으로 만듬
			//Exception aaa = new Exception();
			//throw aaa;	//catch로.., throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 return
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
				
			}else {
				
			}
		}
	}

}

class ex{
	Exception ep = null;
	//IOException io = null;
	public void loader(String a) throws Exception{	//throws try~catch를 받기 위한 class를 로드
		/* 잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황임 */
		if(a=="ok") {
			int keycode = Integer.valueOf(a);	//정상적이지만, loader class자체적인 오류가 발생
		}else {
			
			
//			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
//			this.ep = new Exception();
//			
//			throw this.ep;
				
						
			
			//good
			try {
				if(a=="ok") {
					int keycode = Integer.valueOf(a);	
				}else {
					System.out.println("test");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				this.ep = new Exception();	//자신의 오류 사항을 리턴받아서 확인함
				throw this.ep;
				
			}
		
		}
	}
}