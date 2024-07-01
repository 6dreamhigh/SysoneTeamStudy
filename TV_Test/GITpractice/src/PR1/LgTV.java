package PR1;

public class LgTV implements TV{
	
	private Speaker speaker ;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOff() {
		System.out.println("LgTV를 끕니다.");
	}
	
	public void powerOn() {
		System.out.println("LgTV를 켭니다.");
	}
	public void channelUp() {
		System.out.println("LgTV 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("LgTV 채널을 내립니다.");
	}
	
	public void volumeUp() {
		if(speaker == null) {
			System.out.println("LgTV 소리를 올립니다.");
			
		}else {
			speaker.soundUp();
		}
	}
	
	public void volumeDown() {
		if(speaker == null) {
			System.out.println("LgTV 소리를 내립니다.");
		}else {
			speaker.soundDown();
		}
	}

}
