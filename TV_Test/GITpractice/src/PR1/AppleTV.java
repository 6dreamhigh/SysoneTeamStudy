package PR1;

public class AppleTV implements TV{
	
	private Speaker speaker ;
	
	
	public void powerOff() {
		System.out.println("AppleTV.java를 끕니다.");
	}
	
	public void powerOn() {
		System.out.println("AppleTV.java를 켭니다.");
	}
	public void channelUp() {
		System.out.println("AppleTV.java 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("AppleTV.java 채널을 내립니다.");
	}
	
	public void volumeUp() {
		if(speaker == null) {
			System.out.println("AppleTV.java 소리를 올립니다.");
			
		}else {
			speaker.soundUp();
		}
	}
	
	public void volumeDown() {
		if(speaker == null) {
			System.out.println("AppleTV.java 소리를 내립니다.");
		}else {
			speaker.soundDown();
		}
	}

}