import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
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
		//int pc = (int)(Math.random()*10)+1;
		//System.out.println(pc);
		Random r = new Random();
		int pc = r.nextInt(10)+1;	//pc�� ���� ����
		
		Scanner s = new Scanner(System.in);
		Example2 e = new Example2();
//		String msg = null;
//		int w = 5;
//		
//		while(w>0) {
//			
//			System.out.println("�� ��ȸ�� "+w+"�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է��ϼ���.");
//			int user = s.nextInt();
//			msg = e.game(pc, user);
//			System.out.println(msg);
//			if(msg.equals("�����Դϴ�.")) {
//				System.exit(0);
//			}
//					
//			w--;
//		}
//		if(w==0) {
//			System.out.println("Ƚ�� �ʰ�");
//			System.exit(0);
//		}
//		
//		s.close();
//		System.gc();
		
		
		
		/*
		 * �Ϲ� random ���� (random double �ڷ���)
		 * int pc = (int)(Math.random()*10)+1;
		 * 
		 * util�� �̿��� random����
		 * Random r = new Random();
		 * int pc = r.nextInt(10)+1;
		 * 
		 */
		//22
		int w = 5;
		do {
			System.out.println("�� ��ȸ�� "+w+"�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է��ϼ���.");
			int user = s.nextInt();
			e.randomck(pc,user);
			String out = e.result();
			System.out.println(out);
			int check = out.indexOf("����");	//indexOf : �ܾ� �˻� (-1:����, 0:����)
			//System.out.println(check);
			if(check>-1) {
				break;
			}
			w--;
		}while(w>0);
		s.close();
		System.exit(0);
		System.gc();

	}

}
