package sample01;

import lombok.Setter;

public class MessageBeanImpl implements MessageBean {
	@Setter
	private String str;
	
//	public void setStr(String str) { //str에 데이터 값을 줄 때, setter를 통해 전달
//		this.str = str;
//	}

	@Override
	public void showPrintBefore() {
		//System.out.println("before trace"); //LoggingAdvice(공통)에서 한 번에 호출
		System.out.println("showPrintBefore 메시지 = " + str); //핵심 코드
	}

	@Override
	public void viewPrintBefore() {
		//System.out.println("before trace");
		try {
			Thread.sleep(1000); //1초 - 단위 1/1000초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore 메시지 = " + str); //핵심 코드

	}

	
	@Override
	public void showPrintAfter() {
		System.out.println("shwoPrintAfter 메시지 = " + str); //핵심 코드
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintAfter 메시지 = " + str); //핵심 코드
	}
	
	

	@Override
	public String showPrint() {
		System.out.println("shwoPrint 메시지 = " + str); //핵심 코드
		return "스프링";
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrint 메시지 = " + str); //핵심 코드
	}
	
	@Override
	public void display() {
		System.out.println("display 메시지 = " + str); //핵심 코드
	}

}
