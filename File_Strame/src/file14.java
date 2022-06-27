import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

//�̹��� ���� ����(binary), ���� ���� ���� byte���� (Filereader (x))
//FileInputStream Stream�� �̿��ؾ� �� read()�� ���
public class file14 {

	public static void main(String[] args) throws IOException{	//throws IOException or trycatch IOException catch Exception
		
		
		try {
			//String files = "";
			
			InputStream is = new FileInputStream("C:\\java5\\File_Strame\\src\\img.jpg");
			//FileInputStream fs = new FileInputStream("");
			//System.out.println(is.read());	//255 color rgb px����, �ѹ� ������ �ε�Ǽ� ������ �ּ�ó�� ��
			//Stream�� ���ۿ� ����Ͽ� read�� ����ϴ� ���� �ش� �޸𸮿��� ������� ��Ȳ�� �߻� ����
			//��Ʈ�� ���� ���� �� �ʿ� ����
			
			//byte b[] = new byte[is.available()];	//�� ���� �ٿ�
			//System.out.println(is.read(b)); //691961 ũ�� (�� ����Ʈ), ��ü ũ�� �뷮 Ȯ��
			
			
			byte b[] = new byte[is.available()/100];	//�о���̴� �迭�� ũ�⸦ ������ ������, �̹��� �ɰ��� �ҷ��� �� ����, 1024 = 1KB
			FileOutputStream os = new FileOutputStream("img_test.jpg");	//C:\java5\File_Strame�� �����
//			int img = is.read(b);
//			System.out.println(img);	////691962 ũ�� (�� ����Ʈ), ��ü ũ�� �뷮 Ȯ��
//			os.write(b);	//�ݺ��� ������� ����
			int img=0;	//�д� ����Ʈ ��
			int check =0;	//�д� Ƚ��
			//while((img=is.read(b))!=-1) {
			/* �ٿ�ε� �� �ε带 ����̳�, ���α׷����� �̿��Ͽ� ������ �� ��� */
			while(true) {	//loop
//				check += img;
//				System.out.println(check+"%");
				//os.write(b);
				
				img=is.read(b);	//�ش� ������ �о ����Ʈ ������ �ѱ�
				if(img==-1) {
					break;
				}else {
					
					os.write(b,0,img);	//counting ���� (���α׷�����), �ٿ�ε� %�� ǥ���� �� ����ϱ� ����
				}
				check++;
				if(check%2==0) {
					System.out.println(check+"%");					
				}
				
			}

			
		}catch (IOException i) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
