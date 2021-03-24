import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimePrinterLocal {
	private int interval;
	private Timer t;
	
		public TimePrinterLocal(int interval) {
		super();
		class TimeListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(LocalTime.now());
				
			}
			
		}

		this.interval = interval;
		t=new Timer(interval, new TimeListener());
		t.start();
		JOptionPane.showMessageDialog(null, "OK");
		t.stop();
	}
	
	
}

