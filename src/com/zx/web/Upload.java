package com.zx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Upload {
	
	@RequestMapping("/upload1")
	public String upload1()
	{
		System.out.println("=============================");
		return "/upload/upload1";
	}
	
	@RequestMapping("/upload2")
	public String upload2()
	{
		System.out.println("=============================");
		return "/upload/upload2";
	}
	
}
