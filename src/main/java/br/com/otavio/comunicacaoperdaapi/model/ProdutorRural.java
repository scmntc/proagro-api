package br.com.otavio.comunicacaoperdaapi.model;

import br.com.otavio.comunicacaoperdaapi.framework.GenericModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Table(name = "produtorrural")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutorRural extends GenericModel implements Serializable {

    @Column(nullable = false)
    private String nome;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String cpf;
}
