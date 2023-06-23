package com.taskManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.taskManagement.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

	
	@Transactional
	@Query(nativeQuery = true, value = "SELECT ID, COD_USER, DATA_CRIACAO, DESCRICAO, STATUS, TITULO FROM TASK WHERE ID = :id AND COD_USER = :coduser")
	Task findTaskById(@Param("id") int id, @Param("coduser") Long coduser);


}
