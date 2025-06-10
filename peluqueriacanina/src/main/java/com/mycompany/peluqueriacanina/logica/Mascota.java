
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre_mascota;
    private String raza;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Duenio duenioMascota;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_mascota, String raza, String alergico, String atencion_especial, String observaciones, Duenio duenioMascota) {
        this.num_cliente = num_cliente;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.duenioMascota = duenioMascota;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuenioMascota() {
        return duenioMascota;
    }

    public void setDuenioMascota(Duenio duenioMascota) {
        this.duenioMascota = duenioMascota;
    }
    
    
    
}
