package Java_Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;	//회사 총 잔고금액
	//protected String se = "";	//보안키, 이 키 없으면 작동 안되게 할 때..
	public void start(String a) {};	//오버로딩
	public abstract void start();
	//public abstract void db();	//throws IOException 못 씀.. 추상클래스라.., 예외처리 사용하지 않음
	abstract void db() throws IOException;	//public 없애면 쓸 수 았음..
	public abstract int[] check();	//getter (return 2개 이상)
}
