package com.devrezaur.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrezaur.main.model.Question;
import com.devrezaur.main.model.QuestionForm;
import com.devrezaur.main.model.Result;
import com.devrezaur.main.repository.QuestionRepo;
import com.devrezaur.main.repository.ResultRepo;

@Service
public class QuizService {
	
	@Autowired
	Question question;
	
	@Autowired
	QuestionForm qForm;
	
	@Autowired
	QuestionRepo qRepo;
	
	@Autowired
	Result result;
	
	@Autowired
	ResultRepo rRepo;
	
	public QuestionForm getQuestions() {
		List<Question> allQues = qRepo.findAll();
		List<Question> qList = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i=0; i<5; i++)
		{
			int rand = random.nextInt(allQues.size());
		}
	}
	
}
