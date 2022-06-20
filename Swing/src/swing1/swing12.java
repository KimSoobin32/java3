package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing12 extends JFrame {
	private String imgdata[] = {"mandu.jpg","ryan.png","ryan2.jpg"};
	public int count = 0;
	public String url = "C:\\java5\\Swing\\src\\swing1\\";	//������
	/*
	 * http://naver.com/1.jpg, C:\java5\Swing\src\swing1\1.jpg : ������
	 * ./1.jpg, ../1.jpg : �����
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.BLACK));
		lb.setBounds(10, 90, 668, 565);
		contentPane.add(lb);
		
		JButton prev = new JButton("����");
		prev.setBounds(63, 33, 93, 23);
		contentPane.add(prev);
		
		JButton next = new JButton("����");		
		next.setBounds(542, 33, 93, 23);
		contentPane.add(next);
		ImageIcon v = new ImageIcon(url+imgdata[0]);
		lb.setIcon(v);
		
		prev.addActionListener(new ActionListener() {	//����
			public void actionPerformed(ActionEvent e) {
				swing12.this.count--;
				if(swing12.this.count < 0) {
					swing12.this.count = 0;
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lb.setIcon(v);
				//System.out.println(swing12.this.count);
			}
		});
		
		next.addActionListener(new ActionListener() {	//����
			public void actionPerformed(ActionEvent e) {
				swing12.this.count++;
				if(swing12.this.count>imgdata.length-1) {
					swing12.this.count = imgdata.length-1;	//�迭 �ִ�ġ
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lb.setIcon(v);
				
			}
		});
	}

}
