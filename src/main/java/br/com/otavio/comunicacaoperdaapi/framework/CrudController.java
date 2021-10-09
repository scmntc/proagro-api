package br.com.otavio.comunicacaoperdaapi.framework;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@CrossOrigin
public abstract class CrudController<T, ID extends Serializable> implements ICrudController<T, ID> {

    protected abstract ICrudService<T, ID> service();

    @Override
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public T save(@RequestBody T entity) {
        return service().save(entity);
    }

    @Override
    @GetMapping(params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public T findById(@RequestParam("id") ID id) {
        return service().findById(id).orElseThrow(() -> new RuntimeException("Objeto não encontrado"));
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<T> findAll() {
        return service().findAll();
    }
}
