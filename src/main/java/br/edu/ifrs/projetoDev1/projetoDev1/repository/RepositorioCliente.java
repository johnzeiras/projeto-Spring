package br.edu.ifrs.projetoDev1.projetoDev1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifrs.projetoDev1.projetoDev1.model.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
}
