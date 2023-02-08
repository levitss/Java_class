package kr.co.ezenac.interface1;

public interface RemoteControl {
	//상수 static final 은 생략
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public void setiVolume(boolean volume);
	
}
