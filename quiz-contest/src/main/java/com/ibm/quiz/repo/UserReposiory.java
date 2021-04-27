package com.ibm.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.quiz.entity.User;

public interface UserReposiory extends JpaRepository<User, Integer> {

}
