package br.com.otavio.comunicacaoperdaapi.controller;

import br.com.otavio.comunicacaoperdaapi.framework.ICrudController;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;

import java.util.List;

public abstract interface ProdutorRuralController extends ICrudController<ProdutorRural, Long> {

    List<ProdutorRural> findAutoComplete(String pesquisa);
}
