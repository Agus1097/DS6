package com.example.inicial1.services;

import java.util.List;

public interface BaseService<T> {

    public List<T> findAll() throws Exception;

    public T findById(Long id) throws Exception;

    public T save(T entity) throws Exception;

    public T update(Long id, T entity) throws Exception;

    public void delete(Long id) throws Exception;
}
