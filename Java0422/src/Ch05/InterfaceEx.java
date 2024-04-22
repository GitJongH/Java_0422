package Ch05;
// ppt 53p [예제] 인터페이스 구현
interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
	// PhoneInterface의 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졋습니다.");
	}
}
public class InterfaceEx { // 김종현
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
