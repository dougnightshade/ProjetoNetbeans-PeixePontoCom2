package model.dao;
// Generated 07/09/2016 21:42:17 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Alimenta generated by hbm2java
 */
public class Alimenta  implements java.io.Serializable {


     private Integer alimentaCodigo;
     private AlimentaHora alimentaHora;
     private Biometria biometria;
     private Gaiola gaiola;
     private Racao racao;
     private String alimentaQtdDaRefeicao;
     private Date alimentaData;

    public Alimenta() {
    }

    public Alimenta(AlimentaHora alimentaHora, Biometria biometria, Gaiola gaiola, Racao racao, String alimentaQtdDaRefeicao, Date alimentaData) {
       this.alimentaHora = alimentaHora;
       this.biometria = biometria;
       this.gaiola = gaiola;
       this.racao = racao;
       this.alimentaQtdDaRefeicao = alimentaQtdDaRefeicao;
       this.alimentaData = alimentaData;
    }
   
    public Integer getAlimentaCodigo() {
        return this.alimentaCodigo;
    }
    
    public void setAlimentaCodigo(Integer alimentaCodigo) {
        this.alimentaCodigo = alimentaCodigo;
    }
    public AlimentaHora getAlimentaHora() {
        return this.alimentaHora;
    }
    
    public void setAlimentaHora(AlimentaHora alimentaHora) {
        this.alimentaHora = alimentaHora;
    }
    public Biometria getBiometria() {
        return this.biometria;
    }
    
    public void setBiometria(Biometria biometria) {
        this.biometria = biometria;
    }
    public Gaiola getGaiola() {
        return this.gaiola;
    }
    
    public void setGaiola(Gaiola gaiola) {
        this.gaiola = gaiola;
    }
    public Racao getRacao() {
        return this.racao;
    }
    
    public void setRacao(Racao racao) {
        this.racao = racao;
    }
    public String getAlimentaQtdDaRefeicao() {
        return this.alimentaQtdDaRefeicao;
    }
    
    public void setAlimentaQtdDaRefeicao(String alimentaQtdDaRefeicao) {
        this.alimentaQtdDaRefeicao = alimentaQtdDaRefeicao;
    }
    public Date getAlimentaData() {
        return this.alimentaData;
    }
    
    public void setAlimentaData(Date alimentaData) {
        this.alimentaData = alimentaData;
    }




}


