package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample01.LoggingAdvice;
import sample01.MessageBeanImpl;

@Configuration //일반 자바파일이 아니라 환경설정 파일임을 명시
@EnableAspectJAutoProxy
public class SpringConfiguration {
	
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl();
	}
	
	@Bean
	public LoggingAdvice loginadvice() {
		return new LoggingAdvice();
	}
}
