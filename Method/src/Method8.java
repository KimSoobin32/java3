
public class Method8 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� ���α׷��Ӱ� �ش� DB(Database)�� �� ��
		 * Ȧ������ ���� �� ������ �ް��� �Ѵ�.
		 * �ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ�
		 */
		//���
		odbc o = new odbc();
		System.out.println(o.tot());

	}

}

class odbc{
	//private
	private int odd = 0;	//Ȧ���� ��� +1�� �����ϱ� ���� �ʵ� ������
	private int arr[];	//�迭���� ������� �ʵ��� ���
	
	public odbc() {
		int odata[] = {15,22,27,14,32,35,19,33};
		this.arr = odata;
	}
	public int tot() {
		int w = 0;
		int al = this.arr.length;
		
		while(w<al) {
			if(this.arr[w]%2==1) {
				this.odd++;	//this ���̱� ���� ->���� ������ private�� ����
				//Ȧ���̸� +1�� ����
			}
			w++;
		}
		return this.odd;	//���� ���� return��Ŵ
	}
}