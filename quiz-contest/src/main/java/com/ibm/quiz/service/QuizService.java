package com.ibm.quiz.service;

import com.ibm.quiz.entity.Option;
import com.ibm.quiz.entity.Question;
import com.ibm.quiz.entity.Quiz;

public interface QuizService {

    int addQuiz(Quiz q);
	
    Quiz fetchQuiz(int qcode);
	
    Question fetchhQuestion(int qid);
    
    int addQuestion(Question que, int qcode);
    
    int addOption(Option opt, int qid);
    
    String submitQuiz(Quiz q);
	



}
