package org.senai.prjjava17plus.repositories;

import org.senai.prjjava17plus.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
    
}

