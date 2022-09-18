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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo a = new Nodo();
        Nodo b = new Nodo();
        Nodo c = new Nodo();
        Nodo d = new Nodo();
        Arraylist lista = new Arraylist();
        
        a.setTipo("Docente catedra");
        b.setTipo("Docente Ocacional");
        c.setTipo("Docente Catedra");
        d.setTipo("Docente Catedra");
        
        a.setFecha("01/09/2013"); //catedra en septiembre
        b.setFecha("03/09/2021");
        c.setFecha("30/05/2019");
        d.setFecha("01/09/2012"); //catedra en septiembre
        
        a.setCedula("1234567890"); //error cedula
        b.setCedula("10000000000");
        c.setCedula("11111111111");
        d.setCedula("123241242414");//error cedula
        
        lista.setLista(a);
        lista.setLista(b);
        lista.setLista(c);
        lista.setLista(d);
        
        lista.porcentaje();
        lista.Listar_Catedra();//Dividir en profes de catedra en septiembre
        lista.Mostrar_Catedra();
        System.out.println("Error Nro de Cedulas que no tiene 11 digitos: "+lista.ErrorCedulas());
        
        
    }
    
}
