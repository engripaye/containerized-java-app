package Service;

import Model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class todoService {

    private final Map<Long, Todo> todos = new HashMap<>();
    private Long nextId = 1L;

    public List<Todo> getAll(){
        return new ArrayList<>(todos.values());
    }


    public Todo add(Todo todo){
        todo.setId(nextId++);
        todos.put(todo.getId(), todo);
        return todo;
    }

    public void delete(Long id){
        todos.remove(id);
    }
}
