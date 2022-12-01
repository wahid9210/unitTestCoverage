package com.wahid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wahid.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
