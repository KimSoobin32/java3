import java.util.ArrayList;
import java.util.Arrays;

//�ߺ� ���̵� üũ �ý��� ����� : awt5_abstract �Բ� ���
//ȸ�������� : hong, lee, park
public class awt5 {

	public static void main(String[] args) {
		handle hd = new handle();
		hd.design();

	}

}

class handle extends awt5_abstact{
	private String aid;	//awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
	private String return_id;	//awt�� �ٽ� ���� �����ϴ� �������� : null�� ��� id��� ����, ���̵� ���� ���� : �ش� ���̵�� ����� �� ����
	ArrayList<String> db = null;
	@Override
	public String signok() {
		
		return this.return_id;
	}
	@Override
	public void dataload() {
		String ori[] = new String[]{"hong", "lee", "park", "jong", "kim"};
		this.db = new ArrayList<>(Arrays.asList(ori));
		
		
	}
	@Override
	public void idcheck(String id) {	//setter	
		this.return_id=null;	//awt���� �ߺ� ��ư�� Ŭ�� �� �ش� ������ ���������� �ʱ�ȭ�ϴ� �κ�
		this.aid = id;
		this.dataload();	//���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ���ϰ� ��
		int ea = this.db.size();
		int w = 0;
		while(w<ea) {
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
		
	}
}