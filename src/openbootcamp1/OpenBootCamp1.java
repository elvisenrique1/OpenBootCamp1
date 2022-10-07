/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp1;

/**
 *
 * @author Elvis Enrique
 */
public class OpenBootCamp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    // Ejercicio Estructuras de Control 
                    
        // Utilizando el condicional if
        System.out.println("Mostrando resultados utilizando el condiconal if");
        int numeroIf = 10;
        if(numeroIf > 0){
            System.out.println("El número " + (numeroIf) + " ingresado es: POSITIVO");
        }else if(numeroIf < 0){
            System.out.println("El número " + (numeroIf) + " ingresado es: NEGATIVO");
        }else{
            System.out.println((numeroIf) + " Es el número: CERO(0)");
        }
        
        // Utilizando el bucle while
        System.out.println("Mostrando resultados utilizando el bucle do");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;            
        }
        
        // Utilizando el bucle do while
        System.out.println("Mostrando resultados utilizando el bulce do-while");
        int nroWhile = 0;
        do {
            System.out.println(nroWhile);
            nroWhile = nroWhile + 1;
        } while (nroWhile < 3);
        
        // Utilizando el bucle for        
        System.out.println("Mostrando resultados utilizando el bucle for");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        
        // Utilizando el interruptor Switch-Case
        System.out.println("Mostrando resultados utilizando el interruptor switch-case");
        String estacion = "mayo";
        switch(estacion){
            case "VERANO":
            System.out.println("Estamos en VERANO");
            break;
            
            case "PRIMAVERA":
            System.out.println("Estamos en PRIMAVERA");
            break;
            
            case "OTOÑO":
            System.out.println("Estamos en OTOÑO");
            break;
            
            case "INVIERNO":
            System.out.println("Estamos en INVIERNO");
            break;
            default:
                System.out.println("NO es una Estación del Año");
                break;
        }
        
    }    
}
