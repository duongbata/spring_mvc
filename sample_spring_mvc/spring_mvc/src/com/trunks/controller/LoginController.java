package com.trunks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.trunks.bean.InfoValue;
import com.trunks.bean.UserBean;

@Controller
@SessionAttributes("infoValue")
public class LoginController {
	@RequestMapping("/login")
	public String login(Model model) {
		InfoValue info = (InfoValue) model.asMap().get("infoValue");
		UserBean user = new UserBean();
		model.addAttribute("user", user);
		return "LOGIN";
	}
	
	@RequestMapping("/logon")
	public String logon(@ModelAttribute("user") UserBean user, Model model) {
		InfoValue info = new InfoValue();
		info.setUserBean(user);
		model.addAttribute("infoValue", info);
		return "redirect:/login";
	}
}
