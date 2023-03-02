package org.senai.prjjava17plus.service;

import java.util.Arrays;

import org.senai.prjjava17plus.entity.Produto;
import org.senai.prjjava17plus.entity.Usuario;
import org.senai.prjjava17plus.repositories.ProdutoRepository;
import org.senai.prjjava17plus.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.Arrays;

@Service
public class DBService {

    @Autowired //Camadas de acesso a dados
	private ProdutoRepository produtoRepository;
	
    @Autowired //Camadas de acesso a dados
	private UsuarioRepository usuarioRepository;

    public void instanciaBaseDeDados(){

        Produto prod1 = new Produto(null, "resistor", "resistor 1w", (float) 1.99, "https://www.baudaeletronica.com.br/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/f/cfr-25jb-22r.jpg");
		Produto prod2 = new Produto(null, "multimetro", "minipa", (float) 45.00, "https://m.media-amazon.com/images/I/61wSovhXxSL._AC_SY879_.jpg");
		//Produto prdo3 = new Produto(null, "acessorios", "Acessorios de eletrônica");

		Usuario u1 = new Usuario(null, "Joao ", "joao@gmail.com", prod1);
		Usuario u2 = new Usuario(null, "Paulo", "paulo@gmail.com", prod1);
		Usuario u3 = new Usuario(null, "Maria", "maria@gmail.com", prod2);
		
		prod1.getUsuarios().addAll(Arrays.asList(u1, u2));
		prod2.getUsuarios().addAll(Arrays.asList(u3));

		this.produtoRepository.saveAll(Arrays.asList(prod1, prod2)); //Salva tudo de uma vez só
		this.usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
}
}
