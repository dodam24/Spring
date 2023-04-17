package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
//공통관심사항
public class LoggingAdvice {
	
	@Before("execution(public void sample01.MessageBeanImpl.*Before())") //~before로 끝나는 메소드가 실행되면 호출
	public void beforeTrace() {
		System.out.println("before trace");
	}
	
	@After("execution(public * *.*.*After())") //~after로 끝나는 메소드가 실행되면 호출
	public void afterTrace() {
		System.out.println("after trace");
	}
	
	@Around("execution(public * *.MessageBeanImpl.*Print(..))") //~print로 끝나는 메소드가 실행되면 호출
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable { //Around 부분
		//앞에 삽입될 코드
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("메소드 = " + methodName);
		
		StopWatch sw = new StopWatch(); //스탑워치를 통해 메서드가 수행되는 시간을 계산
		sw.start(methodName); 
		
		Object ob = joinPoint.proceed();//핵심코드 호출
		System.out.println(ob);
		
		//뒤에 삽입될 코드
		sw.stop();
		System.out.println("처리 시간 = " + sw.getTotalTimeMillis()/1000 + "초");
	}
}
