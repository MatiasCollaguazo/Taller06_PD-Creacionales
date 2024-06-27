package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class JugadorBuilder extends EntidadBuilder {
    public void definirEntidad(){
        Jugador e = new Jugador();
    }

    public void setNombre(String nombre) {
        e.setNombre(nombre);
    }

    @Override
    public void addAction(Accion accion) {
        e.addAccion(accion);
    }

    @Override
    public void setAttributes() {
        // Establece los atributos específicos del jugador
       // ((Jugador) e).setVida(100);  // Ejemplo de establecimiento de la vida
       // ((Jugador) e).setFuerza(50);  // Ejemplo de establecimiento de la fuerza
    }

    @Override
    public void setName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
