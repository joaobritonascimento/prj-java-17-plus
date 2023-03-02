package org.senai.prjjava17plus.repositories;

import java.util.List;

import org.senai.prjjava17plus.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findAllByproduto(Integer id_cat); //Usuario pertence a Usuario.java, e Integer é o tipo do id
    
}
