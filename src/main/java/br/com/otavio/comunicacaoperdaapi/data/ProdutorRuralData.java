package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutorRuralData extends JpaRepository<ProdutorRural, Long> {
}
