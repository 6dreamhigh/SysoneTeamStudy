package PR1;

public interface TV {
	public abstract void powerOff() ;
	
	public void powerOn() ;
	public void channelUp() ;
	public void channelDown() ;
	
	public void volumeUp() ;
	
	public void volumeDown() ;
	public default void setSpeaker(Speaker speaker) {
		System.out.println("본체의 스피커로 출력합니다.");
	}
}