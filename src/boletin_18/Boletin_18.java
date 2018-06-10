/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Boletin_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Buzon buzon = new Buzon();
    ArrayList<Correo> correos = new ArrayList<>();
    buzon.setCorreos(correos);
    boolean exit = false;
    do {
        String opcion = JOptionPane.showInputDialog("Opciones:"+ "Mostrar numero de correos(1), "+ "Añadir un nuevo correo(2), "+ "Mostrar si hay mensajes sin leer(3), "+ "Mostrar primer correo sin leer(4), "+ "Mostrar un correo(5), "+ "Eliminar un correo(6), "+ " Salir(7)");
    switch(opcion){
        case "1":
            JOptionPane.showMessageDialog(null, correos.size()+" mensajes se encuentran en el buzon");             
            break;
        case "2":
            Correo correo = new Correo(JOptionPane.showInputDialog("Escribe el mensaje del nuevo correo"));
            buzon.engade(correo);
            break;
        case "3":
            if (buzon.porLeer() == false){
                System.out.println("Hay mensajes sin leer.");
            } else {
                System.out.println("Todos los mensajes han sido leidos.");
            }
            break;
        case "4":
            System.out.println("Mensaje : " + buzon.amosaPrimerNoLeido());
            break;
        case "5":
            System.out.println(buzon.amosa(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de el mensaje que quieres leer."))));
            break;
        case "6":   
            buzon.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de el mensaje que quieras eliminar.")));
            break;
        case "7":
            exit = true;
            break;
    }
    } while(exit == false);
}
    }
    

