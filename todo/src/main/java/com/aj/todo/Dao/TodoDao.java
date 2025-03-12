package com.aj.todo.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.todo.Models.Todo;

@Repository
public interface TodoDao extends JpaRepository<Todo, Integer> {


    List<Todo> findByTitleContainingIgnoreCase(String title);
    List<Todo> findByDate(Date date);
    List<Todo> findByStatusContainingIgnoreCase(String status);
}
