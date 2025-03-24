/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author USUARIO
 */
public class OperacionesMatDouble implements Operable<Double>{

    @Override
    public Double suma(Double operando1, Double operando2) {
        return operando1 + operando2;
    }

    @Override
    public Double resta(Double operando1, Double operando2) {
        return operando1 - operando2;
    }

    @Override
    public Double producto(Double operando1, Double operando2) {
        return operando1 * operando2;
    }

    @Override
    public Double division(Double operando1, Double operando2) {
        return operando1/operando2;
    }
    
    @Override
    public Double potencia(Double operando1, Double operando2) {
        return Math.pow(operando1,operando2);
    }
    
    @Override
    public Double raizCuadrada(Double operando1) {
        return Math.sqrt(operando1);
    }
    
    @Override
    public Double raizCubica(Double operando1){
        return Math.cbrt(operando1);
    }
    
}
