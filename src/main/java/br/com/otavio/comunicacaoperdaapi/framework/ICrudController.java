package br.com.otavio.comunicacaoperdaapi.framework;

import java.io.Serializable;
import java.util.List;

public interface ICrudController<T, ID extends Serializable> {

    T save(T entity);

    T findById(ID id);

    List<T> findAll();

    void deleteById(ID id);
}
