import java.awt.*;
import java.awt.event.*;

//AWT ȯ�漳��
public abstract class awt5_abstact {

	public abstract String signok();	//getter
	public abstract void idcheck(String id);	//setter
	public abstract void dataload();	//Database
	
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200, 200, 300, 450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		
		this.bt = new Button("�ߺ�üũ");
		this.close = new Button("����");
		this.mid = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.fr.setBackground(Color.gray);
		this.bt.setBackground(Color.DARK_GRAY);
		
		this.bt.setBounds(195, 150, 80, 25);
		this.mid.setBounds(25, 150, 150, 25);
		this.msg.setBounds(25, 200, 250, 25);
		this.close.setBounds(195, 400, 80, 25);
		
		this.fr.add(this.bt);
		this.fr.add(this.mid);
		this.fr.add(this.msg);
		this.fr.add(this.close);
		
		this.click();	//awt ������ �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�
		
	}
	
	public void click() {
		this.bt.addActionListener(new ActionListener() {	//�ߺ�Ȯ�ι�ư	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//awt5_abstact.this.msg.setText("üũ�Ϸ�");		//setText(���), getText(�Է°� ��������)
				String userid = awt5_abstact.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				}else {
					idcheck(userid);
					//msg.setText("");
					String result = signok();
					if(result==null) {
						msg.setText("��� ������ ���̵��Դϴ�.");
					}else {
						msg.setText("�ٸ� ���̵� �Է����ֽʽÿ�.");
					}
				}
				
			}
		});
		
		this.close.addActionListener(new ActionListener() {		//�����ư	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}
	

}
