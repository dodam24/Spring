package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl");
		messageBean.sayHello();
		messageBean.sayHello("포도", 12000);
		messageBean.sayHello("딸기", 15000, 2);
	}

}
