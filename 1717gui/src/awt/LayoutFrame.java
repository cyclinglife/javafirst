package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		// ��ġ�� ũ�⸦ ����
		setBounds(100, 100, 500, 500);
		// ���� ����
		setTitle("���̾ƿ� ����");

		Panel panel = new Panel();

		
		
		/*
		// panel�� ���̾ƿ��� ����
		panel.setLayout(new BoderLayout());

		// ������Ʈ ��ġ
		Button btn = null;
		for (int i = 0; i < 10; i = i + 1) {
			btn = new Button("��ư" + (i+1));
			panel.add(btn);

		}
		*/
		
		
		
		/*
		panel.setLayout(new BorderLayout());
		
		Button btnWest = new Button("����");
		panel.add("West", btnWest);
		
		Button btnEast = new Button("����");
		panel.add("East", btnEast);
		
		Button btnCenter = new Button("�߾�");
		panel.add("Center", btnCenter);
		*/
		
		
		/*
		//2��3���� ��ư�� ����� �е����� 10,10 
		panel.setLayout(new GridLayout(2,3, 10, 10));
		for(int i=0; i<6; i=i+1) {
			Button btn = new Button("��ư"+(i+1));
			panel.add(btn);
		}
		*/
		
		//������Ʈ�� ũ��� ��ġ�� ������� ������ �� �ֽ��ϴ�.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10,50,30,50);
		add(label);
		
		
		add(panel);
		
		//ȭ�� ũ�� ������ ���ϵ��� ����
		//setResizable(false);

		// ȭ�� ���
		setVisible(true);
		
		Thread th = new Thread() {
			
			public void run() {
				//���ѹݺ�
				while(true) {
					//���� ���̺��� ��ġ ��������
					int x = label.getLocation().x;
					int y = label.getLocation().y;
					label.setLocation(x+10,y);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
	}

}
