package br.edu.ifrs.projetoDev1.projetoDev1.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nomeProduto", nullable = false)
    private String nomeProduto;

    @Column(name = "codigoProduto", nullable = false)
    private String codigoProduto;
    
    @Column(name = "valorProduto", nullable = false)
    private Double valorProduto;
}

