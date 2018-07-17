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
		setTitle("이벤트 라우팅");

		// 버튼 생성
		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label("");
		add("South", label);

		// 여러 개의 컴포넌트를 묶어 줄 패널 생성
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
				label.setText("안녕하세요");
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
		
		//이벤트 라우팅 - 하나의 리스너가 여러 컴포넌트의
		//이벤트를 처리하는 것
		ActionListener lsn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "한국어" :
					label.setText("안녕하세요");
					break;
				case "영어" :
					label.setText("Hello");
					break;
				case "종료":
					System.exit(0);
					break;
				}
				
			}
			
		};
		//3개 버튼의 액션 이벤트를 lsn가 모두 처리
		btn1.addActionListener(lsn);
		btn2.addActionListener(lsn);
		btn3.addActionListener(lsn);
		
		
		setVisible(true);
	}

}
