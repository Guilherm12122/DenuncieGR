package com.example.denunciegr.denunciegr.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "postagem")
@Getter
@Setter
public class PostagemModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_postagem;

    @ManyToOne
    @JoinColumn(name = "cod_idef_user", insertable = false, updatable = false)
    private UsuarioModelo usuarioModelo;
    

    private Long cod_idef_user_postagem;


    @Lob
    @Column(name = "foto_postagem")
    private byte[] foto_postagem;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_abertura")
    private Date data_abertura;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_fechamento")
    private Date data_fechamento;

    @Column(columnDefinition = "BIGINT")
    private BigInteger qtde_curtidas;

    @OneToMany
    @JoinColumn(name = "cod_postagem_comentario", referencedColumnName = "cod_postagem")
    private List<ComentarioModelo> comentariosModelos;







    
}
