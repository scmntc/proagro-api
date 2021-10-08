package br.com.otavio.comunicacaoperdaapi.model;

import br.com.otavio.comunicacaoperdaapi.framework.GenericModel;
import br.com.otavio.comunicacaoperdaapi.model.enumeratores.EEventoOcorrido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComunicacaoPerda extends GenericModel implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idprodutorrural", foreignKey = @ForeignKey(name = "FK_ProdutorRural_ComunicacaoPerda"), nullable = false)
    private ProdutorRural produtorRural;

    @Column(nullable = false, name = "eventoocorrido")
    @Enumerated(EnumType.STRING)
    private EEventoOcorrido eventoOcorrido;

    @Column(name = "datacolheita")
    private LocalDate dataColheita;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idlavoura", foreignKey = @ForeignKey(name = "FK_TipoLavoura_ComunicacaoPerda"), nullable = false)
    private TipoLavoura tipoLavoura;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idlocalizacao", foreignKey = @ForeignKey(name = "FK_LocalizacaoLavoura_ComunicacaoPerda"), nullable = false)
    private LocalizacaoLavoura localizacaoLavoura;


}
