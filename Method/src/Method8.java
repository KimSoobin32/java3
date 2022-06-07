
public class Method8 {

	public static void main(String[] args) {
		/*
		 * 응용문제 협업 프로그래머가 해당 DB(Database)에 값 중
		 * 홀수값에 대한 총 갯수를 받고자 한다.
		 * 해당 갯수를 출력될 수 있도록 코드를 작성
		 */
		//출력
		odbc o = new odbc();
		System.out.println(o.tot());

	}

}

class odbc{
	//private
	private int odd = 0;	//홀수일 경우 +1씩 증가하기 위한 필드 변수값
	private int arr[];	//배열값이 변경되지 않도록 사용
	
	public odbc() {
		int odata[] = {15,22,27,14,32,35,19,33};
		this.arr = odata;
	}
	public int tot() {
		int w = 0;
		int al = this.arr.length;
		
		while(w<al) {
			if(this.arr[w]%2==1) {
				this.odd++;	//this 붙이기 주의 ->위에 선언한 private에 접근
				//홀수이면 +1씩 증가
			}
			w++;
		}
		return this.odd;	//최종 값을 return시킴
	}
}