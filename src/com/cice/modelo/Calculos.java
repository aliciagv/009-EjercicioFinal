/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.modelo;

/**
 *
 * @author Alicia
 */
public class Calculos {

    public static String sumar(double numA, double numB) {
        String resultado="";
        double operacion=numA + numB;
        resultado=String.valueOf(operacion);
        return resultado;
    }
    
     public static String restar(double numA, double numB) {
        String resultado="";
        double operacion=numA - numB;
        resultado=String.valueOf(operacion);
        return resultado;
    }
     
      public static String multiplicar(double numA, double numB) {
        String resultado="";
        double operacion=numA * numB;
        resultado=String.valueOf(operacion);
        return resultado;
    }
       public static String dividir(double numA, double numB) {
        String resultado="";
        double operacion=numA / numB;
        resultado=String.valueOf(operacion);
        return resultado;
    }

}
