package com.example.demo.todos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	
	List<Todo> findByusername(String username);
	
}
