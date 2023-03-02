package org.senai.prjjava17plus.repositories;

import java.util.List;

import org.senai.prjjava17plus.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

     //Criar a Query no formato JPQL - Metodo que ira listar todos os livros daquela categoria
     @Query("SELECT obj FROM Usuario obj WHERE obj.produto.id = :id_prod ORDER BY produto")    
     List<Usuario> findAllByProduto(@Param(value = "id_prod") Integer id_prod); //Metodo findAllByCategoria
     
 }

