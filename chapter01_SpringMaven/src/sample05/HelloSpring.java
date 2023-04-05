package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //설정 파일이 어디 있는지 알려준다.
		SungJuk sungJuk = (SungJuk)context.getBean("sungJukImpl"); //부모로 접근해야 한다. (부모=자식)
		sungJuk.calc();
		sungJuk.display();
	}

}
