package org.senai.prjjava17.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.senai.prjjava17.entity.Produto;

public class ProdutoDTO implements Serializable { // a classe Serializable é uma interface em metodos ou atributos

    private static final long serialVersionUID = 1l;

    private Integer id;

    @NotEmpty(message = "Campo NOME é obrigatório")
    @Length(min = 3, max = 100, message = "O campo NOME de deve entre 3 e 100 caracteres")
    private String nome;

    @NotEmpty(message = "Campo DESCRIÇÃO é obrigatório")
    @Length(min = 3, max = 200, message = "O campo DESCRIÇÃO de deve entre 3 e 200 caracteres")
    private String descricao;

    public ProdutoDTO() {
        super();
    }

    //Criação do metodo construtor
    public ProdutoDTO(Produto obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
        this.valor = obj.getValor();
        this.img = obj.getImg();

    
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
