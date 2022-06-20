package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class swing10 extends JFrame {
	public String list[] = {"SKT","KT","LGT","알뜰폰"};
	private JPanel contentPane;
	//combo box
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb.setBounds(37, 32, 154, 23);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("New label");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.BLACK));
		msg.setBounds(37, 81, 286, 29);
		contentPane.add(msg);
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int v = cb.getSelectedIndex();	//배열 index형태로 로드 단 필드에 배열에 선언되어야 함(17버전)
				//System.out.println(e.getItem());
				//String data = String.valueOf(cb.getSelectedItem());
				String data = cb.getSelectedItem().toString();
				msg.setText(data);
				//msg.setText(e.getItem().toString());
				System.out.println(swing10.this.list[v]);
				
			}
		});
		
		
	}
}
