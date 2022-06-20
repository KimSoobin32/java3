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
		
		JButton btnNewButton = new JButton("������ȣ �ޱ�");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(289, 38, 139, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.BLACK));
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(40, 75, 388, 23);
		contentPane.add(msg);
		
			
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ����
		tel.addKeyListener(new KeyAdapter() {	//Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ���� addKeyListener
			//keyPressed : Ű�� ���� ��
			//keyReleased : Ű�� �����ٰ� up�� �Ǿ��� ��
			//keyTyped : Ű�� ���ڸ� �Է� ���� ��
			@Override
			public void keyTyped(KeyEvent k) {
				//�Է°��� ���� �ڸ��� ����
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
				//System.out.println(k);
//				System.out.println(k.getKeyChar());
//				System.out.println(k.getKeyCode());
				
				int n = Integer.valueOf(k.getKeyChar());	//�ƽ�Ű�� �����
				//System.out.println(n);
				if(n>=48 && n<=57) {	//sysout���� �������� ���� getKeyChar() �������� Integer�� ���� �� �ƽ�Ű�ڵ�� ������ ��
					
					msg.setText("");
				}else {
					
					//msg.setText("���ڸ� �Է��ϼ���.");
					//if(!Character.isDigit(n)) {
						msg.setText("���ڸ� �Է��ϼ���.");
						k.consume();	//keyTyped�� �̿��ؾ� ��, comsoume�� �ش� �Է� �� null�� ������, Ű�̺�Ʈ������ �۵���(����)
						//return;
					//}
					
				}
			}
		});
	}
}
