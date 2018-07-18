package swing;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class MyWindow extends JFrame {
	public MyWindow() {
		setBounds(200, 200, 600, 600);
		setTitle("������ �̿��� ������");
		// �����ư �̺�Ʈ ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// �г��� ����
		JPanel panel = new JPanel();
		ImageIcon icon = new ImageIcon("C:\\Users\\503-04\\Pictures\\�׸�\\1.jpg");

		JLabel label = new JLabel();
		label.setIcon(icon);
		label.setToolTipText("�ȳ��ϼ���");

		EtchedBorder border = new EtchedBorder(Color.RED, Color.PINK);
		label.setBorder(border);
		panel.add(label);

		JButton btn = new JButton("��ư");
		panel.add(btn);
		
		add(panel);
		setVisible(true);
		
		//�׸� ���� �̸��� �迭�� �����
		//�迭�� ����� ũ�� ������ �ȵ˴ϴ�.
		String [] images = {
				"1.jpg", "2.jpg"
		};
		
		//����Ʈ�� ũ�� ������ ������ �迭�Դϴ�.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1.jpg");
		list.add("2.jpg");
		list.add("3.jpg");
		
		
	//�̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �� �� �־�� �Ѵ�.
	Thread th = new Thread() {
		public void run() {
			int idx=0;
			while(true) {
				try {
					Thread.sleep(100);
					ImageIcon icon = new ImageIcon("C:\\Users\\503-04\\Pictures\\�׸�\\"+images[idx%images.length]);
					label.setIcon(icon);
					idx = idx +1;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	th.start();
		
	}
}
