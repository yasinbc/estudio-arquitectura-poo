import java.util.Scanner;
import javax.swing.*;
/**
 * Write a description of class Administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrador
{
    // instance variables - replace the example below with your own
    private int x;
    public String usuarios;

    /**
     * Constructor for objects of class Administrador
     */
    public Administrador()
    {
        // initialise instance variables
        x = 0;
        usuarios = ""; //esto tiene que ser una matriz o array
    }
    
    public void visualisacionUsuariosRegistrados(){
        String usuariosReg = usuarios;
        System.out.println(usuariosReg);
    }
    
    public void gestionUsuarios(){

        usuarios = ""; //aqui va a una matriz o arraylist
        String opcion = JOptionPane.showInputDialog("Elija opción de gestion de Usuarios: \n1-Altas \n2-Bajas \n3-Modificaciones");
        
        int opcionGestion = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        
        //flujo de datos de para la gestion de usuarios
        if(opcionGestion == 1){
            System.out.println("Ha elegido altas.");
            opcion = JOptionPane.showInputDialog("Introduzca nombre de usuario a registar: ");
            String opcionUsuario = opcion;
            
            usuarios = opcionUsuario;
                
            System.out.println(usuarios+" dado de alta en el sistema");
            
        }else if(opcionGestion == 2){
            System.out.println("Ha elegido bajas.");
            opcion = JOptionPane.showInputDialog("Introduzca usuario a dar de baja: ");
            String opcionUsuario = opcion;
            
            usuarios = opcionUsuario;
                
            System.out.println(usuarios+" dado de baja en el sistema");
        }else if(opcionGestion == 3){
            System.out.println("Ha elegido modificaciones.");
            opcion = JOptionPane.showInputDialog("Introduzca usuario a modificar: ");
            String opcionUsuario = opcion;
            
            usuarios = opcionUsuario;
                
            System.out.println(usuarios + " quiere modificar parametros en el sistema");
        }else{
            System.out.println("Opcion no valida.");
        }
        
    
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
