/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

public class LeerDatos {
    private Scanner leer=new Scanner(System.in); //Si queremos dar el valor de la variable numero usamos Scanner, el "sc" puede cambiar
    public int ingresarEntero(){ //Hacemos nuestro metodo IngresarEntero()
        int entero;
        //creamos la variable numero
        entero= leer.nextInt();   //esto se le agrega debido a que lo estamos utilizando para crearlo desde teclado
                                // es "nextInt()" porque el valor es un entero, si fuera float sería nextFloat() y así sucesivamente
        return entero;          //retornamos ese numero
    }
    public double ingresarDouble(){
        double entero;
        entero= leer.nextDouble();
        return entero;
    }
     public String ingresarCadena(){
        String entero;
        entero= leer.nextLine();
        return entero;
    }
    public float ingresarFlotante(){
        float entero;
        entero=leer.nextFloat();
        return entero;
    }
     public char ingresarCaracter(){
        char entero;
        entero=leer.next().charAt(0);
        return entero;
    }
}
