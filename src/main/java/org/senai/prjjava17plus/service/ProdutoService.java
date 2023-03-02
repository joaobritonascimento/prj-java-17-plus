package org.senai.prjjava17plus.service;

import java.util.List;
import java.util.Optional;

import org.senai.prjjava17plus.dtos.ProdutoDTO;
import org.senai.prjjava17plus.entity.Produto;
import org.senai.prjjava17plus.repositories.ProdutoRepository;
import org.senai.prjjava17plus.service.exceptions.DataIntegrityViolationException;
import org.senai.prjjava17plus.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import org.senai.prjjava17.entity.produto;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;

    //Metodo findById
    public Produto findById (Integer id){ 
        Optional<Produto> obj = repository.findById(id); 
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
}
    //Metodo findAll
    public List<Produto> findAll(){ 
        return repository.findAll();
    }
    
    //Metodo create
    public Produto create(Produto obj){ 
        obj.setId(null);
        return repository.save(obj);
    }

    //Metodo update
    public Produto update(Integer id, ProdutoDTO objDto) { 
        Produto obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }

    // metodo delete
    public void delete(Integer id) { 
        findById(id);
        try {
            repository.deleteById(id);
        } catch (org.springframework.dao.DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("produto não pode ser deletada! Possui objetos associados!");
           
        }
    }
}