import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//GUI - main Ŭ���� �� �ȴ��, �θ�Ŭ���� �ʵ忡 �����ؾ� �� ����
//�ܺ� Ŭ������ awt ����, awt�� ���� Ŭ�������� ���� ����
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();
	}

}
class loginok extends login{	//ȭ�� ��ȯ�ϴ� �ڽ� Ŭ����
	public loginok() {
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login{	//<-������ > ������ extends�� �߻� Ŭ����(abstract)�� ���� �ε��Ͽ� �ʵ忡 ������Ѿ� ��
	Frame fr = new Frame();
	Font ft = new Font("����ü",Font.BOLD,20);	//("����ü",Font.BOLD(����ü),����ũ��)
	Button close_btn = new Button("���α׷� ����");
	Button lg_btn = new Button("�α���");
	Button ship_btn = new Button("ȸ�� ����");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label();

	public login() {
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		this.mid.setFont(ft);	//���� �Ӽ��� �����ϰ����ϴ� ������Ʈ ����
		this.mpw.setFont(ft);
		this.mpw.setEchoChar('*');	//setEchoChar : �ܵ���ǥ''�� ��� ����
				
		this.lg_btn.setBackground(Color.pink);
		this.ship_btn.setBackground(Color.gray);
		this.close_btn.setBackground(Color.DARK_GRAY);
		//this.msg2.setBackground(Color.red);
		
		this.mid.setBounds(100, 60, 200, 40);
		this.mpw.setBounds(100, 120, 200, 40);
		this.lg_btn.setBounds(100, 180, 200, 40);
		this.ship_btn.setBounds(100, 240, 200, 40);
		this.close_btn.setBounds(100, 300, 200, 40);
		this.msg.setBounds(100, 100, 200, 20);

		
		this.fr.add(this.mid);
		this.fr.add(this.mpw);
		this.fr.add(this.lg_btn);
		this.fr.add(this.ship_btn);
		this.fr.add(this.close_btn);
		this.fr.add(this.msg);

		this.clicks();
	}
	public void clicks() {	//��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);	//�ش� ������ ����
				loginok ok = new loginok();	//���� ������ �ε�
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	//���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
				
			}
		});
		
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane();	//swing API ��� �ɼ� �ε�
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText();	//this ���� �׳� ���� �θ� Ŭ����(login)�˾Ƽ� ã�ư�, �ʵ� �����ؾ��� ����
				String user_pw = mpw.getText();
				//Object��.getText() ����ڰ� �Է��� ���� ������ �� ���
				if(user_id.equals("")) {	//null ��� ����, null���� ���� �ִ� ���¸� ����, ""�� ��¥ ����ִ� ��..
					msg.setText("���̵� �Է��ϼ���.");					
					//alert.showMessageDialog(null, "���̵� �Է��ϼ���.","���޼���",JOptionPane.ERROR_MESSAGE);
					//alert.showMessageDialog(null, "���̵� �Է��ϼ���.");
				}else {
					if(user_pw.equals("")){
						msg.setText("�н����带 �Է��ϼ���.");
					}else {
						msg.setText("�α����� �����մϴ�.");
						
					}
					
				}
				
			}
		});
		
		
	}
}
