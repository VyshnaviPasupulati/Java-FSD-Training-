package com.ibm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.model.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {

}
