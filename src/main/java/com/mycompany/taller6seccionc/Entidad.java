package com.mycompany.taller6seccionc;

import java.util.ArrayList;

/**
 *
 * @author Grupo#2
 */
public class Entidad {
    private String nombre;
    private ArrayList<Accion> acciones;
    
    public void addAccion(Accion accion){
        acciones.add(accion);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
