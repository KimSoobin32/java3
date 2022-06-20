package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing7 extends JFrame {
	//radio 
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 28, 388, 33);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		rd1.setName("CARD");	//setName�� ������ ���� ������, Background���� �ش� �Ӽ��� ���� �����ϴ� ���� ����
		rd1.setSelected(true);
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("BANK");
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("�������Ա�");
		rd3.setName("NOBANK");
		rd3.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	//radio ��� �� ButtonGroup�� �̿�
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		JButton btn = new JButton("��������");
		btn.setFont(new Font("�ü�ü", Font.PLAIN, 12));
		btn.setBounds(156, 71, 121, 33);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setFont(new Font("����ü", Font.PLAIN, 12));
		mu.setVisible(false);
		mu.setBounds(32, 129, 380, 102);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("�������Ա�"));	//panel title
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 21, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				//System.out.println(rd1.getText());
				if(rd1.isSelected()) {	//�ſ�ī��
					System.out.println("�ſ�ī�� ����");
					pay = rd1.getName();
					System.out.println(pay);
					mu.setVisible(false);
				}else if(rd2.isSelected()) {	//������ü
					System.out.println("������ü ����");
					mu.setVisible(false);
				}else {	//������
					mu.setVisible(true);
				}
			}
		});
	}
}
