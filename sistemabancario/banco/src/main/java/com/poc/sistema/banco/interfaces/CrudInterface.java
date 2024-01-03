package com.poc.sistema.banco.interfaces;

import java.util.List;

public interface CrudInterface<T> {
    public void create(T obj);
    public List<T> getAll();
    public T getById(Long id);
    public void deleteById(Long id);

}
