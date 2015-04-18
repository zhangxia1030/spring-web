package com.zx.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zx.entity.User;

@Controller
public class Object2Object
{
	@RequestMapping("/acceptParmerter")
	public String acceptParmerter(String name, String age, String address, String work, ModelMap model)
	{
		model.addAttribute("msg", name + "," + age + "," + address + "," + work);
		return "success";
	}

	@RequestMapping("/acceptObj")
	public String acceptObject(User user, ModelMap model)
	{
		model.addAttribute("msg", user.toString());
		return "success";
	}
}
