package com.example.denunciegr.denunciegr.model.classes;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    private String cod_idef_user;
    private String cpf;
    private String email;
    private byte[] foto;
    private List<Postagem> postagems;
    private List<Comentario> comentarios;
    
}
