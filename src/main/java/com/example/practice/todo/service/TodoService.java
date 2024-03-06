package com.example.practice.todo.service;

import com.example.practice.todo.dto.TodoDto;
import com.example.practice.todo.entity.Todo;

import java.util.List;

public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);
    TodoDto getTodo(Long id);
    List<TodoDto> getAllTodos();
    TodoDto updateTodo(TodoDto todoDto,Long id);

    void deleteTodo(Long id);
    TodoDto completeTodo(Long id);
    TodoDto inCompleteTodo(Long id);
}
