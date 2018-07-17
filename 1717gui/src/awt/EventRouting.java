package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		setBounds(400, 400, 800, 800);
		setTitle("�̺�Ʈ �����");

		// ��ư ����
		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		Label label = new Label("");
		add("South", label);

		// ���� ���� ������Ʈ�� ���� �� �г� ����
		Panel centerPanel = new Panel();
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		add("Center", centerPanel);

		
		/*
		// --------------------------------------------------

		ActionListener lsn1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���");
			}
		};
		btn1.addActionListener(lsn1);

		// --------------------------------------------------

		ActionListener lsn2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");
			}
		};
		btn2.addActionListener(lsn2);

		// --------------------------------------------------

		ActionListener lsn3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		btn3.addActionListener(lsn3);

		// --------------------------------------------------

	*/
		
		//�̺�Ʈ ����� - �ϳ��� �����ʰ� ���� ������Ʈ��
		//�̺�Ʈ�� ó���ϴ� ��
		ActionListener lsn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "�ѱ���" :
					label.setText("�ȳ��ϼ���");
					break;
				case "����" :
					label.setText("Hello");
					break;
				case "����":
					System.exit(0);
					break;
				}
				
			}
			
		};
		//3�� ��ư�� �׼� �̺�Ʈ�� lsn�� ��� ó��
		btn1.addActionListener(lsn);
		btn2.addActionListener(lsn);
		btn3.addActionListener(lsn);
		
		
		setVisible(true);
	}

}
