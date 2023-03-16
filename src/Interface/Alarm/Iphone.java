package Interface.Alarm;

public class Iphone implements Alarm{

	
	public void call(String phoneNumber) {
		System.out.println("Calling "+phoneNumber);
	}
	
	public void sendMessage(String to, String message) {
		System.out.println("Sending "+message +" to "+to +" number" );
	}
	
	public void playGame() {
		System.out.println("Playing game using my phone");
	}
	
	public void attendingZoomMeeting() {
		System.out.println("Attending zoom meeting using my phone");
	}

	@Override
	public void setAlarm() {
		System.out.println("Iphone is setting alarm");
		
	}
}
