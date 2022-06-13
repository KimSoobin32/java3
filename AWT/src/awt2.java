import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//GUI - main 클래스 손 안대기, 부모클래스 필드에 선언해야 함 주의
//외부 클래스로 awt 생성, awt는 메인 클래스에서 쓰지 않음
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();
	}

}
class loginok extends login{	//화면 전환하는 자식 클래스
	public loginok() {
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login{	//<-연습용 > 원래는 extends로 추상 클래스(abstract)를 먼저 로드하여 필드에 적용시켜야 함
	Frame fr = new Frame();
	Font ft = new Font("돋움체",Font.BOLD,20);	//("글자체",Font.BOLD(굵은체),글자크기)
	Button close_btn = new Button("프로그램 종료");
	Button lg_btn = new Button("로그인");
	Button ship_btn = new Button("회원 가입");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label();

	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		this.mid.setFont(ft);	//글자 속성을 적용하고자하는 오브젝트 선택
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*');	//setEchoChar : 외따옴표''만 사용 가능
				
		this.lg_btn.setBackground(Color.pink);
		this.ship_btn.setBackground(Color.gray);
		this.close_btn.setBackground(Color.DARK_GRAY);
		//this.msg2.setBackground(Color.red);
		
		this.mid.setBounds(100, 60, 200, 40);
		this.mpw.setBounds(100, 120, 200, 40);
		this.lg_btn.setBounds(100, 180, 200, 40);
		this.ship_btn.setBounds(100, 240, 200, 40);
		this.close_btn.setBounds(100, 300, 200, 40);
		this.msg.setBounds(100, 100, 200, 20);

		
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.lg_btn);
		this.fr.add(this.ship_btn);
		this.fr.add(this.close_btn);
		this.fr.add(this.msg);

		this.clicks();
	}
	public void clicks() {	//버튼에 관한 모든 핸들링 메소드 집합소
		
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);	//해당 프레임 종료
				loginok ok = new loginok();	//다음 프레임 로드
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	//프로그램 종료 이벤트 핸들링 메소드
				System.exit(0);
				
			}
		});
		
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane();	//swing API 경고 옵션 로드
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText();	//this 없이 그냥 쓰면 부모 클래스(login)알아서 찾아감, 필드 선언해야함 주의
				String user_pw = mpw.getText();
				//Object명.getText() 사용자가 입력한 값을 가져올 때 사용
				if(user_id.equals("")) {	//null 사용 금지, null또한 값이 있는 상태를 말함, ""가 진짜 비어있는 것..
					msg.setText("아이디를 입력하세요.");					
					//alert.showMessageDialog(null, "아이디를 입력하세요.","경고메세지",JOptionPane.ERROR_MESSAGE);
					//alert.showMessageDialog(null, "아이디를 입력하세요.");
				}else {
					if(user_pw.equals("")){
						msg.setText("패스워드를 입력하세요.");
					}else {
						msg.setText("로그인을 진행합니다.");
						
					}
					
				}
				
			}
		});
		
		
	}
}
