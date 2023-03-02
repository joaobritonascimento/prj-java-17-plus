package org.senai.prjjava17plus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L; // 1L define que essa é a primeira versão da classe.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Campo NOME é obrigatório")
    @Length(min = 3, max = 100, message = "O campo NOME de deve entre 3 e 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo DESCRIÇÃO é obrigatório")
    @Length(min = 3, max = 200, message = "O campo DESCRIÇÃO de deve entre 3 e 200 caracteres")
    private String descricao;
    private float valor;
    private String img;

    @OneToMany(mappedBy ="produto")
    private List<Usuario> usuarios = new ArrayList<>();

    public Produto(){
        super();
    }
    // Criação do construtor
    public Produto(Integer id, String nome, String descricao, float valor, String img) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.img = img;
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
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuario(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
