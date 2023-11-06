package com.exf.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Student, String>
{

}
