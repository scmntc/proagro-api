package br.com.otavio.comunicacaoperdaapi.model;

import br.com.otavio.comunicacaoperdaapi.framework.GenericModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class TipoLavoura extends GenericModel implements Serializable {

    @Column
    private String descricao;
}
