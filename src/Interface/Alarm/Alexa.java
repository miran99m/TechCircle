package Interface.Alarm;
import java.time.LocalTime;

public class Alexa implements Alarm {

	public void alexaWhatTimeIsIt() {
		System.out.println("its "+ LocalTime.now());
	}

	@Override
	public void setAlarm() {
	
		System.out.println("Alexa is setting alarm");
	}
}
