/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String []args){
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>();
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("Sublime");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        
        for(Chocolatina chocolatina : bolsaCho){
            System.out.println(chocolatina.getMarca());
        } 
    }
    
}
