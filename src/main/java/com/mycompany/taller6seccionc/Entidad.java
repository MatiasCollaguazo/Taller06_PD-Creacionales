package com.mycompany.taller6seccionc;

import java.util.ArrayList;

/**
 *
 * @author Grupo#2
 */
public class Entidad {
    private String nombre;
    private ArrayList<Accion> acciones;

    public Entidad() {
        acciones = new ArrayList<>();
    }

    public void addAccion(Accion accion) {
        acciones.add(accion);
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }
    
    public void dibujar(){
        //Dibuja la entidad, sin embargo aun no la muestra
    }
    
    public void actualizar(){
        //Actualiza la entidad en pantalla
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
