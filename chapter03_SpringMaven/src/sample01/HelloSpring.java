package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("acQuickStart.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl");
		
		//Before (공통 코드가 앞ㄴ에 삽입)
		/*
		messageBean.showPrintBefore();
		System.out.println();
		messageBean.viewPrintBefore();
		System.out.println();
		messageBean.display();
		*/
		
		//After (공통 코드가 뒤에 삽입)
		/*
		messageBean.showPrintAfter();
		System.out.println();
		messageBean.viewPrintAfter();
		System.out.println();
		messageBean.display();
		*/
		
		//Around (공통 코드가 앞, 뒤로 삽입)
		messageBean.showPrint();
		System.out.println();
		messageBean.viewPrint();
		System.out.println();
		messageBean.display();
		
	}

}
