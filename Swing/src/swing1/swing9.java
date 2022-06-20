package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//JEditorPane 은 게시판 내용 출력 또는 입력 등 사용 되며,
	//하이브리드 웹앱... HTML
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(23, 10, 755, 725);
		contentPane.add(webpage);
		webpage.setContentType("text/html");	//ContentType : 문자도 사용 그리고 HTML 코드도 사용
		webpage.setText("<h1>APINK 2022!!</h1>"
				+"<img src='https://cdn.ppomppu.co.kr/zboard/data3/2020/0519/m_20200519183135_bubldmdv.png'/>"
				+"<br><font color='orange'>APINK FOR~~~</font>");
	}
}
