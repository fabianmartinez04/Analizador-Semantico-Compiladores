/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author liset
 */
public class Estructura {
    String tipo;
    String nombre;
    int linea;
    String estructura;

    public Estructura(String tipo, String nombre, int linea,String estructura) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.linea = linea;
        this.estructura = estructura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
    
     public String imprimir(){
        String datos = "Tipo: " + this.tipo + "\n"+
                       "Nombre: " + this.nombre + "\n"+
                       "Linea: " + String.valueOf(this.linea)+ "\n" +
                       "Estructura: " + this.estructura + "\n";
        
        return datos;

    }
    
    
}
