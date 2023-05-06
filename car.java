package week1.day1;

public class car {
	public void openDoor() {
		System.out.println("openDoor");
	}
	public void fourWheels() {
		System.out.println("fourWheels");
	}
	public void adjustMirror() {
		System.out.println("adjustMirror");
	}
	public void pressBreak() {
		System.out.println("pressBreak");
	}
	public void pressAcclerator()  {
		System.out.println("pressAcclerator");
	}
public static void main(String[]args) {
	car car=new car();
	car.openDoor();
	car.adjustMirror();
	car.pressBreak();
	car.pressAcclerator();
	car.fourWheels();
}
 
}
