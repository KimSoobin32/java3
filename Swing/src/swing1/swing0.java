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
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing0 extends JFrame {

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
		panel.setBounds(31, 25, 266, 51);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ȸ��");
		rdbtnNewRadioButton.setSelected(true);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("��ȸ��");
		panel.add(rdbtnNewRadioButton_1);
		
		ButtonGroup gp = new ButtonGroup();	//radio ��� �� ButtonGroup�� �̿�
		gp.add(rdbtnNewRadioButton);
		gp.add(rdbtnNewRadioButton_1);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(313, 27, 96, 23);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ī��");
		chckbxNewCheckBox.setBounds(6, 122, 107, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("�ܹ���");
		chckbxNewCheckBox_1.setBounds(126, 122, 107, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("����");
		chckbxNewCheckBox_2.setBounds(235, 122, 107, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("�Ľ�Ÿ");
		chckbxNewCheckBox_3.setBounds(344, 122, 107, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel.setBounds(31, 191, 373, 64);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("�ֹ�");		
		btnNewButton.setBounds(99, 151, 93, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("ddd");
//				if(rdbtnNewRadioButton.isSelected()) {
//					lblNewLabel.setText(rdbtnNewRadioButton.getName());
//				} else if(rdbtnNewRadioButton_1.isSelected()) {
//					lblNewLabel.setText(rdbtnNewRadioButton_1.getName());
//				}
				
			}
		});
	}
}
