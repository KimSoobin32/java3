import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//�̹��� �ϱ�, ����
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r(read):�б�, w(write):����, x(execute):����
		
		//RandomAccessFile : ����ڰ� �ش� ���ϼۼ� ������ ������ �� ����
		//�ֽŹ���
		
		try {
			String files ="C:\\java5\\File_Strame\\src\\img.jpg";
			String cp ="img222.jpg";
			RandomAccessFile file = new RandomAccessFile(files, "r");
			RandomAccessFile file2 = new RandomAccessFile(cp, "rw");
			
			
			//FileChannel : IO(FileInputStream, FileOutpusStream) ���� ����, �� ���� �� ����
			//getChannel() : RandomAccessFile �ش� �޼ҵ带 �������� ����
			
			FileChannel fc = file.getChannel();
			FileChannel target = file2.getChannel();
			
			//transgerTo, transferFrom (��������) ��� 2����
			//fc.transferTo(0, fc.size(), target);	//������ ������ Ÿ�ٿ� (�迭0, �迭����ȣ, ������ġ)
			target.transferFrom(fc, 0, fc.size());	//(������ ����, �迭0, �迭����ȣ)
			
			System.out.println(fc);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
