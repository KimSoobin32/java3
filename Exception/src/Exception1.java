
/*
 * Exception : try,catch�� �Բ� ����� �ϰ� ��. (���� ó������)
 * - RuntimeException (Error �߻� �� ���� ó�� üũ�� ����) - Null, Class, Array size (:RuntimeException ���� �߻��ϴ� ����)
 * - OtherException (����ó�� üũ���� ��� ��)
 * Exception ����
 * Arithmetic : 0���� ���� �� �߻�
 * NullPointer : null ��ü�� ������ ��
 * ClassCast : Ŭ������ ��ȯ
 * NumberFormat : ���������� ��ȯ
 * ArrayIndexOutOfBound : �迭 ���� �� �ε��� ��ȣ ����
 * IOException : ����� ���� �߻� O
 * Exception : ��ü ����ó�� ��Ȳ O
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try: �ش� ���� int�� ������1
			a = Integer.valueOf(b);	//error�߻� : a1��� �����ε� ������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ����2
			//int a = Integer.valueOf("1");
		}catch(NumberFormatException e) {
			System.out.println(e);	//� �κп��� ������ �߻�3
		}finally {	//����ó�� �ϰ� �� �� ó��
			b = b.replaceAll("[a-zA-Z]", "");	//������ ��ó��4
			a = Integer.valueOf(b);	//�ٽ� ������ ���ۼ��ؼ� ���5
			//a = Integer.valueOf("1������"); error
			
		}
		
		System.out.println(b);
		System.out.println(a);	//���� ����� ���6

	}

}
