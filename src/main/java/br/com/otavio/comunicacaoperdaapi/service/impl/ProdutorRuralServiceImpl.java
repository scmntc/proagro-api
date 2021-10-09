package br.com.otavio.comunicacaoperdaapi.service.impl;

import br.com.otavio.comunicacaoperdaapi.data.ProdutorRuralData;
import br.com.otavio.comunicacaoperdaapi.framework.CrudService;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.service.ProdutorRuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutorRuralServiceImpl extends CrudService<ProdutorRural, Long> implements ProdutorRuralService {

    @Autowired
    private ProdutorRuralData data;

    @Override
    protected JpaRepository<ProdutorRural, Long> data() {
        return data;
    }

    @Override
    public List<ProdutorRural> findAutoComplete(String pesquisa) {
        Pageable pageable = PageRequest.of(0, 20);
        return data.findAllByCpfContainingOrNomeContainingOrEmailContaining(pesquisa, pesquisa, pesquisa, pageable);
    }
}
