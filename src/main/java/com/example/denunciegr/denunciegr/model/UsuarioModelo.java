package com.example.denunciegr.denunciegr.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_idef_user;

    private String cpf;
    private String email;
    private String nome;

    @Lob
    @Column(name = "foto")
    private byte[] foto;

    @OneToOne
    @JoinColumn(name = "cod_idef_user", referencedColumnName = "cod_idef_user_adm")
    private AdministradorModelo administradorModelo;

    @OneToMany
    @JoinColumn(name = "cod_idef_user_postagem", referencedColumnName = "cod_idef_user")
    private List<PostagemModelo> postagensModelo;

    @OneToMany
    @JoinColumn(name = "cod_idef_user_comentario", referencedColumnName = "cod_idef_user")
    private List<ComentarioModelo> comentariosModelos;

    @OneToOne
    @JoinColumn(name = "cod_idef_user", referencedColumnName = "cod_idef_user_validacao")
    private ValidacaoModelo validacaoModelo;
}
