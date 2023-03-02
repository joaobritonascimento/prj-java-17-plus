package org.senai.prjjava17.repositories;

import org.senai.prjjava17.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
    
}

