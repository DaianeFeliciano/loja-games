package br.org.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

		// usando o que ja existe e dentro dele tem os métodos que vao usar
		// criar metodo de dentro da interface se quiser procurar algo que nao tem
	
	
	
}
