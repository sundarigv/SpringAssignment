package com.project.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import com.project.springbootdemo.model.*;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {
	//Users findByName(String name);
	Users findByEducation(String name);
	Users findByCid(Long id1);
	
	@Query(value = "SELECT AVG(AGE) FROM sample_data_sql WHERE age IS NOT NULL", nativeQuery = true)
    public float findAge();
}
