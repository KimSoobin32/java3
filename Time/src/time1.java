
public class time1 {

	public static void main(String[] args) {
		/*
		 * try-catch문 : 예외처리기능 문법
		 */
		int w=1;
		do {
			try {	//예외 발생할 코드를 적용
				Thread.sleep(1000);	//1000 = 1초, cpu에 잠깐 자라..명령
				//Thread.sleep : 일시정지 상태를 말함
				
			}catch(InterruptedException e){
				//InterruptedException : 해당 예외 발생이 되었을 경우 처리하기 위한 문법
			}
			catch(Exception e){
				
			}
			System.out.println(w);
			
			w++;
		}while(w<=10);

	}

}
