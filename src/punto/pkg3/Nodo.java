/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto.pkg3;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Nodo {

    private String tipo;
    private String cedula;
    private String fecha;
    
    public Nodo() {
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if(fecha.matches("^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$")){
           this.fecha = fecha;
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
            this.cedula = cedula;
    }


    
    @Override
    public String toString() {
        return "Docente{" + "tipo=" + tipo + ", cedula=" + cedula + ", fecha=" + fecha + '}';
    }
    

}
