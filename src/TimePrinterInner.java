import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimePrinterInner {
	private int interval;
	private Timer t;
	
	class TimeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(LocalTime.now());
			
		}
		
	}
	public TimePrinterInner(int interval) {
		super();
		this.interval = interval;
		t=new Timer(interval, new TimeListener());
		t.start();
		JOptionPane.showMessageDialog(null, "OK");
		t.stop();
	}
	
	
}

