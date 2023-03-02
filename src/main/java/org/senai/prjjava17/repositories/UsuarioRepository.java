package org.senai.prjjava17.repositories;

import org.senai.prjjava17.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { //Usuario pertence a Usuario.java, e Integer é o tipo do id
    
}
