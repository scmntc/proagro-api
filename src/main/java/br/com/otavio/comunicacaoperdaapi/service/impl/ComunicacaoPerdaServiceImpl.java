package br.com.otavio.comunicacaoperdaapi.service.impl;

import br.com.otavio.comunicacaoperdaapi.data.ComunicacaoPerdaData;
import br.com.otavio.comunicacaoperdaapi.framework.CrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.service.ComunicacaoPerdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ComunicacaoPerdaServiceImpl extends CrudService<ComunicacaoPerda, Long> implements ComunicacaoPerdaService {

    @Autowired
    private ComunicacaoPerdaData data;

    @Override
    protected JpaRepository<ComunicacaoPerda, Long> data() {
        return data;
    }
}
