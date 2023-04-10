package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloSpring { //클래스를 생성해야 menu() 함수 호출 가능

	//menu() 작성 - 5번 입력할 때까지 무한루프
	public void menu(ApplicationContext context) { //void main함수에서 context값을 전달받아 menu함수에서 사용
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 삭제");
			System.out.println("   5. 끝");
			System.out.println("**************");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			
			if(num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(num == 1)
				sungJuk = (SungJuk) context.getBean("sungJukInput");
			else if(num == 2) 
				sungJuk = (SungJuk) context.getBean("sungJukOutput");
			else if(num == 3) 
				sungJuk = (SungJuk) context.getBean("sungJukUpdate");
//			else if(num == 4) 
//				sungJuk = (SungJuk) context.getBean("sungJukDelete");
	
			sungJuk.execute(); //호출
			
		} //while
	} //menu()

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		helloSpring.menu(context); //context(지역변수)값을 menu()함수에 전달
		//System.out.println("프로그램을 종료합니다.");
	}	
	
}
