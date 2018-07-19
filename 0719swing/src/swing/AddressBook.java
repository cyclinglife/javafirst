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
	// �÷� �̸� �迭
	String[] columns = { "�̸�", "��ȭ��ȣ", "�ּ�" };

	// ������ �迭
	String[][] data = { { "�谳��", "01048484848", "����� ��õ�� ��" }, { "ȫ���", "01030303030", "����� ����� ������" },
			{ "���ڶ�", "01060606060", "����� ������ ������" }, { "��������", "01028282828", "����� �߱� ������" } };

	public AddressBook() {
		setBounds(100, 100, 400, 400);
		setTitle("�ּҷ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 1. ���̺� �� �����
		DefaultTableModel model = new DefaultTableModel(data, columns);

		// 2. ���̺��� �����
		JTable table = new JTable(model);
		// table.setModel1(model); ------�ʱ⿡ ������ ���� ���̺� ���� �� ��밡��

		// 3. Scroll�� ����
		// ��� �������� ���̺��� Ŀ������ ��ũ�� �ٸ� �̿��� �� �ֵ���
		JScrollPane scrollPane = new JScrollPane(table);

		// 4. ��ũ�� ������ �����ӿ� ����
		add(scrollPane);

		
		// --------------------------------------------------
		
		// �޽��� ���̾�α� ���
		JOptionPane.showMessageDialog(null, "�޽��� ���̾�α�", "��ȭ����", JOptionPane.QUESTION_MESSAGE);

		// ���� ���̾�α״� ������ ��ȯ YES=0, NO=1, CANCEL=2
		int r = JOptionPane.showConfirmDialog(null, "�޽��� ���̾�α�", "��ȭ����", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(r);

		// �� �� �Է¹޴� ���̾�α� ���
		String t = JOptionPane.showInputDialog(null, "�޽��� ���̾�α�", "��ȭ����", JOptionPane.QUESTION_MESSAGE);
		System.out.println(t);
		// --------------------------------------------------
		
		//�޴� �ٸ� ����
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("����(a)");
		file.setMnemonic('a');
		
		JMenuItem item1 = new JMenuItem("����");
		file.add(item1);
		
		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("����");
		
		JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("����"	
				);
		file.add(item3);
		
		//�޴� �ٸ� �����쿡 ����
		setJMenuBar(menuBar);
		
		//----------------------------------------------------------------------
		
		String name = tfName.getText();
		String phone = tfPhone.getText();
		String address = tfAddress.getText();
		
		//�¿� ���� �����ϱ�
		name = name.trim();
		phone = phone.trim();
		address = address.trim();
		
		//name�� �ʼ� �Է�
		if(name.length()==0) {
			JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է�", "�̸�", JOptionPane.WARNING_MESSAGE);
			//�Ʒ����� �� �̻� �������� �ʵ��� ����
			return;
		}
		
		// ���̺��� �����͸� �����ϱ� ���ؼ� ���̺���
		// ������ ���� �����ɴϴ�.
		DefaultTableModel model =
				(DefaultTableModel)table.getModel();
		//�����͸� �߰��ϱ� ���ؼ� �߰��� ������ �迭�� ����
		String [] row = {name, phone, address};
		//�𵨿� �߰�
		model.addRow(row);
		//���̺��� ����
		table.updateUI();
		
		tfName.setText("");
		tfPhone.setText("");
		tfAddress.setText("");
		
		JOptionPane.showMessageDialog(null, "������ ���� ����", "�����۾�", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	//--------------------------------------------------------------------------
	
	ActionListener deleteListener =
			new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//������ �� ��ȣ ã��
			int idx = table.getSelectedRow();
			//���̺��� ���� �������� �ʾҴٸ�
			if(idx<0||idx>=table.getRowCount()) {
				JOptionPane.showMessageDialog(null, "���� �����ϼ���", "���� ����", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			//���̺��� �� ��������
			DefaultTableModel model =
					(DefaultTableModel)table.getModel();
			//������ �࿡ �ش��ϴ� ������ �����
			model.removeRow(idx);
			table.updateUI();
			JOptionPane.showMessageDialog(null, "������ ���� ����", "����", JOptionPane.WARNING_MESSAGE);
			
		};
	};
	btnDelete.addActionListener(deleteListener);

}
*/