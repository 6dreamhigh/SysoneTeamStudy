package PR1;

public class SamsungTV implements TV{
	
	private Speaker speaker = new HarmanSpeaker();
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	
	public void powerOff() {
		System.out.println("SamsungTV를 끕니다.");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV를 켭니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTV 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTV 채널을 내립니다.");
	}
	
	public void volumeUp() {
		if(speaker == null ) {
			System.out.println("SamsungTV 소리를 올립니다.");
			
		}else {
			speaker.soundUp();
		}
	}
	
	public void volumeDown() {
		if(speaker == null ) {
			System.out.println("SamsungTV 소리를 내립니다.");
			
		}else {
			speaker.soundDown();
		}
	}


	
}
