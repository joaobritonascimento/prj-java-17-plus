package org.senai.prjjava17.dtos;

import java.io.Serializable;

import org.senai.prjjava17.entity.Usuario;

public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public UsuarioDTO() {
        super();
    }

    // Criação do metodo construtor
    public UsuarioDTO(Usuario obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
