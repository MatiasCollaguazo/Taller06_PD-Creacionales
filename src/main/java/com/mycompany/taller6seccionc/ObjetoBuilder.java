package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class ObjetoBuilder extends EntidadBuilder {

    public ObjetoBuilder() {
        e = new Objeto();  // Inicializa la entidad como un Objeto
    }

    @Override
    public void setName(String nombre) {
        e.setNombre(nombre);  // Establece el nombre del objeto
    }

    @Override
    public void setAttributes() {
        // Establece los atributos específicos del jugador
        ((Objeto) e).setNombre("Item_404");
        ((Objeto) e).setPeso(0);
        ((Objeto) e).setTipo("Comida");
    }

    @Override
    public void addAction(Accion accion) {
        //Ejemplo, ser recogible por el jugador
        e.addAction(accion);
    }
}