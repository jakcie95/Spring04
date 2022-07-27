package com.care.quiz.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.quiz.dto.QuizDTO;
import com.care.quiz.service.QuizService;

@Controller
public class QuizController {
	@Autowired
	QuizService qs;
	@GetMapping("index")
	public String index() {
		return "index";
	}
	@PostMapping("register")
	public String register(QuizDTO dto) {
		qs.register(dto);
		return "index";
	}
	@GetMapping("register_form")
	public String registerForm() {
		return "register_form";
	}
	@GetMapping("list")
	public String list(Model model) {
		qs.list(model);
		return "list";
	}
	@GetMapping("info")
	public String info(Model model,String id) {
		System.out.println("id : "+id);
		qs.info(model, id);
		return "info";
	}
	@PostMapping("logchk")
	public String logchk(QuizDTO dto, RedirectAttributes rs) {
		int result = qs.logchk(dto);
		if(result == 1) {
			return "redirect: success?id="+dto.getId();
		}
		rs.addFlashAttribute("result",result);
		return "redirect:index";
	}
	@GetMapping("success")
	public String success(String id, Model model) {
		qs.info(model, id);
		return "success";
	}
	@GetMapping("cookie")
	public String myCookie(HttpServletResponse res,
						   HttpServletRequest req,
						   Model model,
						   @CookieValue(value ="Cookie", required = false) Cookie cookie) {
				System.out.println("cookie : "+cookie);
				Cookie[] cooks = req.getCookies();
				for(Cookie c : cooks) {
					System.out.println(c.getName());
				}
				Cookie cook = new Cookie("Cookie", "user");
				cook.setMaxAge(100);
				cook.setPath("/");
				res.addCookie(cook);
		
				return "cookie/cookie";
	}
	@GetMapping("popup")
	public String popup() {
		return "popup";
	}
	
}
