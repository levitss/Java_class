package kr.co.ezenac.singleton;

public class Singleton {
	private Singleton() {
		
	}
	private static class SingletonHelper{ //inner class 
		private static final Singleton INSTANCE=new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
