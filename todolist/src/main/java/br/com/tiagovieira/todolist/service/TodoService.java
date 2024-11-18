package br.com.tiagovieira.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tiagovieira.todolist.entity.Todo;
import br.com.tiagovieira.todolist.repository.TodoRespository;

@Service
public class TodoService {

    private TodoRespository todoRespository;


    public TodoService(TodoRespository todoRespository) {
        this.todoRespository = todoRespository;
    }
    

    public List<Todo> create(Todo todo) {
        todoRespository.save(todo);
        return list();
        
    }

    public List<Todo> list() {
        Sort.by("prioridade").descending()
        .and(Sort.by("nome").ascending());
        return todoRespository.findAll();
       

    }

    public List<Todo> update(Todo todo) {
        todoRespository.save(todo);
        return list();
        
    }

    public List<Todo> delete(Long id) {
        todoRespository.deleteById(id);
        return list();
    }
    

}
