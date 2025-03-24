
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Bolsa<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;
    
    public Bolsa(){
        super();
    }
    
    public Bolsa(int tope){
        super();
        this.tope = tope;
    }
    public void add(T objeto){
        if(lista.size() >= tope){
            lista.add(objeto);
        }else{
            throw new RuntimeException("No caben mas");
        }
    }
    public Iterator <T> iterator(){
        return lista.iterator();
    }
}
