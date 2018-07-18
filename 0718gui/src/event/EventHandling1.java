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
	// 생성자
	public EventHandling1() {
		// 위치 및 크기 설정
		setBounds(300, 300, 400, 200);
		// 제목 설정
		setTitle("이벤트 처리 연습");
		// 여러 개를 배치하기 위해서 패널 배치
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

		Button btn1 = new Button("계산");
		panel.add(btn1);

		Button btn2 = new Button("종료");
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

		// 텍스트 필드의 내용이 변경될 때를 처리할 수 있는
		// 인터페이스

		TextListener t = new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				String password = pw.getText();
				//영문대소문자 숫자 그리고 특수문자의 개수 세기
				//개수를 저장할 변수 만들기
				int ABC = 0, abc = 0, num = 0, etc = 0;
				// password의 모든 글자를 순회
				for (int i = 0; i < password.length(); i = i + 1) {
					// i번째 글자 가져오기
					char ch = password.charAt(i);
					// 대문자 인지 확인: A-Z
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
				pwResult.setText("사용 가능한 비밀번호");
				} else {
					pwResult.setText("비밀번호는 최소 1개 이상의 소문자, 대문자, "
							+ "숫자, 특수문자의 조합으로 이뤄져야 합니다.");
				}
			}

		};

		pw.addTextListener(t);
		
		// ------------------------------------------------------------------


		add(panel);

		setVisible(true);
	}

}
