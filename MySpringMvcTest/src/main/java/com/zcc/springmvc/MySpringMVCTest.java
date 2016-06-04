package com.zcc.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author user
 *
 */
@Controller
@RequestMapping("/hello")
public class MySpringMVCTest {

	@RequestMapping("mvc")
	public String helloMvc() {
		return "ok2";
	}
}
