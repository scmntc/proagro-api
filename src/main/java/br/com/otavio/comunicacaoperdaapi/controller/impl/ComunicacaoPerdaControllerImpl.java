package br.com.otavio.comunicacaoperdaapi.controller.impl;

import br.com.otavio.comunicacaoperdaapi.controller.ComunicacaoPerdaController;
import br.com.otavio.comunicacaoperdaapi.framework.CrudController;
import br.com.otavio.comunicacaoperdaapi.framework.ICrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.service.ComunicacaoPerdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comunicacao-perda")
public class ComunicacaoPerdaControllerImpl extends CrudController<ComunicacaoPerda, Long> implements ComunicacaoPerdaController {

    @Autowired
    private ComunicacaoPerdaService service;

    @Override
    protected ICrudService<ComunicacaoPerda, Long> service() {
        return service;
    }
}
