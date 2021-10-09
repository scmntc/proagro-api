package br.com.otavio.comunicacaoperdaapi.framework;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface ICrudService<T, ID extends Serializable> {

    T save(T entity);

    Optional<T> findById(ID id);

    void deleteById(ID id);

    List<T> findAll();

    List<T> findAllByDeletado();

}
