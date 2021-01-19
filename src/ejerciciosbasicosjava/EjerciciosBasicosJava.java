/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Gaming JS
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana){
            return true;
        }
        //si llega aquí es que no es fin de semana
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        
        return false;
    }
    
    /**
     * multa: Si    la    velocidad    es    de    60    o    menos,    el    resultado    es    0    Si    la    velocidad    es    de    entre    61    y    80    inclusive,    el    resultado    es    1    Si    la    velocidad    es    81    o    más,    el    resultado    es    2  
     * 
     */
    public int multa(int velocidad, boolean birthday){
        //si es tu cumpleaños, le resta 5 a la velocidad
        if (birthday){
            velocidad = velocidad - 5; //velocidad -= 5;
        }
        // si va a menos de 60 por hora
        if (velocidad<= 60){
            return 0; //no hay multa
        }
        //si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80){
            return 1; //multa pequeña
        }
        //en cualquier otro valor que tuviera la velocidad devolvemos la multa grande
        return 2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        System.out.println("Ejercicio 01 ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio 02 multa");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
    }
    
}




