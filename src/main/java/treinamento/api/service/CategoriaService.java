package treinamento.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import treinamento.api.model.Categoria;
import treinamento.api.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepositiry;
	
	public List<Categoria> listar(){
		return this.categoriaRepositiry.findAll();
	}
	
	public Optional<Categoria> findByNome(String nome) {
		return this.categoriaRepositiry.findByNome(nome);
	}
}
