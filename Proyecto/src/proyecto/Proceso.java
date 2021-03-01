/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Douglas
 */
public class Proceso {
    private int Identificador;
    private int Tamaño;
    private int cantInstrucciones;
    private int registroBase;
    private int registroLimite;
    private Proceso siguiente;

    public Proceso(int Identificador, int Tamaño, int cantInstrucciones, int registroBase, int registroLimite, Proceso siguiente) {
        this.Identificador = Identificador;
        this.Tamaño = Tamaño;
        this.cantInstrucciones = cantInstrucciones;
        this.registroBase = registroBase;
        this.registroLimite = registroLimite;
        this.siguiente = siguiente;
    }
    
    public Proceso(){
        this.Identificador = 0;
        this.Tamaño = 0;
        this.cantInstrucciones = 0;
        this.registroBase = 0;
        this.registroLimite = 0;
        this.siguiente = null;
    }
    
    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    public void setCantInstrucciones(int cantInstrucciones) {
        this.cantInstrucciones = cantInstrucciones;
    }

    public int getRegistroBase() {
        return registroBase;
    }

    public void setRegistroBase(int registroBase) {
        this.registroBase = registroBase;
    }

    public int getRegistroLimite() {
        return registroLimite;
    }

    public void setRegistroLimite(int registroLimite) {
        this.registroLimite = registroLimite;
    }

    public Proceso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Proceso siguiente) {
        this.siguiente = siguiente;
    }
}
