package com.enzomarco.gestion.concesionaria.logica;

import com.enzomarco.gestion.concesionaria.persistencia.ControladorPersistencia;
import java.util.List;


public class ControladorLogica {

    ControladorPersistencia controlP = new ControladorPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);

        
        controlP.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlP.traerAautos();
    }

    public void borrarAuto(int idAuto) {
        controlP.borrarAuto(idAuto);
    }
    

    
}
