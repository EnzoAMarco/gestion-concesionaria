package com.enzomarco.gestion.concesionaria.logica;

import com.enzomarco.gestion.concesionaria.persistencia.ControladorPersistencia;


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
    

    
}
