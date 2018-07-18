package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
	// ������
	public EventHandling1() {
		// ��ġ �� ũ�� ����
		setBounds(300, 300, 400, 200);
		// ���� ����
		setTitle("�̺�Ʈ ó�� ����");
		// ���� ���� ��ġ�ϱ� ���ؼ� �г� ��ġ
		Panel panel = new Panel();
		// ------------------------------------------------------------------

		TextField tf1 = new TextField(5);
		panel.add(tf1);
		Label plus = new Label("+");
		panel.add(plus);

		TextField tf2 = new TextField(5);
		panel.add(tf2);
		Label assign = new Label("=");
		panel.add(assign);

		TextField result = new TextField(6);
		panel.add(result);

		Button btn1 = new Button("���");
		panel.add(btn1);

		Button btn2 = new Button("����");
		panel.add(btn2);

		ActionListener al1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int t1 = Integer.parseInt(tf1.getText());
				int t2 = Integer.parseInt(tf2.getText());
				int r = t1 + t2;
				result.setText(String.format("%d", r));

			}

		};

		ActionListener al2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		};

		btn1.addActionListener(al1);
		btn2.addActionListener(al2);
		// ------------------------------------------------------------------

		Label lbPw = new Label();
		TextField pw = new TextField(15);
		panel.add(pw);
		Label pwResult = new Label();
		panel.add(pwResult);

		// �ؽ�Ʈ �ʵ��� ������ ����� ���� ó���� �� �ִ�
		// �������̽�

		TextListener t = new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				String password = pw.getText();
				//������ҹ��� ���� �׸��� Ư�������� ���� ����
				//������ ������ ���� �����
				int ABC = 0, abc = 0, num = 0, etc = 0;
				// password�� ��� ���ڸ� ��ȸ
				for (int i = 0; i < password.length(); i = i + 1) {
					// i��° ���� ��������
					char ch = password.charAt(i);
					// �빮�� ���� Ȯ��: A-Z
					if (ch >= 'A' && ch <= 'Z') {
						ABC = ABC + 1;
					} else if (ch >= 'a' && ch <= 'z') {
						abc = abc + 1;
					} else if (ch >= '0' && ch <= '9') {
						num = num + 1;
					} else {
						etc = etc + 1;
					}
				}
				if(ABC*abc*num*etc > 0) {
				pwResult.setText("��� ������ ��й�ȣ");
				} else {
					pwResult.setText("��й�ȣ�� �ּ� 1�� �̻��� �ҹ���, �빮��, "
							+ "����, Ư�������� �������� �̷����� �մϴ�.");
				}
			}

		};

		pw.addTextListener(t);
		
		// ------------------------------------------------------------------


		add(panel);

		setVisible(true);
	}

}
