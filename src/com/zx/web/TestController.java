package com.zx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/testMvc")
	public String xmlPage(String name)
	{
		System.out.println("========================"+name);
		return "Hello World";
	}
	
}
