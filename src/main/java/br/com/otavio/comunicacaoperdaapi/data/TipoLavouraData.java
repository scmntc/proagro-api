package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import br.com.otavio.comunicacaoperdaapi.model.TipoLavoura;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TipoLavouraData extends JpaRepository<TipoLavoura, Long> {

    List<TipoLavoura> findAllByDeletadoFalseOrderByIdDesc();

    @Transactional(readOnly = true)
    @Query(nativeQuery = true, value = "select distinct tl.* from comunicacao_perda cp left join tipo_lavoura tl on tl.id = cp.idlavoura ")
    List<TipoLavoura> findAllTipoLavouraAtiva();
}
