package org.senai.prjjava17.service;

import java.util.List;
import java.util.Optional;

import org.senai.prjjava17.repositories.usuarioRepository;
import org.senai.prjjava17.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.senai.prjjava17.entity.Produto;
import org.senai.prjjava17.entity.Usuario;

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

    public List<Usuario> findAll(Integer id_cat) {
        produtoService.findById(id_cat);
        return repository.findAllByproduto(id_cat); //
    }

    public Usuario update(Integer id, Usuario obj) {
        Usuario newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Usuario newObj, Usuario obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNome_autor(obj.getNome_autor());
        newObj.setTexto(obj.getTexto());
    }

    public Usuario create(Integer id_cat, Usuario obj) {
        obj.setId(null);
        Produto cat = produtoService.findById(id_cat);
        obj.setproduto(cat);
        return repository.save(obj);
    }

    public void delete(Integer id){
      Usuario obj = findById(id);
      repository.delete(obj);  
    }
}
