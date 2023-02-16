//package ezenac;
//
//public class Computer {
//	//requied para
//	private String hdd;
//	private String ram;
//	
//	//optioanl para
//	private boolean isGraphicsCardEnabled;
//	private boolean isBluetoothEnabled;
//	public String getHdd() {
//		return hdd;
//	}
//	public String getRam() {
//		return ram;
//	}
//	public boolean isGraphicsCardEnabled() {
//		return isGraphicsCardEnabled;
//	}
//	public boolean isBluetoothEnabled() {
//		return isBluetoothEnabled;
//	}
//	
//	private Computer(ComputerBuilder builder) {
//		this.hdd=builder.hdd;
//	}
//	
//}
////builder class
//public static class ComputerBuilder{
//	//requied para
//	private String hdd;
//	private String ram;
//	
//	//optioanl para
//	private boolean isGraphicsCardEnabled;
//	private boolean isBluetoothEnabled;
//	public ComputerBuilder(String hdd,String ram) {
//		this.hdd=hdd;
//		this.ram=ram;
//	}
//	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
//		this.isBluetoothEnabled=isGraphicsCardEnabled;
//		return this;
//	}
//	
//}