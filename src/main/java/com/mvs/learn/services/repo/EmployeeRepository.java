package com.mvs.learn.services.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mvs.learn.services.document.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
