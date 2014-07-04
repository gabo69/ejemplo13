/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo13;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int num=0; int menor=0; int posicion =0; 
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en n")); 
        int[] arreglo1=new int[num]; 
        int[] arregloaux=new int[num];
        for (int i = 0; i < num; i++) 
        { 
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores al vector"));
        } 
        for (int i = 0; i < num; i++) 
        { 
            if (arreglo1[i] < 0) 
            { 
                arregloaux[posicion]= arreglo1[i]; posicion++; 
            } 
        } 
        for (int i = 0; i < num; i++) 
        { 
            if (arreglo1[i] >= 0) 
            {
                arregloaux[posicion]= arreglo1[i]; posicion++; 
            }
        } 
        for (int i :arregloaux) 
        { 
            System.out.printf("%d ",i);
        }
    }
    
}
