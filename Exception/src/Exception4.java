import java.io.IOException;

public class Exception4 {

	public static void main(String[] args) {
		try {
			ex e = new ex();
			e.loader("data");
			
			//�ڱ��ڽ��� �ٷ� ���ܻ�Ȳ���� ����
			//Exception aaa = new Exception();
			//throw aaa;	//catch��.., throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� return
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
				
			}else {
				
			}
		}
	}

}

class ex{
	Exception ep = null;
	//IOException io = null;
	public void loader(String a) throws Exception{	//throws try~catch�� �ޱ� ���� class�� �ε�
		/* �߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ�� */
		if(a=="ok") {
			int keycode = Integer.valueOf(a);	//������������, loader class��ü���� ������ �߻�
		}else {
			
			
//			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
//			this.ep = new Exception();
//			
//			throw this.ep;
				
						
			
			//good
			try {
				if(a=="ok") {
					int keycode = Integer.valueOf(a);	
				}else {
					System.out.println("test");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				this.ep = new Exception();	//�ڽ��� ���� ������ ���Ϲ޾Ƽ� Ȯ����
				throw this.ep;
				
			}
		
		}
	}
}