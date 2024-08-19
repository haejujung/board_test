package com.tenco.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping({"/main-page" , "/index"})
	public String mainPage() {
		System.out.println("mainPage() 호출 확인");
		return "main";
	}

}
