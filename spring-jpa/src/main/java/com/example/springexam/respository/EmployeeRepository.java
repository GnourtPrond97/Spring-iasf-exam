package com.example.springexam.respository;

import com.example.springexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String > {
}
