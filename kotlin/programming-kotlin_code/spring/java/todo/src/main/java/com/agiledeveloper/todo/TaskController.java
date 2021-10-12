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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController   
@RequestMapping("/task")
class TaskController {

  private final TaskService service;

  public TaskController(TaskService service) {
    this.service = service;
  }

/*

  @GetMapping
  String tasks() {
    return "to be implemented";
  }                         
*/

  @GetMapping
  ResponseEntity<Iterable<Task>> tasks() {
    return ResponseEntity.ok(service.getAll());
  }                         

  @PostMapping
  ResponseEntity<String> create(@RequestBody Task task) {
    Task result = service.save(task);

    return ResponseEntity.ok(
      "added task with description " + result.getDescription());
  }

  @DeleteMapping("/{id}")
  ResponseEntity<String> delete(@PathVariable Long id) {
    if (service.delete(id)) {
      return ResponseEntity.ok("Task with id " + id + " deleted");
    }
    
    return ResponseEntity.status(404)
      .body("Task with id " + id + " not found");
  }

  
}          
