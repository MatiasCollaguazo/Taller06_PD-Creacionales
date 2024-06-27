package com.mycompany.taller6seccionc;

/**
 *
 * @author CltControl
 */
public class EntidadDirector {
    private EntidadBuilder builder;

    public EntidadDirector(EntidadBuilder builder) {
        this.builder = builder;
    }
    
    public void construirEntidad(){
        
    }
    
    public Entidad getEntidad(){
        return builder.getEntidad();
    }
}
