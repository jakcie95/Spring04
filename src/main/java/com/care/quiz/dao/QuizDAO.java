package com.care.quiz.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.quiz.dto.QuizDTO;
@Repository
public class QuizDAO {
	private ArrayList<QuizDTO> list;
	public QuizDAO(){
		list = new ArrayList<QuizDTO>();
	}
	public void register(QuizDTO dto) {
		list.add(dto);
	}
	public ArrayList<QuizDTO> list() {
		return list;
	}
}
