package br.com.otavio.comunicacaoperdaapi.service.impl;

import br.com.otavio.comunicacaoperdaapi.data.TipoLavouraData;
import br.com.otavio.comunicacaoperdaapi.framework.CrudService;
import br.com.otavio.comunicacaoperdaapi.model.TipoLavoura;
import br.com.otavio.comunicacaoperdaapi.service.TipoLavouraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoLavouraServiceImpl extends CrudService<TipoLavoura, Long> implements TipoLavouraService {

    @Autowired
    private TipoLavouraData data;

    @Override
    protected JpaRepository<TipoLavoura, Long> data() {
        return data;
    }

    @Override
    public List<TipoLavoura> findAllByDeletado() {
        return data.findAllByDeletadoFalse();
    }
}
