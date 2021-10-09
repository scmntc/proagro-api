package br.com.otavio.comunicacaoperdaapi.service;

import br.com.otavio.comunicacaoperdaapi.framework.ICrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;

import java.util.List;

public interface ProdutorRuralService extends ICrudService<ProdutorRural, Long> {

    List<ProdutorRural> findAutoComplete(String pesquisa);
}
