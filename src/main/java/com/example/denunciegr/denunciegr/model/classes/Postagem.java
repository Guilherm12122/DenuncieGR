package com.example.denunciegr.denunciegr.model.classes;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Postagem {
    
    private String cod_postagem;
    private String cod_idef_user;
    private byte[] foto_postagem;
    private String titulo;
    private String descricao;
    private Date data_abertura;
    private Date data_fechamento;
    private BigInteger qtde_curtidas;
    private Usuario usuario;
    private List<Comentario> comentarios;
}
