package pl.edu.ur.kolo1;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //zad1
        
        for(int i=0; i<11; i++){
            if(i==1 || i== 3 || i==6 || i==8){
                continue;
            }
            else
                System.out.println(i);
        }
        
        
        //zad2
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("Podaj numer elementu ");
        a=input.nextInt();
        Rekurencja r = new Rekurencja();
        int  rekurencja = 0;
 
        
        rekurencja = r.sumaRekurencja(a);
 
        
        System.out.println("Rekurencja: "+rekurencja);
    
    
   //zad4
    
    Osoba os = new Osoba("Adam", "Kowalski", 23, 190, 100);
    os.wprowadzDane();
    os.wyswietlDane();
    
    //zad5
    
    Tablica io=new Tablica();
    System.out.println("Zawartosc tablicy: ");
    io.wyswietl();
    System.out.println("Wprowadzanie elementu tablicy ");
    io.wprowadz(1, 34);
    io.wyswietl();
    
    System.out.println("Srednia: ");
    io.średnia();
}}
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
    
    
    
    

