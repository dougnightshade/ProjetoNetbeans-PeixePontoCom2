package model.bean;
// Generated 18/10/2016 09:33:51 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FornecedorHasRacao generated by hbm2java
 */
@Entity
@Table(name="fornecedor_has_racao"
    ,catalog="peixepontocom"
)
public class FornecedorHasRacao  implements java.io.Serializable {


     private Integer fornecedorHasRacaoCodigo;
     private Fornecedor fornecedor;
     private Racao racao;

    public FornecedorHasRacao() {
    }

    public FornecedorHasRacao(Fornecedor fornecedor, Racao racao) {
       this.fornecedor = fornecedor;
       this.racao = racao;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="fornecedor_has_racao_Codigo", unique=true, nullable=false)
    public Integer getFornecedorHasRacaoCodigo() {
        return this.fornecedorHasRacaoCodigo;
    }
    
    public void setFornecedorHasRacaoCodigo(Integer fornecedorHasRacaoCodigo) {
        this.fornecedorHasRacaoCodigo = fornecedorHasRacaoCodigo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_Fhr_fornecedor_Codigo", nullable=false)
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_Fhr_racao_Codigo", nullable=false)
    public Racao getRacao() {
        return this.racao;
    }
    
    public void setRacao(Racao racao) {
        this.racao = racao;
    }




}


