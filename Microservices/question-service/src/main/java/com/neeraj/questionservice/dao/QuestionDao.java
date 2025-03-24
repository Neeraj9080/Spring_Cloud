package com.neeraj.questionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeraj.questionservice.model.Question;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
