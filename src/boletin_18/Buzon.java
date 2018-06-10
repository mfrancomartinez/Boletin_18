/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Buzon {
    private ArrayList<Correo> correos = new ArrayList<>();
    public ArrayList<Correo> getCorreos() {
        return correos;
    }
    public void setCorreos(ArrayList<Correo> correos) {
        this.correos = correos;
    }
    public int numCorreos(){   
        return correos.size();
    }
    public void engade(Correo a){
        correos.add(a);
    }
    public boolean porLeer(){
        boolean leidos = true;
        for(Correo objeto: correos){
            if(objeto.isLeido() == false){
                leidos = false; break;
            }
        }
        return leidos;
    }
     public String amosaPrimerNoLeido(){ 
        String mensaje = "Correos leídos.";
        for(Correo correo: correos){
            if(correo.isLeido() == false){
                correo.setLeido(true);
                mensaje = correo.getMensaje();
                break;
            }
        }
        return mensaje;
    }
    public String amosa(int pos){
        String mensaje = "No existe el correo";
        if(pos > correos.size()){           
        } else {
            correos.get(pos-1).setLeido(true);
            mensaje = correos.get(pos-1).getMensaje();
        }  
        return mensaje;
    }
    public void eliminar(int pos){  
        if(pos > correos.size()){      
            System.out.println("No hay mensajes que eliminar");
        } else {
            correos.remove(pos-1);
        }
    }
    
    
    
    
}
