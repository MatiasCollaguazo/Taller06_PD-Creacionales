package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class EnemigoBuilder extends EntidadBuilder {

    public EnemigoBuilder() {
        Enemigo e = new Enemigo();  // Inicializa la entidad como un Enemigo
    }

    @Override
    public void setName(String nombre) {
        e.setNombre(nombre);  // Establece el nombre del enemigo
    }

    @Override
    public void addAction(Accion accion) {
        e.addAccion(accion);  // Agrega una acción a la lista de acciones del enemigo
    }

    @Override
    public void setAttributes() {
        // Establece los atributos específicos del enemigo
        //((Enemigo) e).setTipo("Orco");  // Ejemplo de establecimiento del tipo
        //((Enemigo) e).setPoder(75.5f);  // Ejemplo de establecimiento del poder
    }
}
