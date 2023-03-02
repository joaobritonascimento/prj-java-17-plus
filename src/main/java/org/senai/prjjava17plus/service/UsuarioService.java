package org.senai.prjjava17plus.service;

import java.util.List;
import java.util.Optional;

import org.senai.prjjava17plus.entity.Produto;
import org.senai.prjjava17plus.entity.Usuario;
import org.senai.prjjava17plus.repositories.UsuarioRepository;
import org.senai.prjjava17plus.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private ProdutoService produtoService;
    
    public Usuario findById(Integer id){
         Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! id:" + id + ", Tipo: " + Usuario.class.getName()));

    }

    public List<Usuario> findAll(Integer id_prod) {
        produtoService.findById(id_prod);
        return repository.findAllByProduto(id_prod); //
    }

    public Usuario update(Integer id, Usuario obj) {
        Usuario newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Usuario newObj, Usuario obj) {
        newObj.setNome(obj.getNome());
        newObj.setEmail(obj.getEmail());
    }

    public Usuario create(Integer id_prod, Usuario obj) {
        obj.setId(null);
        Produto prod = produtoService.findById(id_prod);
        obj.setproduto(prod);
        return repository.save(obj);
    }

    public void delete(Integer id){
      Usuario obj = findById(id);
      repository.delete(obj);  
    }
}
