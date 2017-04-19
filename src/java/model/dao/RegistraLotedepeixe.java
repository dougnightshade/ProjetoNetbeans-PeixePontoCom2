package model.dao;
// Generated 07/09/2016 21:42:17 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RegistraLotedepeixe generated by hbm2java
 */
public class RegistraLotedepeixe  implements java.io.Serializable {


     private Integer registraLoteDePeixeCodigo;
     private Funcionario funcionario;
     private Gaiola gaiola;
     private int registraLoteDePeixeQtdMaxM3;
     private int registraLoteDePeixeQuantidade;
     private BigDecimal registraLoteDePeixeCustoLote;
     private Date registraLoteDePeixeDataDeRegistro;
     private int fkTipoPeixesCodigo;
     private Set realizas = new HashSet(0);
     private Set vendas = new HashSet(0);

    public RegistraLotedepeixe() {
    }

	
    public RegistraLotedepeixe(Funcionario funcionario, Gaiola gaiola, int registraLoteDePeixeQtdMaxM3, int registraLoteDePeixeQuantidade, BigDecimal registraLoteDePeixeCustoLote, Date registraLoteDePeixeDataDeRegistro, int fkTipoPeixesCodigo) {
        this.funcionario = funcionario;
        this.gaiola = gaiola;
        this.registraLoteDePeixeQtdMaxM3 = registraLoteDePeixeQtdMaxM3;
        this.registraLoteDePeixeQuantidade = registraLoteDePeixeQuantidade;
        this.registraLoteDePeixeCustoLote = registraLoteDePeixeCustoLote;
        this.registraLoteDePeixeDataDeRegistro = registraLoteDePeixeDataDeRegistro;
        this.fkTipoPeixesCodigo = fkTipoPeixesCodigo;
    }
    public RegistraLotedepeixe(Funcionario funcionario, Gaiola gaiola, int registraLoteDePeixeQtdMaxM3, int registraLoteDePeixeQuantidade, BigDecimal registraLoteDePeixeCustoLote, Date registraLoteDePeixeDataDeRegistro, int fkTipoPeixesCodigo, Set realizas, Set vendas) {
       this.funcionario = funcionario;
       this.gaiola = gaiola;
       this.registraLoteDePeixeQtdMaxM3 = registraLoteDePeixeQtdMaxM3;
       this.registraLoteDePeixeQuantidade = registraLoteDePeixeQuantidade;
       this.registraLoteDePeixeCustoLote = registraLoteDePeixeCustoLote;
       this.registraLoteDePeixeDataDeRegistro = registraLoteDePeixeDataDeRegistro;
       this.fkTipoPeixesCodigo = fkTipoPeixesCodigo;
       this.realizas = realizas;
       this.vendas = vendas;
    }
   
    public Integer getRegistraLoteDePeixeCodigo() {
        return this.registraLoteDePeixeCodigo;
    }
    
    public void setRegistraLoteDePeixeCodigo(Integer registraLoteDePeixeCodigo) {
        this.registraLoteDePeixeCodigo = registraLoteDePeixeCodigo;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Gaiola getGaiola() {
        return this.gaiola;
    }
    
    public void setGaiola(Gaiola gaiola) {
        this.gaiola = gaiola;
    }
    public int getRegistraLoteDePeixeQtdMaxM3() {
        return this.registraLoteDePeixeQtdMaxM3;
    }
    
    public void setRegistraLoteDePeixeQtdMaxM3(int registraLoteDePeixeQtdMaxM3) {
        this.registraLoteDePeixeQtdMaxM3 = registraLoteDePeixeQtdMaxM3;
    }
    public int getRegistraLoteDePeixeQuantidade() {
        return this.registraLoteDePeixeQuantidade;
    }
    
    public void setRegistraLoteDePeixeQuantidade(int registraLoteDePeixeQuantidade) {
        this.registraLoteDePeixeQuantidade = registraLoteDePeixeQuantidade;
    }
    public BigDecimal getRegistraLoteDePeixeCustoLote() {
        return this.registraLoteDePeixeCustoLote;
    }
    
    public void setRegistraLoteDePeixeCustoLote(BigDecimal registraLoteDePeixeCustoLote) {
        this.registraLoteDePeixeCustoLote = registraLoteDePeixeCustoLote;
    }
    public Date getRegistraLoteDePeixeDataDeRegistro() {
        return this.registraLoteDePeixeDataDeRegistro;
    }
    
    public void setRegistraLoteDePeixeDataDeRegistro(Date registraLoteDePeixeDataDeRegistro) {
        this.registraLoteDePeixeDataDeRegistro = registraLoteDePeixeDataDeRegistro;
    }
    public int getFkTipoPeixesCodigo() {
        return this.fkTipoPeixesCodigo;
    }
    
    public void setFkTipoPeixesCodigo(int fkTipoPeixesCodigo) {
        this.fkTipoPeixesCodigo = fkTipoPeixesCodigo;
    }
    public Set getRealizas() {
        return this.realizas;
    }
    
    public void setRealizas(Set realizas) {
        this.realizas = realizas;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }




}

