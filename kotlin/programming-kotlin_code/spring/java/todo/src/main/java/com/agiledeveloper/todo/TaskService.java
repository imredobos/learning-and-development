/***
 * Excerpted from "Programming Kotlin",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
***/
//Java code only for comparison purpose
package com.agiledeveloper.todo;

import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
            
@Service
@Transactional
class TaskService {
  private final TaskRepository repository;
  
  public TaskService(TaskRepository repository) {
    this.repository = repository;
  }
  
  Iterable<Task> getAll() {
    return repository.findAll();
  }

  Task save(Task task) {
    return repository.save(task);
  }
  
  boolean delete(Long id) {
    boolean found = repository.existsById(id);
    
    if (found) {
      repository.deleteById(id);
    }

    return found;
  }
}
