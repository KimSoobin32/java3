import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		// abstract ���빮��
		/*
		 * 1�� �迭���� �ִ�. �ش� �迭���� ��� ���� ���� ���
		 * ��, abstract �⺻ void �̸��� sender ��� ������ �ִ�.
		 * ���� �� ����� sender���� ���
		 * �迭�� abstract���� ���
		 * �迭 ������ : 6,13,22,9,12,64,32,47,39
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
