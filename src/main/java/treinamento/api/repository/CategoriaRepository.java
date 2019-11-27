package treinamento.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import treinamento.api.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public Optional<Categoria> findByNome(String nome);
	
	
}
