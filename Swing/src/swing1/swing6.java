package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		tel.setBorder(new LineBorder(Color.RED));
		tel.setFont(new Font("\uB3CB\uC6C0\uCCB4", tel.getFont().getStyle(), tel.getFont().getSize()));
		tel.setBounds(40, 39, 239, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("인증번호 받기");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(289, 38, 139, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.BLACK));
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(40, 75, 388, 23);
		contentPane.add(msg);
		
			
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//키를 누를 경우 적용되는 이벤트 클래스
		tel.addKeyListener(new KeyAdapter() {	//키를 누를 경우 적용되는 이벤트 클래스 addKeyListener
			//keyPressed : 키를 누를 때
			//keyReleased : 키를 눌렀다가 up이 되었을 때
			//keyTyped : 키를 문자를 입력 받을 때
			@Override
			public void keyTyped(KeyEvent k) {
				//입력값에 대한 자리수 제한
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
				//System.out.println(k);
//				System.out.println(k.getKeyChar());
//				System.out.println(k.getKeyCode());
				
				int n = Integer.valueOf(k.getKeyChar());	//아스키로 변경됨
				//System.out.println(n);
				if(n>=48 && n<=57) {	//sysout에는 정상적인 문자 getKeyChar() 보이지만 Integer로 변경 시 아스키코드로 변경이 됨
					
					msg.setText("");
				}else {
					
					//msg.setText("숫자만 입력하세요.");
					//if(!Character.isDigit(n)) {
						msg.setText("숫자만 입력하세요.");
						k.consume();	//keyTyped를 이용해야 함, comsoume은 해당 입력 시 null로 간주함, 키이벤트에서만 작동함(전용)
						//return;
					//}
					
				}
			}
		});
	}
}
