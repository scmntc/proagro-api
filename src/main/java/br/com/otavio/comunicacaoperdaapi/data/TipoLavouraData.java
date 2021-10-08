package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.model.TipoLavoura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoLavouraData extends JpaRepository<TipoLavoura, Long> {
}
