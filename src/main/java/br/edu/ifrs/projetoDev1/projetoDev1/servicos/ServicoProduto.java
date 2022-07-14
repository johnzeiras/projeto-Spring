package br.edu.ifrs.projetoDev1.projetoDev1.servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.projetoDev1.projetoDev1.model.Produto;
import br.edu.ifrs.projetoDev1.projetoDev1.repository.RepositorioProduto;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoProduto {

    @Autowired
    private RepositorioProduto produtoepository;

    public Produto addProduto(Produto produto){
        return produtoepository.save(produto);
    }

    public List<Produto> listaProduto(){
        return produtoepository.findAll();
    }

    public Optional<Produto> pesquisaPorduto(Long id){
        return produtoepository.findById(id);
    }

    public void removeProduto(Long id){
        produtoepository.deleteById(id);
    }
}