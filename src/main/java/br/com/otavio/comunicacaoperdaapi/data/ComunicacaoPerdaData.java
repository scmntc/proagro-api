package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComunicacaoPerdaData extends JpaRepository<ComunicacaoPerda, Long> {
}
