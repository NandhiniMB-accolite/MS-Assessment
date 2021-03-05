package com.ms.assessment.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;
import com.ms.assessment.Repository.IQuestionRepository;
import com.ms.assessment.Service.IQuestionService;

@Service
public class QuestionService implements IQuestionService {

	@Autowired
	IQuestionRepository questionRepository;
	@Override
	public void saveQuestions(Question question,MCQ mcq) {
		// TODO Auto-generated method stub
		question.setMcq(mcq);
		questionRepository.save(question);
	}

}
