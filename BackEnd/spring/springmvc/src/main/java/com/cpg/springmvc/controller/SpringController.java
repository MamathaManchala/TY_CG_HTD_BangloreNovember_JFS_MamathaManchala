package com.cpg.springmvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cpg.springmvc.beans.User;

@Controller

public class SpringController {
	
	@Autowired
	private ServletContext context;//we use this for application 
	
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		
		map.addAttribute("msg","hello mammu........!!!!!!");
		return "index";
	}
	
	
	//1:QueryString--------------------------------------------------------------------
	
	//@RequestMapping(path="/query",method= RequestMethod.GET)//overrides doGet method
	@GetMapping//above method and this is same
	public String query(@RequestParam(name="name",required=false)String name, @RequestParam(name="age")Integer age,ModelMap map) {
		
		System.out.println(name);
		System.out.println(age);
		map.addAttribute("name",name);
		map.addAttribute("age",age);
		
		return "query";
	}
	
	
	//2:Form Data--------------------------------------------------------------------
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@PostMapping("/form")
	//public String form(String name,String email,String password,String gender,ModelMap map) {
		public String form(User user,ModelMap map) {	
		
		map.addAttribute("name",user.getName());
		map.addAttribute("email",user.getEmail());
		map.addAttribute("password",user.getPassword());
		map.addAttribute("gender",user.getGender());
		
		return "form";
	}
	
	
	//3:Cookies--------------------------------------------------------------------
	
	@GetMapping("/createcookie")
	public String createCookie( HttpServletResponse response) {
		Cookie cookie=new Cookie("name","Akshay");
		response.addCookie(cookie);
		return "createcookie";
	}
	
	@GetMapping("/getcookie")
	public String getCookie(ModelMap map,@CookieValue(name="name",required=false)String name) {
		if(name!=null)
		map.addAttribute("name",name);
		else
			map.addAttribute("name","mammulu");
		return "getcookie";
		
	}
	
	//4:Path param--------------------------------------------------------------------
	
	@GetMapping("/path/{movie}/{hero}")
	public String path(@PathVariable("movie")String movie,@PathVariable("hero")String hero,ModelMap map) {
		
		map.addAttribute("movie",movie);
		map.addAttribute("hero",hero);
		return "pathvalue";
	}
	
	//5:Forward Request--------------------------------------
	
	@GetMapping("/forward")
	public String forward() {
		return "forward:hello";//hello is controller name,we cannot give jsp name//if we want to give jsp name use this==> forward:jsp name
	}
	
	//6.Redirect-----------------------------------------------
	
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:http://www.google.com";
	}
	
	
	//7.session----------------------------------------------
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
		
	}
	
	//This gives Better Performance than below Code
	
	@PostMapping("/login")
	public String login(String username,String password,HttpServletRequest request, ModelMap map) {
		if(username.equals("mamatha")&& password.equals("abcd")) {
			User user=new User();
			user.setName(username);
			user.setEmail("user@gmail.com");
			user.setPassword(password);
			user.setGender("O");
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			map.addAttribute("msg","User Logged in successfully ");
			return "home";	
		}else {
			map.addAttribute("msg", "Invalid Credentials");
			return "login";
		}
		
	}
	
	
//	@PostMapping("/login")
//	public String login(String username,String password,HttpSession session, ModelMap map) {
//		if(username.equals("user")&& password.equals("abcd")) {
//			map.addAttribute("msg","User Logged in successfully ");
//			return "home";	
//		}else {
//			session.invalidate();
//			map.addAttribute("msg", "Invalid Credentials");
//			return "login";
//		}
		
	//8.session Attribute------------------------------------
	
	@GetMapping("/home")
	public String home(@SessionAttribute(name="user" ,required = false) User user ){
		if(user!=null)
		{
			return "home";
		}else {
			return "login";
		}
	}
	
	//9.Application-----------------------------------------------------
	
	@GetMapping("/setappattribute")
	public String setAppattribute() {
		context.setAttribute("msg", new Object());
		return "setcontext";
	}
	
	@GetMapping("/getappattribute")
	public String getAppAttribute() {
		System.out.println(context.getAttribute("msg"));
		return "getcontext";
		
	}
	
	
	
	
	
}
