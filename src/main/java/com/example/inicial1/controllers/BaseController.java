package com.example.inicial1.controllers;

import com.example.inicial1.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseController<T extends Base, ID> {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getAll(int size, int page);

    ResponseEntity<?> getOne(@PathVariable ID id);

    ResponseEntity<?> save(@RequestBody T entity);

    ResponseEntity<?> update(@PathVariable ID id, @RequestBody T entity);

    ResponseEntity<?> delete(@PathVariable ID id);
}
