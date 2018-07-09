package com.zcc.code.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zcc.code.entity.User;
import com.zcc.code.service.UserService;

/**
 * @author zhaocc
 * @time Jul 9, 2018 9:45:43 AM
 * @parent
 */
@Controller
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView getIndex() {
		System.err.println("XXXXXXXXXXXXXXXXX");
		ModelAndView mav = new ModelAndView("index");

		User user = userService.selectUserById(10000003);

		System.out.println(user.getUserFromString());
		mav.addObject("user", user);
		return mav;
	}

	@RequestMapping("/user1")
	public ModelAndView getIndexUser1() {
		System.err.println("XXXXXXXXXXXXXXXXX");
		ModelAndView mav = new ModelAndView("index");

		User user = userService.selectUserById(10000003);

		System.out.println(user.getUserFromString());
		mav.addObject("user", user);
		return mav;
	}

	@RequestMapping("/user2")
	public ModelAndView getIndexUser2() {
		System.err.println("XXXXXXXXXXXXXXXXX");
		ModelAndView mav = new ModelAndView("index");

		User user = userService.selectUserById(10000004);

		System.out.println(user.getUserFromString());
		mav.addObject("user", user);
		return mav;
	}

	@RequestMapping("/users")
	public String list(Map<String, Object> map) {
		map.put("list", userService.getAllUserList());

		return "list";
	}

	@RequestMapping("/insert")
	public String insertUser(@RequestParam(value = "name", required = false) String username, @RequestParam(value = "pass", required = false) String pwd) {
		User user = new User();
		user.setUserName(username);
		user.setUserPassword(pwd);

		System.err.println(user.getUserFromString());
		Integer addOneUser = userService.addOneUser(user);
		System.err.println(addOneUser);

		System.err.println(user.getUserFromString());

		System.err.println(System.currentTimeMillis());
		return "list";
	}

}
