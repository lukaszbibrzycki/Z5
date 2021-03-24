import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimePrinterAnonymous {
	private int interval;
	private Timer t;
	
		public TimePrinterAnonymous(int interval) {
		super();

		this.interval = interval;
		t=new Timer(interval, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(LocalTime.now());
				
			}
		});
		t.start();
		JOptionPane.showMessageDialog(null, "OK");
		t.stop();
	}
	
	
}

