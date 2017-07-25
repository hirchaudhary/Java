package com.hiral.em.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.em.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query("SELECT e FROM Employee e WHERE manager_id = ?1")
	List<Employee> findAllEmployeesByManagerId(long id);

}
