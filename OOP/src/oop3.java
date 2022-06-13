
public class oop3 {
//Multi Thread(멀티 쓰레드) : start, run, sleep, setStop
//멀티 쓰레드 : CPU에 코어와 관계가 있다.
	public static void main(String[] args) {
		//쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말함
		//Multi Thread(멀티 쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시사용
		
		//쓰레드 -> 음악 -ㄴ한번에한가지
		//멀티쓰레드 -> 음약, 유튜브, 문서 (멀티 태스킹) 여러작업 한번에
		
 		Thread my = new mythread();	//부모 메소드 = 자식메소드
		//기존사용형태 : 자식메소드 = 자식 메소드
 		my.start();	//Thread 메소드에 기본 run을 작동하기 위한 start 명령어(메소드)
 		
 		Thread my2 = new test2();
 		my2.start();
 		
		int ct = 1;
		while(ct<=10) {
			System.out.println("내부클래스: "+ct);
			ct++;
		}
	}

}

class test2 extends Thread{
	@Override
	public void run() {	//multi thread 기본은 public
		int w=1;
		do {
			System.out.println("외부클래스2: "+w);
			w++;
		}while(w<=10);
	}
}

class mythread extends Thread{	//Thread : JVM 기본으로 탑재되어있는 메소드, Thread는 단독으로 사용하지 않음(클래스명으로 쓰지 않음, extends로..)
	@Override
	public void run() {	//run이란 : 멀티메소드 기본 실행 메소드
		int w=1;
		do {
			System.out.println("외부클래스: "+w);
			w++;
		}while(w<=10);
		
	}
}
//실행 돌릴때마다 결과 다르게 나옴