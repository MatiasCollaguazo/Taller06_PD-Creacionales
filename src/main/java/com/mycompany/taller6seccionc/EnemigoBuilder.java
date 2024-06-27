package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class EnemigoBuilder extends EntidadBuilder {

    public EnemigoBuilder() {
        e = new Enemigo();
    }

    @Override
    public void setName(String nombre) {
        e.setNombre(nombre);
    }

    @Override
    public void setAttributes() {
        // Establece los atributos específicos del enemigo
        ((Enemigo) e).setTipo("Mago Oscuro");  // Ejemplo de establecimiento del tipo
        ((Enemigo) e).setPoder(75.5f);  // Ejemplo de establecimiento del poder
    }
    
    @Override
    public void addAction(Accion accion) {
        // Ejemplo, ser hostil contra el jugador
        e.addAction(accion);
    }

}
