package com.example.denunciegr.denunciegr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "validacao")
@Getter
@Setter
public class ValidacaoModelo {

    @Id
    private Long cod_idef_user_validacao;

    private String nome_usuario;

    private String senha;

    @OneToOne
    @JoinColumn(name = "cod_idef_user_validacao", referencedColumnName = "cod_idef_user")
    private UsuarioModelo usuarioModelo;
    
}
