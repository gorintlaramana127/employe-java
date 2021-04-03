package com.example.ramana.employeeapp.repositary;

import com.example.ramana.employeeapp.model.EmployeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface EmployeRepo extends MongoRepository<EmployeModel,Integer> {
}
