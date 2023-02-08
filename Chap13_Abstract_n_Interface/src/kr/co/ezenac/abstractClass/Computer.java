package kr.co.ezenac.abstractClass;

public abstract class Computer {
	
/*
  			P => private / public / protected
			S => static / abstract / ...
			F => final
			순서로 사용함
 */
	
		abstract public void display();
		abstract public void typing();
		public void turnOn() {
			System.out.println("Turn On");
		}
		public void turnOff() {
			System.out.println("Turn Off");
		}
}

