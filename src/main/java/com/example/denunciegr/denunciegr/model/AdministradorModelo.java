package com.example.denunciegr.denunciegr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "administrador")
@Getter
@Setter
public class AdministradorModelo {

    @Id
    private Long cod_idef_user_adm;
    private String contato;

    @OneToOne
    @JoinColumn(name = "cod_idef_user_adm", referencedColumnName = "cod_idef_user")
    private UsuarioModelo usuarioModelo;
}
