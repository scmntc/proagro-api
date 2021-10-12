package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface ComunicacaoPerdaData extends JpaRepository<ComunicacaoPerda, Long> {

    List<ComunicacaoPerda> findAllByDeletadoFalseOrderByIdDesc();

    @Transactional(readOnly = true)
    @Query(nativeQuery = true,
            value = "select * from comunicacao_perda cp where cp.datacolheita =:dataColheita and cp.eventoocorrido != :eventoOcorrido and cp.deletado = false")
    List<ComunicacaoPerda> findAllByDataColheitaEqualsAndEventoOcorridoIsNotLike(@Param("dataColheita") LocalDate date,
                                                                                 @Param("eventoOcorrido") String eventoOcorrido);
}
