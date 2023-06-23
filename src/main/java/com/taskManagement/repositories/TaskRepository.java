package com.taskManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManagement.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

	
	
	

}
