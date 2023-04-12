package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { //사용자 콜백 메소드 (스프링 컨테이너에 의해 자동으로 호출, 직접 호출할 필요없음)
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring !!");
		//mav.setViewName("hello"); //파일명 지정
		mav.setViewName("/view/hello"); //폴더와 파일명 지정
		//http://localhost:8080/chapter06/view/hello.jsp 호출 O
		return mav;	
	}
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result2", "Have a nice day !!");
		mav.setViewName("/WEB-INF/view2/hello2"); //외부에서는 WEB-INF에 접근 불가
		//http://localhost:8080/chapter06/WEB-INF/view2/hello2.jsp 호출 X
		return mav;
	}
	
	@RequestMapping(value="/hello3.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String hello3() {
		//return "Welcome"; //파일명 Welcome.jsp로 인식한다.
		return "안녕하세요";
	}
	
	//스프링에서는 return타입이 String이면 파일명으로 인식한다.
	//스프링은 Welcome.jsp 파일을 찾는다.
	//만약 단순 문자열로 웹 브라우저에 나타내려면 @ResponseBody를 써야 한다.
}

/*
콜백 메소드
 - 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메소드
  

http://localhost:8080/Context명(Project명)/hello.do 요청

DispatcherServlet 
	↕ HandlerMapping
HelloController.java


*/