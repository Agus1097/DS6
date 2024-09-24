package com.example.inicial1.services;

import com.example.inicial1.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T extends Base, ID> {

    public List<T> findAll() throws Exception;

    public Page<T> findAll(Pageable pageable) throws Exception;

    public T findById(ID id) throws Exception;

    public T save(T entity) throws Exception;

    public T update(ID id, T entity) throws Exception;

    public void delete(ID id) throws Exception;
}
