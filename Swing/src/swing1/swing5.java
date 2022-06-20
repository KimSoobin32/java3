package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {
	/*
	 * Frame�� absolute ���·� layer�� ���� (layout - Absolute ���� 
	 */
	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		mid = new JTextField();
		mid.setBounds(116, 27, 224, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setBounds(116, 166, 283, 23);
		msg.setBorder(new LineBorder(Color.RED));
		contentPane.add(msg);
		
		/*
		 * �ڵ鸵 class�� ������Ʈ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ����
		 * �� �Ʒ��� ����
		 */
		JButton btnNewButton = new JButton("���̵� üũ");
		btnNewButton.setBounds(116, 112, 195, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				} else {
					int lg = mid.getText().length();	//�Է� ���� ����
					if(lg<5) {
						msg.setText("���̵�� 5�� �̻� ��� �����մϴ�.");
					}else {
						msg.setText("���̵� ���� ���Դϴ�...");
					}
				}
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		contentPane.add(btnNewButton);
	}

}
