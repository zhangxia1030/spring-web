package com.zx.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.entity.Coffee;
import com.zx.entity.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/rest")
	@ResponseBody
	public User getUser()
	{
		User user = new User();
		user.setName("nihao");
		user.setAddress("anhui");
		user.setAge("89");
		user.setWork("软件");
		
		return user;
	}
	
	@RequestMapping("/toXml")
	@ResponseBody
	public Coffee getXML()
	{
		return new Coffee("雀巢", 10);
	}
}
