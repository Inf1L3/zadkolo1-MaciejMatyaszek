/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Tablica {
    int[] tab={0,1,2,3,4,5,6,7,8,9};
    int i;
    int srednia;
    
    Scanner sc=new Scanner(System.in);
    
    public Tablica (){
        
        this.srednia=srednia;
    }
    
    public void wprowadz(int a, int b){
        tab[a]=b;
     
}
    public void wyswietl(){
    for (int i=0; i<10; i++){
        System.out.println(tab[i]);
    }}
    
    public void średnia(){
      
      for(int j=0; j<10; j++){
       srednia+=tab[j];}
       srednia=srednia/10;
        System.out.println(+srednia);
        
     
     }
    }
    
    

