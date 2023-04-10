package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { //사용자 콜백 메소드 (스프링 컨테이너에 의해 자동으로 호출, 직접 호출할 필요없음)
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring !!");
		mav.setViewName("hello"); //파일명 지정
		return mav;
		
	}

}

/*
콜백 메소드
 - 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메소드
  

http://localhost:8080/Context명(Project명)/hello.do 요청

DispatcherServlet 
	↕ HandlerMapping
HelloController.java


*/