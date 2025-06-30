package Controller;

import Model.Todo;
import Service.todoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
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

    @DeleteMapping
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }


}
