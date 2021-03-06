package model.dao;
// Generated 07/09/2016 21:42:17 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AlimentaHora generated by hbm2java
 */
public class AlimentaHora  implements java.io.Serializable {


     private Integer alimentaHoraCodigo;
     private Date alimentaHoraHora;
     private Set alimentas = new HashSet(0);

    public AlimentaHora() {
    }

	
    public AlimentaHora(Date alimentaHoraHora) {
        this.alimentaHoraHora = alimentaHoraHora;
    }
    public AlimentaHora(Date alimentaHoraHora, Set alimentas) {
       this.alimentaHoraHora = alimentaHoraHora;
       this.alimentas = alimentas;
    }
   
    public Integer getAlimentaHoraCodigo() {
        return this.alimentaHoraCodigo;
    }
    
    public void setAlimentaHoraCodigo(Integer alimentaHoraCodigo) {
        this.alimentaHoraCodigo = alimentaHoraCodigo;
    }
    public Date getAlimentaHoraHora() {
        return this.alimentaHoraHora;
    }
    
    public void setAlimentaHoraHora(Date alimentaHoraHora) {
        this.alimentaHoraHora = alimentaHoraHora;
    }
    public Set getAlimentas() {
        return this.alimentas;
    }
    
    public void setAlimentas(Set alimentas) {
        this.alimentas = alimentas;
    }




}


