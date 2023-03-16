package Interface.Alarm;
import java.time.LocalTime;

public class Clock implements Alarm {

	public void showCurrentTime() {
		System.out.println(LocalTime.now());
	}
	
	
	public void setAlarm() {
		System.out.println("Clock setting alarm");
	}
}
