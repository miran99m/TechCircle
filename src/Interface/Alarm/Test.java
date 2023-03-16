package Interface.Alarm;

import java.util.ArrayList;

public class Test {

	

	public static void main(String[] args) {
		Iphone pro14Max = new Iphone();
		pro14Max.call("911");
		pro14Max.attendingZoomMeeting();
		pro14Max.sendMessage("7034561234", "Hello");
		
		pro14Max.setAlarm();
		
		System.out.println(pro14Max.size);
		
		
		Alexa echo = new Alexa();
		echo.alexaWhatTimeIsIt();
		echo.setAlarm();
		
		Clock clock = new Clock();
		clock.showCurrentTime();
		clock.setAlarm();
		
		
		Alarm dot = new Alexa();
		Alarm iphone13 = new Iphone();
		Alarm clock2 = new Clock();
		
//		dot.alexaWhatTimeIsIt(); // Cannot do this because Actual ref type is Alarm so we can only access what is there
		dot.setAlarm();
		iphone13.setAlarm();
		clock2.setAlarm();
		
		//WebDriver driver = new ChromeDriver();
		
		ArrayList<Alarm> list = new ArrayList<>();
		
		list.add(iphone13);
		list.add(pro14Max);
		list.add(clock2);
		list.add(echo);
		list.add(dot);
		list.add(clock);
		
		for (Alarm a : list) {
			a.setAlarm();
			System.out.println(Alarm.size);
		}
		
		
	}
}
