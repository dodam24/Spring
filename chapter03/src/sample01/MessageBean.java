package sample01;

public interface MessageBean {
	public void showPrintBefore();
	public void viewPrintBefore();
	
	public void showPrintAfter();
	public void viewPrintAfter();
	
	public String showPrint();
	public void viewPrint();

	public void display(); //JoinPoint이지만 Pointcut은 아님
}
