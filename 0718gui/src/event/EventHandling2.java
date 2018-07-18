package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandling2 extends Frame {
	public EventHandling2() {
		setBounds(200, 200, 400, 500);
		setTitle("Ű���� �̺�Ʈ");

		setLayout(null);
		Label air = new Label("@");
		air.setBounds(30, 30, 50, 50);
		add(air);
		
		//-------------------------------------------------------------------

		KeyListener kl = new KeyListener() {
			// Ű���带 ������ �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void keyPressed(KeyEvent arg0) {
				int x = air.getLocation().x;
				int y = air.getLocation().y;

				if (arg0.getKeyCode() == arg0.VK_LEFT) {
					x = x - 10;
				}
				if (arg0.getKeyCode() == arg0.VK_RIGHT) {
					x = x + 10;
				}
				if (arg0.getKeyCode() == arg0.VK_UP) {
					y = y - 10;
				}
				if (arg0.getKeyCode() == arg0.VK_DOWN) {
					y = y + 10;
				}
				air.setLocation(x, y);
				
				//Modifiers�� ���� ������ ����Ű(Alt, Ctrl, Shift) ���� ����
				// Java10 �������ʹ� getModifiersEX(), ALT_DOWN_MASK
				// ���� ������ getModifiers(), ALT_MASK
				if(arg0.getModifiersEx() == KeyEvent.ALT_DOWN_MASK && 
						arg0.getKeyCode()==KeyEvent.VK_F4) {
					System.exit(0);
				}
				
				if(arg0.getKeyCode() == KeyEvent.VK_F) {
					Label bullet = new Label("�Ѿ�");
					add(bullet);
					
					bullet.setBounds(air.getLocation().x, 
							air.getLocation().y-20, 30,30);
					//�����带 ���� ����
					Thread th = new Thread() {
						public void run() {
							try {
								while(true) {
								Thread.sleep(100);
								int x = bullet.getLocation().x;
								int y = bullet.getLocation().y;
								bullet.setLocation(x, y-5);
								if(y<50) break;
								}
								bullet.setVisible(false);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					};
					th.start();
				}
			}
			// ���� Ű�� ������ �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void keyTyped(KeyEvent e) {
			}
			// Ű���忡�� ���� �� �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void keyReleased(KeyEvent e) {
			}
		};
		addKeyListener(kl);
		
		//-------------------------------------------------------------------
		
		//������ ������ ���� �̺�Ʈ ó���ϱ� ���� ������
		WindowListener wl = new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			//���� ��ư�� ���� �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void windowClosing(WindowEvent e) {
				//���α׷� ����
				System.exit(0);
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		addWindowListener(wl);
		
		//-------------------------------------------------------------------


		setVisible(true);
	}
}
