package br.com.otavio.comunicacaoperdaapi.controller.impl;

import br.com.otavio.comunicacaoperdaapi.controller.ProdutorRuralController;
import br.com.otavio.comunicacaoperdaapi.controller.TipoLavouraController;
import br.com.otavio.comunicacaoperdaapi.framework.CrudController;
import br.com.otavio.comunicacaoperdaapi.framework.ICrudService;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.model.TipoLavoura;
import br.com.otavio.comunicacaoperdaapi.service.ProdutorRuralService;
import br.com.otavio.comunicacaoperdaapi.service.TipoLavouraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tipo-lavoura", produces = MediaType.APPLICATION_JSON_VALUE)
public class TipoLavouraControllerImpl extends CrudController<TipoLavoura, Long> implements TipoLavouraController {

    @Autowired
    private TipoLavouraService service;

    @Override
    protected ICrudService<TipoLavoura, Long> service() {
        return service;
    }

}
