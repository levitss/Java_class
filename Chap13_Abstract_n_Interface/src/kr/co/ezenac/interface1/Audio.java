package kr.co.ezenac.interface1;

public class Audio implements RemoteControl {
	private int volume=0;
	
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn On Audio");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turn Off Audio");
	}

	@Override
	public void setVolume(int volume) {
		// max=10
		if(volume>MAX_VOLUME) {
			System.out.println("Audio 볼륨의 최대치 값은 10");
			System.out.println("현재 볼륨"+MAX_VOLUME);
		}
		else if(volume<MIN_VOLUME) {
			System.out.println("현재 볼륨"+MIN_VOLUME);
		}
		else {
			System.out.println("현재 볼륨"+volume);
			this.volume=volume;
		}
	}
	public void setiVolume(boolean volume) {
		if(volume) {
			if(this.volume<MAX_VOLUME) {
				this.volume++;
				
			} 
			
		}
		else if(this.volume>MIN_VOLUME) {
			this.volume--;
		}
		
		System.out.println(this.volume);
	}
	
}
