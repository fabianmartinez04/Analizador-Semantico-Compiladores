/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author liset
 */
public class Funcion extends Estructura{
    ArrayList<Parametro> parametros;
    int cantidadParametros;
    //ArrayList<Variable> variables;
    
    public Funcion(String tipo, String nombre, ArrayList<Parametro> parametros, int linea) {
        super(tipo,nombre,linea,"funcion");
        this.parametros = parametros;
        this.cantidadParametros = this.parametros.size();
        //this.variables = variables;
     
    }

    public Funcion(String tipo, String nombre, int linea) {
       super(tipo,nombre,linea,"funcion");
    }

   

    public ArrayList<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Parametro> parametros) {
        this.parametros = parametros;
        this.cantidadParametros = this.parametros.size();
    }

    public int getCantidadParametros() {
        return cantidadParametros;
    }

    public String imprimir(){
        String datos= super.imprimir()+ "\n"+
                "Parametros\n\n";
        
        for(int i=0;i<this.cantidadParametros;i++){
            datos+= this.parametros.get(i).imprimir() + "\n";
        
        }
        return datos;
    }
  
    
    
}
