import java.awt.*;
import java.awt.event.*;


//������ȣ�߼� �ý��� - awt6.java �����۾�
public abstract class awt6_abstract {
	public abstract void pc();	//������ȣ����
	public abstract void check(String num);	//��
	public abstract String ans();	//������� getter
	
	Frame fr = new Frame();
	Button send = null;
	Button close = null;
	Button check = null;
	TextField input = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200, 200, 350, 180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		
		this.send = new Button("������ȣ�߼�");
		this.close = new Button("X");
		this.check = new Button("����Ȯ��");
		this.input = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.fr.setBackground(Color.gray);
		this.send.setBackground(Color.DARK_GRAY);
		this.send.setForeground(Color.white);
		
		
		this.send.setBounds(25, 50, 100, 25);
		this.input.setBounds(25, 85, 140, 25);
		this.check.setBounds(200, 85, 100, 25);
		this.msg.setBounds(25, 125, 250, 25);
		this.close.setBounds(270, 50, 30, 25);
		
		this.fr.add(this.send);
		this.fr.add(this.input);
		this.fr.add(this.check);
		this.fr.add(this.msg);
		this.fr.add(this.close);
		
		this.click();
	}
	
	public void click() {
		this.send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pc();
				
			}
		});
		
		this.check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String aa = awt6_abstract.this.input.getText();
				if(aa.equals("")) {
					msg.setText("������ȣ 4�ڸ��� �Է��ϼ���.");
				}else {
					check(aa);
					String result = ans();
					if(result.equals("yes")) {
						msg.setText("������ �Ϸ�Ǿ����ϴ�.");
					}else {
						msg.setText("������ȣ�� �ٽ� Ȯ�� �Ͻñ� �ٶ��ϴ�.");
					}
				}
				
			}
		});
		
		this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}

}
