package com.zx.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagTest {
	
	private static Logger log = Logger.getLogger(TagTest.class);  
	
	@RequestMapping("/tag1")
	public String tag1()
	{
		log.info("---------------------");
		return "/tag/index";
	}
	
}
