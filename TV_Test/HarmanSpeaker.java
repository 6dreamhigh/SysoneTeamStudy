package oop11.interface01;

public class HarmanSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : 볼륨을 키웁니다.");
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : 볼륨을 줄입니다.");		
	}
}
