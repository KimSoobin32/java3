package Java_Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("캠핑장 예약 시스템");
		lb1.setBounds(26, 23, 164, 15);
		contentPane.add(lb1);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 48, 388, 60);
		panel.setBorder(new TitledBorder("캠핑 장소를 선택하세요"));	//panel title
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("남양주");
		rdbtnNewRadioButton.setName("남양주");
		panel.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("충북음성");
		rdbtnNewRadioButton_1.setName("충북음성");
		panel.add(rdbtnNewRadioButton_1);
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("춘천");
		rdbtnNewRadioButton_2.setName("춘천");
		panel.add(rdbtnNewRadioButton_2);
		
		ButtonGroup gp = new ButtonGroup();	//radio 사용 시 ButtonGroup을 이용
		gp.add(rdbtnNewRadioButton);
		gp.add(rdbtnNewRadioButton_1);
		gp.add(rdbtnNewRadioButton_2);
		
		
		JLabel lb3 = new JLabel("청소년(만 10세 이상):");
		lb3.setBounds(248, 157, 129, 15);
		contentPane.add(lb3);
		
		textField_1 = new JTextField("0");
		textField_1.setBounds(387, 154, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(36, 286, 247, 15);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("예약하기");
		
		btnNewButton.setBounds(357, 286, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("잠시만 기다려 주십시오...");
		lblNewLabel_5.setBounds(65, 327, 171, 15);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 118, 486, 71);
		panel_1.setBorder(new TitledBorder("인원수를 입력하세요"));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lb2 = new JLabel("성인 :");
		lb2.setBounds(25, 34, 50, 15);
		panel_1.add(lb2);
		
		textField = new JTextField("0");
		textField.setBounds(85, 31, 96, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(26, 199, 510, 77);
		panel_2.setBorder(new TitledBorder("캠핑 날짜 입력"));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 22, 96, 21);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("캠핑일자 :");
		lblNewLabel_3.setBounds(10, 25, 70, 15);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("* 예시) 2022-06-24");
		lblNewLabel_4.setBounds(260, 25, 170, 15);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(41, 349, 495, 83);
		panel_3.setBorder(new TitledBorder("확인 및 입금하실 금액"));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, 24, 475, 49);
		panel_3.setVisible(false);
		panel_3.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("종료");
		btnNewButton_1.setBounds(426, 432, 93, 23);
		contentPane.add(btnNewButton_1);
		
//		Timer t = new Timer();
//		
//		t.schedule(null, null);	//한번 거져야 함
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//예약하기
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="";

				panel_3.setVisible(true);
				lblNewLabel_5.setVisible(true);
				if(rdbtnNewRadioButton.isSelected()) {
					str = rdbtnNewRadioButton.getName();

					//mu.setVisible(false);
				}else if(rdbtnNewRadioButton_1.isSelected()) {

					str = rdbtnNewRadioButton_1.getName();
					//mu.setVisible(false);
				}else if(rdbtnNewRadioButton_2.isSelected()){
					str = rdbtnNewRadioButton_2.getName();
					//mu.setVisible(true);
				}
				
				
				int money = Integer.parseInt(textField.getText())*10000 + Integer.parseInt(textField_1.getText())*5000;
				lblNewLabel_6.setText("일자 및 장소 : "+textField_2.getText()+str+" 성인 "+textField.getText()+" 청소년 "+textField_1.getText()+" 총 입금하실 금액 : "+money);
				
			}
		});
		
		
		
		
		
		
	}
}
