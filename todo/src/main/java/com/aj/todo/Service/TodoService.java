package com.aj.todo.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aj.todo.Models.*;
import com.aj.todo.Dao.TodoDao;

@Service
public class TodoService {


    @Autowired
    private TodoDao todoDao;



    public List<Todo> getAllTodo(){
        return todoDao.findAll();
    }

    public Todo save(Todo t) {
        return todoDao.save(t);
    }


    public Todo getByTodos(int id){
        return todoDao.findById(id).get();
    }

    public void deleteById(int id){
        todoDao.deleteById(id);
    }

    public Todo updateStatus(int id ) {
        Todo t = getByTodos(id);
        t.setStatus("Completed");
        return save(t);
    }



    public List<Todo> searchTodos(String category, String query) {
        switch (category) {
            case "title":
                return todoDao.findByTitleContainingIgnoreCase(query);
            case "date":
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // ✅ Fix format
                    Date parsedDate = dateFormat.parse(query);
                    return todoDao.findByDate(parsedDate);
                } catch (ParseException e) {
                    return List.of();
                }
            case "status":
                return todoDao.findByStatusContainingIgnoreCase(query);
            default:
                return todoDao.findAll();
        }
    }
}    