package br.edu.ifrs.projetoDev1.projetoDev1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifrs.projetoDev1.projetoDev1.model.Produto;

public interface RepositorioProduto extends JpaRepository<Produto, Long> {
}
