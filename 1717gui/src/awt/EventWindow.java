package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {
	public EventWindow() {
		setBounds(400, 400, 800, 800);
		setTitle("�̺�Ʈ ó��");

		// ��ư ����
		Button btn1 = new Button("����");
		// ���� ���� ������Ʈ�� ���� �� �г� ����
		Panel panel = new Panel();
		// �гο� ��ư�� �߰�
		panel.add(btn1);
		// �����ӿ� �г��� �߰�
		add(panel);
		setVisible(true);
		
		
		//----------������=�������̽�=�߻�޼ҵ�---------------
		// ��ư�� ���� �� �̺�Ʈ ó���� ActionListener
		// �������̽��� ó���մϴ�.
		ActionListener lsn1 = new ActionListener() {

			@Override
			// ��ư�� �������� ȣ��Ǵ� �޼ҵ�
			public void actionPerformed(ActionEvent e) {
				// ���α׷� ����
				System.exit(0);
			}
		};
		//��ư�� ������ ����
		//btn1�� ActionEvent�� �߻��ϸ�
		//lsn1�� �޼ҵ带 ȣ���ϵ��� ����
		btn1.addActionListener(lsn1);
		//-----------------------------------------------
	}

}
