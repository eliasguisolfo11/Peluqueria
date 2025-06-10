
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
       //creamos en la base de datos el duenio
        duenioJpa.create(duenio);
        //creamos en la base de datos la mascota
        mascotaJpa.create(masco);
        
    }
    
}
