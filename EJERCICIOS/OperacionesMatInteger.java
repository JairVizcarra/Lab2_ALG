/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author USUARIO
 */
public class OperacionesMatInteger implements Operable<Integer> {

    @Override
    public Integer suma(Integer operando1, Integer operando2) {
        return operando1 + operando2;
    }

    @Override
    public Integer resta(Integer operando1, Integer operando2) {
        return operando1 - operando2;
    }

    @Override
    public Integer producto(Integer operando1, Integer operando2) {
        return operando1 * operando2;
    }

    @Override
    public Integer division(Integer operando1, Integer operando2) {
        return operando1 / operando2;
    }
    
    @Override
    public Integer potencia(Integer operando1, Integer operando2) {
        return (int)Math.pow(operando1,operando2);
    }
    
    @Override
    public Integer raizCuadrada(Integer operando1) {
        return (int)Math.sqrt(operando1);
    }
    
    @Override
    public Integer raizCubica(Integer operando1){
        return (int)Math.cbrt(operando1);
    }
    
}
