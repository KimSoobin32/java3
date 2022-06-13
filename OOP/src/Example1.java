import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		// abstract 응용문제
		/*
		 * 1차 배열값이 있다. 해당 배열값을 모두 더한 값을 출력
		 * 단, abstract 기본 void 이름은 sender 라고 가지고 있다.
		 * 최종 값 출력은 sender에서 출력
		 * 배열은 abstract에서 사용
		 * 배열 데이터 : 6,13,22,9,12,64,32,47,39
		 */
		bb b = new bb();
		b.sender();

	}

}

abstract class aa{
	int arr[] = {6,13,22,9,12,64,32,47,39};
	public abstract void sender();
}

class bb extends aa{
	@Override
	public void sender() {
		//System.out.println(Arrays.toString(this.arr));
		int d = 0;
		int dl = this.arr.length;
		int tot = 0;
		do {			
			tot = tot + this.arr[d];
			d++;
		}while(d<dl);
		System.out.println(tot);
	}
}
