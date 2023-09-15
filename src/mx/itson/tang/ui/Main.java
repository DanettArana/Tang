/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Determina a que ciudad pertenece cada número ingresado según el código de área y luego muestra el recuento de números telefónicos para cada ciudad y los números con lada desconocida.
 * @author Danett Arana
 */
public class Main {
    
    public static void main(String[] args) {
   
       System.out.println("Ingrese los numeros telefonicos:");
        
        Scanner entrada = new Scanner(System.in);
          String numeros = entrada.nextLine();
    
        int areaTijuana = 0;
        int areaHermosillo = 0;
        int areaGuaymas = 0;
        int areaDesconocida = 0;

       
            String[] numeroTelefonico = numeros.split(",");
            
        for (String num : numeroTelefonico) {
                
       num = num.replace("(", "");
       num = num.replace(")", "");
       num = num.replace("-", "");
       num = num.replace(" ", "");
        
    
        if(num.startsWith("622")){
        areaGuaymas++;        }
        else if (num.startsWith("662")){ 
        
        areaHermosillo++;
        }
        else if(num.startsWith("664")){
        areaTijuana++;
        } 
        else{  
        areaDesconocida++;
        }  
         
            
       String numGuaymas = ("Hay "+ areaTijuana+" numeros de Tijuana");
       String numHermosillo = ("Hay " + areaHermosillo+" numeros de Hermosillo");
       String numTijuana =("Hay " + areaGuaymas+ " numeros de Guaymas");
       String numDesconocido =("Hay " + areaDesconocida+" numeros de lada desconocida"); 
           
       
            System.out.println(numTijuana);
            System.out.println(numHermosillo);
            System.out.println(numGuaymas);
            System.out.println(numDesconocido);
         
                    
            }}}
       
        /* 
        String nuevaOracion = oracion.replace("n", "x");
        
        System.out.println(nuevaOracion);
        //////

        boolean resultado = oracion.startsWith("a");
    
        if(resultado){
        System.out.println("Sí incia con a");
        }else{ 
        System.out.println("No inicia con a");
        
        //////
        }
        if(oracion.startsWith("a")){
             System.out.println("Sí incia con a");
        }else{ 
        System.out.println("No inicia con a");
        }
       
        //////
        System.out.println(oracion.startsWith("a") ? "Sí incia con a" : "No inicia con a");
        */    