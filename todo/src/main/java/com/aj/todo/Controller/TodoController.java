package com.aj.todo.Controller;


import java.util.List;                                                  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aj.todo.Models.Todo;
import com.aj.todo.Service.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {



    @Autowired
    private TodoService todoService;






    // @GetMapping("/")
    // public String home(){
    //     return "index";
    // }

    @GetMapping("/addTodo")
    public String add(){
        return "addTodo";
    }

    @GetMapping("/")
    public ModelAndView getAllTodo() {
        List<Todo>list = todoService.getAllTodo();
        return new ModelAndView("index", "todo", list);
    }
    

    @PostMapping("/save")
    public String addDetails(@ModelAttribute Todo t) {
        todoService.save(t);
        return "redirect:/";
    }


    @RequestMapping("/editTodo/{id}")
    public String editTodo(@PathVariable("id") int id, Model model) {
        Todo t = todoService.getByTodos(id);
        model.addAttribute("todo", t);
        return "todoEdit";
    }

    @RequestMapping("/deleteTodo/{id}")
    public String deleteTodo(@PathVariable("id") int id) {
        todoService.deleteById(id);
        return "redirect:/";
    }    


    @GetMapping("/updateTodo/{id}")
    public String updateTodo(@PathVariable("id") int id, Model model){
        Todo t = todoService.updateStatus(id);
        model.addAttribute("todo", t);
        return "redirect:/";
    }

    @GetMapping("/searchTodo")
    public String searchTodos(@RequestParam(name = "category", required = false) String category,
                              @RequestParam(name = "query", required = false) String query,
                              Model model) {
        List<Todo> todo;
    
        if (query == null || query.isEmpty()) {
            todo = todoService.getAllTodo(); 
        } else {
            todo = todoService.searchTodos(category, query); 
        }
    
        model.addAttribute("todo", todo);
        return "index"; // ✅ Don't redirect, return the filtered result page.
    }
    


















    
}
