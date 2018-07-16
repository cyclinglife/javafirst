package checkbox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setLocation(200,200);
		setSize(1000,1000);
		
		Panel p = new Panel();
		
		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("����");
		Checkbox cb3 = new Checkbox("���ǰ���");
		Checkbox cb4 = new Checkbox("���α׷���");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man =
				new Checkbox("����", group, true);
		Checkbox woman = 
				new Checkbox("����", group, false);
		p.add(man);
		p.add(woman);
		
		//5���� �����ְ� ���� ���� ������ �� �ֵ��� ���ִ� List
		List list = new List(5, true);
		list.add("C&C++");
		list.add("C#");
		list.add("Java");
		list.add("JavaScript");
		list.add("Objective-C");
		list.add("Python");
		list.add("Swift");
		list.add("Kotlin");
		list.add("Scala");
		p.add(list);
		//list�� remove(int idx)�� �̿��ϸ� idx ��°��
		//���� �� �ֽ��ϴ�.
		//list.remove(0);
		//ù��°�� �ִ� C&C++�� 5��°�� �ִ� Objective-C�� ����
		//���� ���� ���� ���� �ڿ��� ���� �����ؾ� �մϴ�.
		list.remove(4);
		list.remove(0);
		
		
		
		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		p.add(ch);
		
	add(p);
	setVisible(true);
	}

}
