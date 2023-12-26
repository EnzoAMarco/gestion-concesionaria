package com.enzomarco.gestion.concesionaria;

import com.enzomarco.gestion.concesionaria.IGU.Home;

public class GestionConcesionaria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //muestro el landing page de la app
        Home landingP = new Home();
        landingP.setVisible(true);
        landingP.setLocationRelativeTo(null);
        
    }
}
