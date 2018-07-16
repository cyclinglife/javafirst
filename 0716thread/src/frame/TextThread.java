package frame;

import java.awt.Button;

public class TextThread extends Thread {
	
	private Button button;
	
	public TextThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		String [] ar = { "텍스트1", "텍스트2","텍스트3"};
		int idx = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			idx = idx +1;
			button.setLabel(ar[idx%ar.length]);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
