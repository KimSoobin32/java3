
public class time1 {

	public static void main(String[] args) {
		/*
		 * try-catch�� : ����ó����� ����
		 */
		int w=1;
		do {
			try {	//���� �߻��� �ڵ带 ����
				Thread.sleep(1000);	//1000 = 1��, cpu�� ��� �ڶ�..���
				//Thread.sleep : �Ͻ����� ���¸� ����
				
			}catch(InterruptedException e){
				//InterruptedException : �ش� ���� �߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			catch(Exception e){
				
			}
			System.out.println(w);
			
			w++;
		}while(w<=10);

	}

}
