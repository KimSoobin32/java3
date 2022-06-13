import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class awt1 {
	
	
	public awt1() {
		
	}
	
	public static void main(String[] args) {
		// Frame > Bound > Object (패널 없이 제작)
		
		Frame fr = new Frame();	//창
		
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null);	//패널을 사용 안함
		fr.setBounds(150, 150, 500, 500);	//(화면 x축(위치), 화면 Y축, 가로길이, 높이)
		
		Button btn = new Button("클릭");
		Button closebtn = new Button("닫기");
		Label msg = new Label("");
		//msg.setBackground(Color.red);	//색상 입력
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		//Object를 Frame에 적용하게 됨
		fr.add(btn);
		fr.add(closebtn);
		fr.add(msg);
		
		//addActionListener(버튼) : 이벤트 메소드, 자동완성 활용, 단, awt1필드 this 사용 절대 안됨
		closebtn.addActionListener(new ActionListener() {	//new ActionListener() : Override 메소드 자동생성
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		btn.addActionListener(new ActionListener() {
			String a = "AWT 처음이지 ㅇㅇ";		//addActionListener : 이벤트 메소드 필드에 String을 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);	//this를 이용하여 핸들링 가능
				
			}
		});
		
	}

}

