package com.mycompany.taller6seccionc;

/**
 *
 * @author Grupo#2
 */
public class Accion {
    private String sprite; // La ruta del .jpg/.png asociado a la acción concreta

    public Accion(String sprite) {
        this.sprite = sprite;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}

