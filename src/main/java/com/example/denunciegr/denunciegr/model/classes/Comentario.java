package com.example.denunciegr.denunciegr.model.classes;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Comentario {

    private String cod_comentario;
    private String cod_postagem;
    private String cod_idef_user;
    private String texto;
    private Date data_comentario;
    private Usuario usuario;
    private Postagem postagem;
    
}
