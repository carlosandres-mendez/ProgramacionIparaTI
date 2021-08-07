/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import java.util.Objects;

/**
 *
 * @author Andres
 */
public class Direccion {
    String pais;
    String provincia;
    String canton;
    String distrito;
    String detalle;
    
    public Direccion(){
        pais = "CR";
    }
    
    public Direccion(String pais, String provincia){
        this.pais = pais;
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.pais);
        hash = 53 * hash + Objects.hashCode(this.provincia);
        hash = 53 * hash + Objects.hashCode(this.canton);
        hash = 53 * hash + Objects.hashCode(this.distrito);
        hash = 53 * hash + Objects.hashCode(this.detalle);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Direccion other = (Direccion) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.canton, other.canton)) {
            return false;
        }
        if (!Objects.equals(this.distrito, other.distrito)) {
            return false;
        }
        if (!Objects.equals(this.detalle, other.detalle)) {
            return false;
        }
        return true;
    }
    
    
}
