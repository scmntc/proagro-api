package br.com.otavio.comunicacaoperdaapi.service;

import br.com.otavio.comunicacaoperdaapi.framework.ICrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

public interface ComunicacaoPerdaService extends ICrudService<ComunicacaoPerda, Long> {
    List<ObjectNode> validarVeracidadeComunicacao(ComunicacaoPerda entity);
}
