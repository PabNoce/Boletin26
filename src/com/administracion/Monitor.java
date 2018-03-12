/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administracion;

/**
 *
 * @author pnocedalopez
 */
public class Monitor extends Persona {

    private String status = "Monitor";
    private Grupo grupo;
    private float sueldo = 850;

    public Monitor(int ID, String nome, String apellido) {
        super(ID, nome, apellido);
        this.grupo = new Grupo();
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", status=" + status + ", grupo=" + grupo + ", sueldo=" + sueldo;
    }

}