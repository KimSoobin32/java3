package Java_Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷��Դϴ�. [11, 16, 27, 31, 38, 44]
		 * ���μ��� ���۽� "���ڸ� �Է��� �ּ���:" �� 6���� ���ڸ� �Է¹ް� �˴ϴ�.
		 * �׸��� lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ����
		 * ����� ���Ͽ� ��� ��������� �����ϴ� ���α׷� �ڵ带 �ۼ�
		 * 
		 * [��� ����]
		 * �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�!
		 * 
		 */
//		pro p = new pro();
//		p.start();
//		int correct = p.check();
//		System.out.println("�ζ� ��� : �� "+correct+"���� ��ȣ�� ���߼̽��ϴ�!");
		lotto lt = new lotto();
		lt.setter();

	}

}

//class pro{
//	ArrayList<Integer> al = null;
//	ArrayList<Integer> lottoal = null;
//	int chance = 6;
//	public void start() {
//		try {
//			Scanner sc = new Scanner(System.in);
//			this.al = new ArrayList<>();
//			int n=0;
//			int w=0;
//			while(w<this.chance) {
//				System.out.println("���ڸ� �Է��� �ּ���: ");
//				n = sc.nextInt();
//				this.al.add(n);
//				w++;
//			}
//			sc.close();
//			this.load();
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		
//	}
//	
//	public void load() throws IOException {
//		
//			FileReader fr = new FileReader("C:\\javatest\\javatest\\src\\Java_Test\\lotto.txt",Charset.forName("UTF8"));
//			BufferedReader br = new BufferedReader(fr);
//			this.lottoal =new ArrayList<>();
//			
//			String num="";
//			while((num=br.readLine())!=null) {
//				this.lottoal.add(Integer.parseInt(num));				
//			}
//			br.close();
//			//System.out.println(this.lottoal);
//		
//	}
//	
//	public int check() {
//		int w=0;
//		int cnt=0;
//		while(w<this.al.size()) {
//			int ww=0;
//			while(ww<this.lottoal.size()) {
//				if(this.al.get(w)==this.lottoal.get(ww)) {
//					cnt = cnt + 1;
//				}
//				ww++;
//			}
//			w++;
//		}
//		return cnt;
//	}
//}

class lotto{
	Scanner sc = null;
	ArrayList<Integer> k = null;
	String url ="C:\\javatest\\javatest\\src\\Java_Test\\lotto.txt";
	public void setter() {
		try {
			this.fileload();
			
		}catch (Exception e) {
			
		}
	}
	public String getter() {
		return null;
	}
	public void fileload() throws IOException {
		try {
			InputStream fi = new FileInputStream(this.url);
			System.out.println(fi.available()); //��ü ũ��
			byte[] temp = new byte[fi.available()];
			System.out.println(temp);
			int ea = fi.read(temp);
			String test = new String(temp,"UTF8");
			System.out.println(test);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
