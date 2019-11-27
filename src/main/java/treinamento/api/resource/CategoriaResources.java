package treinamento.api.resource;

import java.util.List;
import java.util.Optional;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import treinamento.api.model.Categoria;
import treinamento.api.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<Object> listar(){
		List<Categoria> categorias = this.categoriaService.listar();
		
		if (categorias.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return  ResponseEntity.ok(categorias);
	}
	
	@GeneratedValue
	public Categoria CadastraCategoria(Long codigo, String nome) {
		Categoria categoria = new Categoria(codigo, nome);
		return categoria;
	}
	
	@GetMapping("/verifica")
	public ResponseEntity<Object> verificaCategoria(@RequestParam String nome) {
		List<Categoria> categorias = this.categoriaService.listar();
		Optional retorno =this.categoriaService.findByNome(nome);
		if(retorno.isPresent()) {
			return ResponseEntity.ok(true);
		}
		return ResponseEntity.notFound().build();
	}
	
}
