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
		setTitle("스윙을 이용한 윈도우");
		// 종료버튼 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 패널을 생성
		JPanel panel = new JPanel();
		ImageIcon icon = new ImageIcon("C:\\Users\\503-04\\Pictures\\그림\\1.jpg");

		JLabel label = new JLabel();
		label.setIcon(icon);
		label.setToolTipText("안녕하세요");

		EtchedBorder border = new EtchedBorder(Color.RED, Color.PINK);
		label.setBorder(border);
		panel.add(label);

		JButton btn = new JButton("버튼");
		panel.add(btn);
		
		add(panel);
		setVisible(true);
		
		//그림 파일 이름을 배열로 만들기
		//배열은 만들면 크기 변경이 안됩니다.
		String [] images = {
				"1.jpg", "2.jpg"
		};
		
		//리스트는 크기 변경이 가능한 배열입니다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1.jpg");
		list.add("2.jpg");
		list.add("3.jpg");
		
		
	//이미지가 변경되는 동안에도 다른 작업을 할 수 있어야 한다.
	Thread th = new Thread() {
		public void run() {
			int idx=0;
			while(true) {
				try {
					Thread.sleep(100);
					ImageIcon icon = new ImageIcon("C:\\Users\\503-04\\Pictures\\그림\\"+images[idx%images.length]);
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
