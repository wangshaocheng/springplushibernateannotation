package com.sxt.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sxt.service.UserService;
@Component
@RequestMapping("/user.do")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping
	public ModelAndView reg(String uname) {
		System.out.println("HelloController.reg()");
		userService.add(uname);
		Map<String, String> mvMap = new HashMap<String, String>();
		mvMap.put("aa", "bb");
		ModelAndView mv = new ModelAndView("index", mvMap);
		return mv;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
 