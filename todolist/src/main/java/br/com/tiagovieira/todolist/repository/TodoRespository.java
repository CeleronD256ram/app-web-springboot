package br.com.tiagovieira.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagovieira.todolist.entity.Todo;

public interface TodoRespository extends JpaRepository<Todo, Long>{
    
}
