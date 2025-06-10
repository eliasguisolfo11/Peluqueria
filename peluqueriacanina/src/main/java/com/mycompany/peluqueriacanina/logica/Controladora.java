
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String nombreDuenio, String celu, String observaciones, String raza, String alergico, String atencionEsp) {
        //creamos duenio
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celu);
       
        //creamos mascota
        Mascota masco = new Mascota();
        masco.setNombre_mascota(nombreMasco);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setObservaciones(observaciones);
        masco.getAtencion_especial();
        masco.setDuenioMascota(duenio);
        
        controlPersistencia.guardar(duenio, masco);
    }
    
}
