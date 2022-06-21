import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * data = {"hong45","lee90","kang100","park70","kim72"};
		 * �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� ����
		 * �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�
		 * ���� ���� ���� ���� ���� ���� ������ ��
		 * main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ��� ����� ���;� ��
		 * ��, ���� ��ȯ �� ������ �߻��� ��� finally�� üũ �� 
		 * main2�޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� �������� ��
		 */
		
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		try {
			
			main2(data);
			
		}catch(Exception e) {
			System.out.println(e);	//e�ڿ� �� ���̸� �ڵ� toString(), 11���� �̻�
		}finally {
			ArrayList<String> rdata = new ArrayList<>();
			int j = 0;
			String modify;
			while(j<data.length) {
				modify = data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			//System.out.println(Arrays.toString(cdata));
			int q=0;
			do {
				cdata[q] = rdata.get(q);
				q++;
			}while(q<rdata.size());
			
			
			try {
				main2(cdata);
			}catch(Exception h) {
				//printStackTrace() ���� ��� ����
				//System.out.println(h.toString());
				//System.out.println(h.getMessage());	//���� ���� ������ null
				if(h.getMessage()==null) {
					System.exit(0);
				}else {
					System.out.println(h);
				}
				
			
			}
			
		}

	}
	
	static void main2(String[] d) throws Exception{
		int w=0;
		int n;
		int tot=0;
		while(w<d.length) {
			n = Integer.valueOf(d[w]);
			tot += n;
			w++;
		}
		System.out.println(tot);
		Exception c = new Exception();
		throw c;
	}


}
