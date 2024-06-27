package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class JugadorBuilder extends EntidadBuilder {

    public JugadorBuilder() {
        e = new Jugador();
    }

    @Override
    public void setName(String nombre) {
        e.setNombre(nombre);
    }

    @Override
    public void setAttributes() {
        // Establece los atributos específicos del jugador
        ((Jugador) e).setNombre("Player");  // Ejemplo de establecimiento del nombre
        ((Jugador) e).setVida(100);  // Ejemplo de establecimiento de la vida
        ((Jugador) e).setFuerza(50);  // Ejemplo de establecimiento de la fuerza
    }
    
    @Override
    public void addAction(Accion accion) {
        // Ejempl, ser vulnerable al daño
        e.addAction(accion);
    }
}
