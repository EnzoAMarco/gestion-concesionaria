package com.enzomarco.gestion.concesionaria.persistencia;

import com.enzomarco.gestion.concesionaria.logica.Automovil;
import java.util.List;


public class ControladorPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAautos() {
        return autoJpa.findAutomovilEntities();
    }
    
}
