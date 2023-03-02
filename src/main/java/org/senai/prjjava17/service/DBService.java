package org.senai.prjjava17.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import org.senai.prjjava17.entity.Produto;
import org.senai.prjjava17.entity.Usuario;
import org.senai.prjjava17.repositories.ProdutoRepository;
import org.senai.prjjava17.repositories.UsuarioRepository;

@Service
public class DBService {

    @Autowired //Camadas de acesso a dados
	private ProdutoRepository produtoRepository;
	
    @Autowired //Camadas de acesso a dados
	private UsuarioRepository usuarioRepository;

    public void instanciaBaseDeDados(){

        //produto prod1 = new produto(null, "componentes", "Componentes eletronicos");
		//produto prod2 = new produto(null, "Instrumentos", "Instrumentos de medida");
		//produto prdo3 = new produto(null, "acessorios", "Acessorios de eletrônica");

		//usuario u1 = new usuario(null, "Clean code", "Robert Martin", "Lorem ipsum", prod1);
		//usuario u2 = new usuario(null, "Engenharia de software", "Louis V. Gerstner", "Lorem ipsum", prod1);
		//usuario u3 = new usuario(null, "The time machine", "H. G. Wells", "Lorem ipsum", prod2);
		//usuario u4 = new usuario(null, "The war of the world", "H. G. Wells", "Lorem ipsum", prod2);
		//usuario u5 = new usuario(null, "I, Robot", "Isaac Asimv", "Lorem ipsum", prod2);

		//pro1.getusuarios().addAll(Arrays.asList(l1, l2));
		//prod2.getusuarios().addAll(Arrays.asList(l3, l4, l5));

		//this.produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3)); //Salva tudo de uma vez só
		//this.usuarioRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
}
}
