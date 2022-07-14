package br.edu.ifrs.projetoDev1.projetoDev1.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.projetoDev1.projetoDev1.model.Cliente;
import br.edu.ifrs.projetoDev1.projetoDev1.repository.RepositorioCliente;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoCliente {

    @Autowired
    private RepositorioCliente clienteRepository;

    public Cliente addCLiente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> pesquisaCliente(Long id){
        return clienteRepository.findById(id);
    }

    public void removeCliente(Long id){
        clienteRepository.deleteById(id);
    }
}