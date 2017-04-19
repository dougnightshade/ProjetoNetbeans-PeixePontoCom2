package model.dao;
// Generated 07/09/2016 21:42:17 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Biometria generated by hbm2java
 */
public class Biometria  implements java.io.Serializable {


     private Integer biometriaCodigo;
     private BigDecimal biometriaTotalQuilos;
     private int biometriaNumDaEtapa;
     private BigDecimal biometriaTaxaArracoamento;
     private Date biometriaDataDeRealizacao;
     private Set realizas = new HashSet(0);
     private Set alimentas = new HashSet(0);

    public Biometria() {
    }

	
    public Biometria(BigDecimal biometriaTotalQuilos, int biometriaNumDaEtapa, BigDecimal biometriaTaxaArracoamento) {
        this.biometriaTotalQuilos = biometriaTotalQuilos;
        this.biometriaNumDaEtapa = biometriaNumDaEtapa;
        this.biometriaTaxaArracoamento = biometriaTaxaArracoamento;
    }
    public Biometria(BigDecimal biometriaTotalQuilos, int biometriaNumDaEtapa, BigDecimal biometriaTaxaArracoamento, Date biometriaDataDeRealizacao, Set realizas, Set alimentas) {
       this.biometriaTotalQuilos = biometriaTotalQuilos;
       this.biometriaNumDaEtapa = biometriaNumDaEtapa;
       this.biometriaTaxaArracoamento = biometriaTaxaArracoamento;
       this.biometriaDataDeRealizacao = biometriaDataDeRealizacao;
       this.realizas = realizas;
       this.alimentas = alimentas;
    }
   
    public Integer getBiometriaCodigo() {
        return this.biometriaCodigo;
    }
    
    public void setBiometriaCodigo(Integer biometriaCodigo) {
        this.biometriaCodigo = biometriaCodigo;
    }
    public BigDecimal getBiometriaTotalQuilos() {
        return this.biometriaTotalQuilos;
    }
    
    public void setBiometriaTotalQuilos(BigDecimal biometriaTotalQuilos) {
        this.biometriaTotalQuilos = biometriaTotalQuilos;
    }
    public int getBiometriaNumDaEtapa() {
        return this.biometriaNumDaEtapa;
    }
    
    public void setBiometriaNumDaEtapa(int biometriaNumDaEtapa) {
        this.biometriaNumDaEtapa = biometriaNumDaEtapa;
    }
    public BigDecimal getBiometriaTaxaArracoamento() {
        return this.biometriaTaxaArracoamento;
    }
    
    public void setBiometriaTaxaArracoamento(BigDecimal biometriaTaxaArracoamento) {
        this.biometriaTaxaArracoamento = biometriaTaxaArracoamento;
    }
    public Date getBiometriaDataDeRealizacao() {
        return this.biometriaDataDeRealizacao;
    }
    
    public void setBiometriaDataDeRealizacao(Date biometriaDataDeRealizacao) {
        this.biometriaDataDeRealizacao = biometriaDataDeRealizacao;
    }
    public Set getRealizas() {
        return this.realizas;
    }
    
    public void setRealizas(Set realizas) {
        this.realizas = realizas;
    }
    public Set getAlimentas() {
        return this.alimentas;
    }
    
    public void setAlimentas(Set alimentas) {
        this.alimentas = alimentas;
    }




}

