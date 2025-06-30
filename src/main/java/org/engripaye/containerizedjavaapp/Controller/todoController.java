package org.engripaye.containerizedjavaapp.Controller;

import org.engripaye.containerizedjavaapp.Model.Todo;
import org.engripaye.containerizedjavaapp.Service.todoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class todoController {

    private final todoService todoService;

    public todoController(todoService service) {
        this.todoService = service;
    }

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo){
        return todoService.add(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
