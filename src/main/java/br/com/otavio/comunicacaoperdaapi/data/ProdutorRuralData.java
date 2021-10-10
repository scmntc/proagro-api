package br.com.otavio.comunicacaoperdaapi.data;

import br.com.otavio.comunicacaoperdaapi.model.ProdutorRural;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProdutorRuralData extends JpaRepository<ProdutorRural, Long> {

    @Transactional(readOnly = true)
    List<ProdutorRural> findAllByDeletadoFalseAndCpfContainingOrNomeContainingOrEmailContaining(String cpf, String nome, String email, Pageable pageable);

    List<ProdutorRural> findAllByDeletadoFalse();
}
