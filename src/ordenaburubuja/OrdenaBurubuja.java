/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaburubuja;

import java.util.Scanner;

/**
 *
 * @author Angie Castañeda
 */
public class OrdenaBurubuja {
    
    private int vector[], aux;
    private int longVector;
    private Scanner teclado = new Scanner(System.in);  
    
    public OrdenaBurubuja() {
        iniciaVector();
        llenaDatos();
        ordenaDatos();
        muestraDatos();
    }
    
    public void iniciaVector() {
     System.out.println("Ingrese longitud del vector: ");
     longVector = teclado.nextInt();
     vector = new int[longVector];
    }
    
    public void llenaDatos (){
        for (int i = 0; i < longVector; i++){
            System.out.println("Ingrese el dato numero " + (i+1));
            vector[i] = teclado.nextInt();
        }
    }
    
    public void ordenaDatos (){
        for (int i = 0; i < longVector; i++){
            for (int j = i; j < longVector; j++){
                if (vector [i]> vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
    
    public void muestraDatos (){
        for (int i = 0; i < longVector; i++){
            System.out.println("Datos ordenados por el metodo de burbuja:\n " + vector[i]);
            //vector[i] = teclado.nextInt();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         OrdenaBurubuja ordenaBurbuja = new OrdenaBurubuja();
    }
    
}
