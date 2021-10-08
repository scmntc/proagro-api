package br.com.otavio.comunicacaoperdaapi.service.impl;

import br.com.otavio.comunicacaoperdaapi.data.ComunicacaoPerdaData;
import br.com.otavio.comunicacaoperdaapi.data.ProdutorRuralData;
import br.com.otavio.comunicacaoperdaapi.framework.CrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.service.ComunicacaoPerdaService;
import br.com.otavio.comunicacaoperdaapi.service.ProdutorRuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutorRuralServiceImpl extends CrudService<ProdutorRural, Long> implements ProdutorRuralService {

    @Autowired
    private ProdutorRuralData data;

    @Override
    protected JpaRepository<ProdutorRural, Long> data() {
        return data;
    }
}
