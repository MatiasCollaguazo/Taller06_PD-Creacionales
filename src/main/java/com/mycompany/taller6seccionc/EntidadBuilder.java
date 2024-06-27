package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public abstract class EntidadBuilder {
    protected Entidad e;

    public Entidad getEntidad() {
        return e;
    }

    public abstract void setName(String nombre);
    public abstract void addAction(Accion accion);
    public abstract void setAttributes();

}
