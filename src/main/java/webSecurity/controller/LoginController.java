package webSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import webSecurity.model.User;
import webSecurity.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/login")
	public String loginPage(@ModelAttribute User user) {
		return "service/login";
	}

	@GetMapping(value = "/admin/hello")
	public String helloAdmin(Model model) {
		List<String> messages = new ArrayList<>();
		messages.add("Administrator page");
		model.addAttribute("messages", messages);
		return "admin/hello";
	}

	@GetMapping(value = "/user/{id}")
	public String helloUser(Model model, @PathVariable("id") Long id) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "user/getUser";
	}


}