package br.com.otavio.comunicacaoperdaapi.controller;

import br.com.otavio.comunicacaoperdaapi.framework.ICrudController;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ComunicacaoPerdaController extends ICrudController<ComunicacaoPerda, Long> {

    @PostMapping("/validar-veracidade-comunicacao")
    List<ObjectNode> validarVeracidadeComunicacao(@RequestBody ComunicacaoPerda comunicacaoPerda);
}
