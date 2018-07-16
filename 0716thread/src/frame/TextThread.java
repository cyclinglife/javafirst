package frame;

import java.awt.Button;

public class TextThread extends Thread {
	
	private Button button;
	
	public TextThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		String [] ar = { "�ؽ�Ʈ1", "�ؽ�Ʈ2","�ؽ�Ʈ3"};
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
