package com.care.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
}
