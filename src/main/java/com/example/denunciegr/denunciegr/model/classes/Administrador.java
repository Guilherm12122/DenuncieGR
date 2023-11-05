package com.example.denunciegr.denunciegr.model.classes;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrador extends Usuario {

    private String contato;

    public Administrador(String cod_idef_user, String cpf, String email, byte[] foto, List<Postagem> postagems,
                        List<Comentario> comentarios) {
        super(cod_idef_user, cpf, email, foto, postagems, comentarios);
    }
    
}
