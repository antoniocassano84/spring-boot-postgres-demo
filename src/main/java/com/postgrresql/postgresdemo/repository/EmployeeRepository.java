package com.postgrresql.postgresdemo.repository;

import com.postgrresql.postgresdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {}
