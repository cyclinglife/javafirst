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
		setTitle("키보드 이벤트");

		setLayout(null);
		Label air = new Label("@");
		air.setBounds(30, 30, 50, 50);
		add(air);
		
		//-------------------------------------------------------------------

		KeyListener kl = new KeyListener() {
			// 키보드를 눌렀을 때 호출되는 메소드
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
				
				//Modifiers는 같이 누르는 조합키(Alt, Ctrl, Shift) 값을 리턴
				// Java10 버전부터는 getModifiersEX(), ALT_DOWN_MASK
				// 이전 버전은 getModifiers(), ALT_MASK
				if(arg0.getModifiersEx() == KeyEvent.ALT_DOWN_MASK && 
						arg0.getKeyCode()==KeyEvent.VK_F4) {
					System.exit(0);
				}
				
				if(arg0.getKeyCode() == KeyEvent.VK_F) {
					Label bullet = new Label("총알");
					add(bullet);
					
					bullet.setBounds(air.getLocation().x, 
							air.getLocation().y-20, 30,30);
					//스레드를 만들어서 실행
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
			// 문자 키를 눌렀을 때 호출되는 메소드
			@Override
			public void keyTyped(KeyEvent e) {
			}
			// 키보드에서 손을 뗄 때 호출되는 메소드
			@Override
			public void keyReleased(KeyEvent e) {
			}
		};
		addKeyListener(kl);
		
		//-------------------------------------------------------------------
		
		//윈도우 조작을 위한 이벤트 처리하기 위한 리스너
		WindowListener wl = new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			//종료 버튼을 누를 때 호출되는 메소드
			@Override
			public void windowClosing(WindowEvent e) {
				//프로그램 종료
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
