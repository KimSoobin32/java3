
public class Example2 {

//	public static void main(String[] args) {
//		
//	}
	/*
	 * [up&down ����]
	 * A��Ʈ : PC����, Scanner(5��)
	 * B��Ʈ : PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��
	 * 
	 * ��ȸ�� �� 5��
	 * 1. pc�� ���� �ϳ� ����?? ��Ʈ random 1~10
	 * 2. �� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
	 * 3. ���࿡ pc�� ����7�� ���� �� ���ؿ��� ����� ���ڿ� ��
	 * -pc : 7, ����� : 2 => ��� : UP
	 * 4. �� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
	 * 5. pc : 7, ����� : 4 => ��� : UP
	 * 6.�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
	 * 7. pc : 7, ����� : 7 => ��� : �����Դϴ�. ��� ���μ����� ����(System.exit(0))
	 * �迭x
	 */
	private int pno;
	private int uno;
	private String result;
	
	public String game(int p, int u) {
		this.pno = p;
		this.uno = u;	
			
		if(this.pno<this.uno) {
			this.result = "DOWN";
		}else if(this.pno>this.uno){
			this.result = "UP";
		}else {
			this.result = "�����Դϴ�.";
			
		}
			
		
		//System.out.println(p+" "+u);
		return this.result;
	}

}
