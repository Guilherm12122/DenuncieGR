package com.example.denunciegr.denunciegr.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comentario")
@Getter
@Setter
public class ComentarioModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_comentario;

    private Long cod_postagem_comentario;

    private Long cod_idef_user_comentario;

    @Column(columnDefinition = "TEXT")
    private String texto;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_comentario")
    private Date data_comentario;

    @ManyToOne
    @JoinColumn(name = "cod_idef_user", insertable = false, updatable = false)
    private UsuarioModelo usuarioModelo;

    @ManyToOne
    @JoinColumn(name = "cod_postagem", insertable = false, updatable = false)
    private PostagemModelo postagensModelo;

}
