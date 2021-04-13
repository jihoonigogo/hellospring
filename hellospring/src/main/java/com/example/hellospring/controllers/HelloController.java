package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // component
public class HelloController {
	//요청을 받는 역할 
	//url 패턴 /hello에 반응하고
	//매개변수 name을 받는다 
	// ex ) /hello?name=김길동
	@RequestMapping("/hello") // 1. 요청이 들어온다. param = /hello?
	public ModelAndView hello(@RequestParam String name) {//2. 이 메서드가 실행된다.
		//Spring의 기본 응답 객체는 ModelAndView이다.
		//데이터(model)와 view객체의 정보를 함께 가고 있음.
		ModelAndView mav = new ModelAndView();
		
		//1.데이터를 설정하자 
		mav.addObject("message","hello"+name); // 서블릿에서이 attribute.
		
		//2.뷰를 설정하자
		mav.setViewName("/WEB-INF/views/hello.jsp");
		
		//3.리턴해준다
		return mav;
		
		//뜻 : 1의 데이터를 2의 뷰로 전달한다.
	}
}
