package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {
	public EventWindow() {
		setBounds(400, 400, 800, 800);
		setTitle("이벤트 처리");

		// 버튼 생성
		Button btn1 = new Button("종료");
		// 여러 개의 컴포넌트를 묶어 줄 패널 생성
		Panel panel = new Panel();
		// 패널에 버튼을 추가
		panel.add(btn1);
		// 프레임에 패널을 추가
		add(panel);
		setVisible(true);
		
		
		//----------리스너=인터페이스=추상메소드---------------
		// 버튼을 누를 때 이벤트 처리는 ActionListener
		// 인터페이스가 처리합니다.
		ActionListener lsn1 = new ActionListener() {

			@Override
			// 버튼이 눌러지면 호출되는 메소드
			public void actionPerformed(ActionEvent e) {
				// 프로그램 종료
				System.exit(0);
			}
		};
		//버튼과 리스너 연결
		//btn1에 ActionEvent가 발생하면
		//lsn1의 메소드를 호출하도록 설정
		btn1.addActionListener(lsn1);
		//-----------------------------------------------
	}

}
