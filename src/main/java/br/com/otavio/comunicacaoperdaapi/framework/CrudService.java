package br.com.otavio.comunicacaoperdaapi.framework;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class CrudService<T, ID extends Serializable> implements ICrudService<T, ID>{

    protected abstract JpaRepository<T, ID> data();

    @Override
    public T save(T entity) {
        return data().save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return data().findById(id);
    }

    @Override
    public void deleteById(ID id) {
        data().deleteById(id);
    }

    @Override
    public List<T> findAll() {
        return data().findAll();
    }

}
