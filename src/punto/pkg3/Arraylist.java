/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto.pkg3;

import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Arraylist {
    
    private ArrayList<Nodo> Lista;
    private ArrayList<Nodo> Catedra;

    public Arraylist() {
        Lista = new ArrayList<Nodo>();
        Catedra = new ArrayList<Nodo>();
    }

    public void setLista(Nodo lista) {
        Lista.add(lista);
    }

    public ArrayList<Nodo> getLista() {
        return Lista;
    }
    
    public void porcentaje(){
        
        int c = 0;
        int p = 0;
        int o = 0;
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        for(Nodo x: Lista){     /*Foreach para recorrer la cantidad de docentes de cada tipo*/
            
            if(x.getTipo().split("(?=\\s)").equalsIgnoreCase(" catedra")){
                c++;
            }else if(x.getTipo().split("(?=\\s)").equalsIgnoreCase(" planta")){
                p++;
            }else if((x.getTipo().split("(?=\\s)").equalsIgnoreCase(" ocacional")){
                o++;
            }
 
        }
        
        p1 = (c*100)/Lista.size();
        p2 = (p*100)/Lista.size();
        p3 = (o*100)/Lista.size();
        
        System.out.println("PORCENTAJE DOCENTES \n"+
                            "Docentes Catedra: "+p1+
                            "Docentes Planta: "+p2+
                            "Docentes Ocacional: "+p3+"\n");
        
    }
    
    public ArrayList Listar_Catedra(){
        
        for(Nodo x:Lista){
            
            String X[] = x.getTipo().split("(?=\\s)");
            String Y[] = x.getFecha().split("[\\./]");
           
            if(X[1].equalsIgnoreCase(" catedra")&&Y[1].matches("^0[9]$")){
                
                Catedra.add(x);
            
            }
            
        }
        return Catedra;
    }
    
    public void Mostrar_Catedra(){
                
        for(Nodo recorrer:Catedra){
        
            System.out.println(recorrer.toString());
        }
    }

    public ArrayList<Nodo> getCatedra() {
        return Catedra;
    }
    
    public int ErrorCedulas(){
        int error = 0;
        
        for(Nodo x:Lista){
            
            if(!Validar_Cedula(x.getCedula())){
            
                error++;
            }
            
        }

        return error;
    }
    
    public boolean Validar_Cedula(String cedula){
        
        return cedula.matches("^1[0-9]{10}$");
    }
    
}
