package com.trunks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.trunks.bean.InfoValue;

@Controller
@SessionAttributes("infoValue")
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		InfoValue info = (InfoValue) model.asMap().get("infoValue");
		String msg = (String) model.asMap().get("msg");
		return "WELCOME";
	}
}
