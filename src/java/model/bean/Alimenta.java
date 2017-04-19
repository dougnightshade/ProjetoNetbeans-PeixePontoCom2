package model.bean;
// Generated 23/10/2016 17:38:25 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Alimenta generated by hbm2java
 */
@Entity
@Table(name="alimenta"
    ,catalog="peixepontocom"
)
public class Alimenta  implements java.io.Serializable {


     private Integer alimentaCodigo;
     private AlimentaHora alimentaHora;
     private BiometriaPeixeItem biometriaPeixeItem;
     private Gaiola gaiola;
     private Racao racao;
     private BigDecimal alimentaQtdDaRefeicao;
     private Date alimentaData;

    public Alimenta() {
    }

    public Alimenta(AlimentaHora alimentaHora, BiometriaPeixeItem biometriaPeixeItem, Gaiola gaiola, Racao racao, BigDecimal alimentaQtdDaRefeicao, Date alimentaData) {
       this.alimentaHora = alimentaHora;
       this.biometriaPeixeItem = biometriaPeixeItem;
       this.gaiola = gaiola;
       this.racao = racao;
       this.alimentaQtdDaRefeicao = alimentaQtdDaRefeicao;
       this.alimentaData = alimentaData;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="alimenta_Codigo", unique=true, nullable=false)
    public Integer getAlimentaCodigo() {
        return this.alimentaCodigo;
    }
    
    public void setAlimentaCodigo(Integer alimentaCodigo) {
        this.alimentaCodigo = alimentaCodigo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_A_Alimenta_Hora_Codigo", nullable=false)
    public AlimentaHora getAlimentaHora() {
        return this.alimentaHora;
    }
    
    public void setAlimentaHora(AlimentaHora alimentaHora) {
        this.alimentaHora = alimentaHora;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_A_biometria_Peixe_Item_Codigo", nullable=false)
    public BiometriaPeixeItem getBiometriaPeixeItem() {
        return this.biometriaPeixeItem;
    }
    
    public void setBiometriaPeixeItem(BiometriaPeixeItem biometriaPeixeItem) {
        this.biometriaPeixeItem = biometriaPeixeItem;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_A_Gaiola_Codigo", nullable=false)
    public Gaiola getGaiola() {
        return this.gaiola;
    }
    
    public void setGaiola(Gaiola gaiola) {
        this.gaiola = gaiola;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_A_Racao_Codigo", nullable=false)
    public Racao getRacao() {
        return this.racao;
    }
    
    public void setRacao(Racao racao) {
        this.racao = racao;
    }

    
    @Column(name="alimenta_QtdDaRefeicao", nullable=false, precision=10, scale=3)
    public BigDecimal getAlimentaQtdDaRefeicao() {
        return this.alimentaQtdDaRefeicao;
    }
    
    public void setAlimentaQtdDaRefeicao(BigDecimal alimentaQtdDaRefeicao) {
        this.alimentaQtdDaRefeicao = alimentaQtdDaRefeicao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="alimenta_Data", nullable=false, length=10)
    public Date getAlimentaData() {
        return this.alimentaData;
    }
    
    public void setAlimentaData(Date alimentaData) {
        this.alimentaData = alimentaData;
    }




}

