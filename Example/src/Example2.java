
public class Example2 {

//	public static void main(String[] args) {
//		
//	}
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
//	private int pno;
//	private int uno;
//	private String result;
//	
//	public String game(int p, int u) {
//		this.pno = p;
//		this.uno = u;	
//			
//		if(this.pno<this.uno) {
//			this.result = "DOWN";
//		}else if(this.pno>this.uno){
//			this.result = "UP";
//		}else {
//			this.result = "정답입니다.";
//			
//		}
//			
//		
//		//System.out.println(p+" "+u);
//		return this.result;
//	}
	
	//22
	private int val1; //pc
	private int val2; //user
	private String msg;	//결과메세지
	public void randomck(int pc,int user) {	//setter (인수값 받음)
		this.val1 = pc;
		this.val2 = user;
		if(this.val1>this.val2) {
			this.msg = "UP";
		} else if(this.val1<this.val2) {
			this.msg = "DOWN";
		} else {
			this.msg = "와.. 정답...!";
		}
	}
	
	public String result() {	//getter (인수값 x) return만		
		return this.msg;
	}

}
