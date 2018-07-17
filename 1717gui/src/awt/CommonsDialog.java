package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	//������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
	public CommonsDialog() {
		//��ġ�� ũ�⸦ ����
		setBounds(200, 200, 600, 600);
		//���� ����
		setTitle("���� ��ȭ ����");
		
		//FileDialog ���ĸ� �����ؼ� ȭ�鿡 �߰��ϰ�
		//������  ���� ��θ� ���̺��� ���;
		//FileDaiolg�� ������ �� ù��° �Ű�������
		//Dialog �� Framed�� �ּ��ε�
		//������ ���� this�� �����ϸ� �˴ϴ�.
		
		//FileDialog �ν��Ͻ� ����
		FileDialog fd = new FileDialog(this);
		
		//������ �����̸��� ���丮 ��������
		String filePath = fd.getDirectory()+fd.getFile();
		
		//���̺� ����
		Label label = new Label(filePath);
		add(label);
				
		//ȭ�� ���
		setVisible(true);
	}

}
