/*package swing;

import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddressBook extends JFrame {
	// 컬럼 이름 배열
	String[] columns = { "이름", "전화번호", "주소" };

	// 데이터 배열
	String[][] data = { { "김개똥", "01048484848", "서울시 양천구 목동" }, { "홍길똥", "01030303030", "서울시 노원구 공릉동" },
			{ "초코똥", "01060606060", "서울시 마포구 합정동" }, { "무지개똥", "01028282828", "서울시 중구 만리동" } };

	public AddressBook() {
		setBounds(100, 100, 400, 400);
		setTitle("주소록");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 1. 테이블 모델 만들기
		DefaultTableModel model = new DefaultTableModel(data, columns);

		// 2. 테이블을 만들기
		JTable table = new JTable(model);
		// table.setModel1(model); ------초기에 데이터 없이 테이블 만들 때 사용가능

		// 3. Scroll을 생성
		// 출력 영역보다 테이블이 커지더라도 스크롤 바를 이용할 수 있도록
		JScrollPane scrollPane = new JScrollPane(table);

		// 4. 스크롤 패인을 프레임에 부착
		add(scrollPane);

		
		// --------------------------------------------------
		
		// 메시지 다이얼로그 출력
		JOptionPane.showMessageDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.QUESTION_MESSAGE);

		// 선택 다이얼로그는 정수를 반환 YES=0, NO=1, CANCEL=2
		int r = JOptionPane.showConfirmDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(r);

		// 한 줄 입력받는 다이얼로그 출력
		String t = JOptionPane.showInputDialog(null, "메시지 다이얼로그", "대화상자", JOptionPane.QUESTION_MESSAGE);
		System.out.println(t);
		// --------------------------------------------------
		
		//메뉴 바를 생성
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("파일(a)");
		file.setMnemonic('a');
		
		JMenuItem item1 = new JMenuItem("열기");
		file.add(item1);
		
		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("저장");
		
		JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("편집"	
				);
		file.add(item3);
		
		//메뉴 바를 윈도우에 부착
		setJMenuBar(menuBar);
		
		//----------------------------------------------------------------------
		
		String name = tfName.getText();
		String phone = tfPhone.getText();
		String address = tfAddress.getText();
		
		//좌우 공백 제거하기
		name = name.trim();
		phone = phone.trim();
		address = address.trim();
		
		//name의 필수 입력
		if(name.length()==0) {
			JOptionPane.showMessageDialog(null, "이름은 필수 입력", "이름", JOptionPane.WARNING_MESSAGE);
			//아래쪽을 더 이상 수행하지 않도록 리턴
			return;
		}
		
		// 테이블의 데이터를 편집하기 위해서 테이블의
		// 데이터 모델을 가져옵니다.
		DefaultTableModel model =
				(DefaultTableModel)table.getModel();
		//데이터를 추가하기 위해서 추가할 데이터 배열을 생성
		String [] row = {name, phone, address};
		//모델에 추가
		model.addRow(row);
		//테이블을 갱신
		table.updateUI();
		
		tfName.setText("");
		tfPhone.setText("");
		tfAddress.setText("");
		
		JOptionPane.showMessageDialog(null, "데이터 삽입 성공", "삽입작업", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	//--------------------------------------------------------------------------
	
	ActionListener deleteListener =
			new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//선택한 행 번호 찾기
			int idx = table.getSelectedRow();
			//테이블에서 행을 선택하지 않았다면
			if(idx<0||idx>=table.getRowCount()) {
				JOptionPane.showMessageDialog(null, "행을 선택하세요", "삭제 실패", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			//테이블의 모델 가져오기
			DefaultTableModel model =
					(DefaultTableModel)table.getModel();
			//선택한 행에 해당하는 데이터 지우기
			model.removeRow(idx);
			table.updateUI();
			JOptionPane.showMessageDialog(null, "데이터 삭제 성공", "삭제", JOptionPane.WARNING_MESSAGE);
			
		};
	};
	btnDelete.addActionListener(deleteListener);

}
*/