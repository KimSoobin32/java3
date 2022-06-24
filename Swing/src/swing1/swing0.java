package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class swing0 extends JFrame {
	public String[] list = {"3시간 후","5시간 후","7시간 후"};
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing0 frame = new swing0();
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
	public swing0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null,"회원유형",TitledBorder.LEADING,TitledBorder.TOP,null,null));
		panel.setBounds(31, 25, 266, 75);
		
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("회원");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setName("회원");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("비회원");
		rdbtnNewRadioButton_1.setName("비회원");
		panel.add(rdbtnNewRadioButton_1);
		
		ButtonGroup gp = new ButtonGroup();	//radio 사용 시 ButtonGroup을 이용
		gp.add(rdbtnNewRadioButton);
		gp.add(rdbtnNewRadioButton_1);
		
		
		JComboBox comboBox = new JComboBox(list);
		comboBox.setBounds(313, 27, 96, 23);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox_0 = new JCheckBox("카레");
		chckbxNewCheckBox_0.setName("카레");
		chckbxNewCheckBox_0.setBounds(6, 122, 107, 23);
		contentPane.add(chckbxNewCheckBox_0);
		
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("햄버거");
		chckbxNewCheckBox_1.setBounds(126, 122, 107, 23);
		chckbxNewCheckBox_1.setName("햄버거");
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("피자");
		chckbxNewCheckBox_2.setBounds(235, 122, 107, 23);
		chckbxNewCheckBox_2.setName("피자");
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("파스타");
		chckbxNewCheckBox_3.setBounds(344, 122, 107, 23);
		chckbxNewCheckBox_3.setName("파스타");
		contentPane.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel.setBounds(31, 191, 373, 64);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("주문");		
		btnNewButton.setBounds(99, 151, 93, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str ="";
				lblNewLabel.setText("ddd");
				
				if(rdbtnNewRadioButton.isSelected()) {
					//lblNewLabel.setText(rdbtnNewRadioButton.getName());
					str += rdbtnNewRadioButton.getName();
				} else if(rdbtnNewRadioButton_1.isSelected()) {
					//lblNewLabel.setText(rdbtnNewRadioButton_1.getName());
					str += rdbtnNewRadioButton_1.getName();
				}
				str += " ";
				str += comboBox.getSelectedItem().toString();
				
				if(chckbxNewCheckBox_0.isSelected()) {
					str += chckbxNewCheckBox_0.getName();
				}
				if(chckbxNewCheckBox_1.isSelected()) {
					str += chckbxNewCheckBox_1.getName();
				}
				if(chckbxNewCheckBox_2.isSelected()) {
					str += chckbxNewCheckBox_2.getName();
				}
				if(chckbxNewCheckBox_3.isSelected()) {
					str += chckbxNewCheckBox_3.getName();
				}
				
				str += "예약";
				lblNewLabel.setText(str);
				
			}
		});
		

		
		
	}
}
