/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

/**
 *
 * @author student
 */
public class Rekurencja {
    
    
 
    public int sumaRekurencja(int n) {
        if(n>0) {
            return n + sumaRekurencja(n-1);
        } else {
            return 0;
        }
    }
 
    
    
}
