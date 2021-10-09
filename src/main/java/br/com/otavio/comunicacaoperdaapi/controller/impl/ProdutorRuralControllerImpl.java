package br.com.otavio.comunicacaoperdaapi.controller.impl;

import br.com.otavio.comunicacaoperdaapi.controller.ProdutorRuralController;
import br.com.otavio.comunicacaoperdaapi.framework.CrudController;
import br.com.otavio.comunicacaoperdaapi.framework.ICrudService;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.service.ProdutorRuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtor-rural", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutorRuralControllerImpl extends CrudController<ProdutorRural, Long> implements ProdutorRuralController {

    @Autowired
    private ProdutorRuralService service;

    @Override
    protected ICrudService<ProdutorRural, Long> service() {
        return service;
    }

    @Override
    @GetMapping("/auto-complete")
    public List<ProdutorRural> findAutoComplete(@RequestParam("pesquisa") String pesquisa) {
        return service.findAutoComplete(pesquisa);
    }
}
