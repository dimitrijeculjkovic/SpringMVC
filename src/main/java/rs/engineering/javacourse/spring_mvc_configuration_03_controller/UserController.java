package rs.engineering.javacourse.spring_mvc_configuration_03_controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rs.engineering.javacourse.spring_mvc_configuration_03_dto.User;
import rs.engineering.javacourse.spring_mvc_configuration_03_service.UserService;

@Controller
public class UserController {
	
	
	private UserService ListUsers;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("list", ListUsers.getUsers());
		return modelAndView;
	}
	
	@ModelAttribute(name = "user")
	public User user() {
		return new User("", "", "", "");
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("action", "Action: Add user");
		return "addUser";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	public String save(@ModelAttribute(name = "user") User user) {
		
		ListUsers.save(user); 
		return "redirect:/addUser";
	}
	

}
