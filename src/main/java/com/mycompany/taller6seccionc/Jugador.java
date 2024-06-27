package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class Jugador extends Entidad{
    
    private float vida;
    private float fuerza;

    public Jugador() {
        
    }

    public float getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public float getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
