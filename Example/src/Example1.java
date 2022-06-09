import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * [up&down 게임]
		 * A파트 : PC랜덤, Scanner(5번)
		 * B파트 : PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리
		 * 
		 * 기회는 총 5번
		 * 1. pc가 숫자 하나 선택?? 힌트 random 1~10
		 * 2. 총 기회는 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * 3. 만약에 pc가 숫자7을 선택 한 기준에서 사용자 숫자와 비교
		 * -pc : 7, 사용자 : 2 => 결과 : UP
		 * 4. 총 기회는 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * 5. pc : 7, 사용자 : 4 => 결과 : UP
		 * 6.총 기회는 3번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * 7. pc : 7, 사용자 : 7 => 결과 : 정답입니다. 모든 프로세서는 정지(System.exit(0))
		 * 배열x
		 */
		int pc = (int)(Math.random()*10)+1;
		//System.out.println(pc);
		Scanner s = new Scanner(System.in);
		Example2 e = new Example2();
		String msg = null;
		int w = 5;
		
		while(w>0) {
			
			System.out.println("총 기회는 "+w+"번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력하세요.");
			int user = s.nextInt();
			msg = e.game(pc, user);
			System.out.println(msg);
			if(msg.equals("정답입니다.")) {
				System.exit(0);
			}
					
			w--;
		}
		if(w==0) {
			System.out.println("횟수 초과");
			System.exit(0);
		}
		
		s.close();
		

	}

}
