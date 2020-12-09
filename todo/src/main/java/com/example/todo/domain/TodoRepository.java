package com.example.todo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//The CrudRepository provides CRUD functionality for the entity class that is being managed
//Here we extend the CrudeRepo
//Declare query methods on the interface

public interface TodoRepository extends CrudRepository <Todo, Long> {

	List<Todo> findByTask(@Param("todo") String title);

}

