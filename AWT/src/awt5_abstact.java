import java.awt.*;
import java.awt.event.*;

//AWT 환경설정
public abstract class awt5_abstact {

	public abstract String signok();	//getter
	public abstract void idcheck(String id);	//setter
	public abstract void dataload();	//Database
	
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200, 200, 300, 450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		
		this.bt = new Button("중복체크");
		this.close = new Button("종료");
		this.mid = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.fr.setBackground(Color.gray);
		this.bt.setBackground(Color.DARK_GRAY);
		
		this.bt.setBounds(195, 150, 80, 25);
		this.mid.setBounds(25, 150, 150, 25);
		this.msg.setBounds(25, 200, 250, 25);
		this.close.setBounds(195, 400, 80, 25);
		
		this.fr.add(this.bt);
		this.fr.add(this.mid);
		this.fr.add(this.msg);
		this.fr.add(this.close);
		
		this.click();	//awt 디자인 완료 후 해당 핸들링 메소드로 이동
		
	}
	
	public void click() {
		this.bt.addActionListener(new ActionListener() {	//중복확인버튼	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//awt5_abstact.this.msg.setText("체크완료");		//setText(출력), getText(입력값 가져오기)
				String userid = awt5_abstact.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요.");
				}else {
					idcheck(userid);
					//msg.setText("");
					String result = signok();
					if(result==null) {
						msg.setText("사용 가능한 아이디입니다.");
					}else {
						msg.setText("다른 아이디를 입력해주십시오.");
					}
				}
				
			}
		});
		
		this.close.addActionListener(new ActionListener() {		//종료버튼	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}
	

}
