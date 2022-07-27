package com.care.quiz.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.quiz.dao.QuizDAO;
import com.care.quiz.dto.QuizDTO;
@Service
public class QuizService {
	@Autowired
	QuizDAO dao;	
	public void service() {
	System.out.println("service 실행");
	}
	public void register(QuizDTO dto) {
		dao.register(dto);
	}
	public void list(Model model) {
		ArrayList<QuizDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	public void info(Model model, String id) {
		ArrayList<QuizDTO> list = dao.list();
		for(QuizDTO dto : list) {
			if(dto.getId().equals(id)) {
				model.addAttribute("dto", dto);
			}
		}
	}
	public int logchk(QuizDTO dto) {
		ArrayList<QuizDTO> list = dao.list();
		for(QuizDTO d : list) {
			if(d.getId().equals(dto.getId())) {
				if(d.getPwd().equals(dto.getPwd())) {
					return 1;
				}
				return 0;
			}
		}
		return -1;
	}
}

