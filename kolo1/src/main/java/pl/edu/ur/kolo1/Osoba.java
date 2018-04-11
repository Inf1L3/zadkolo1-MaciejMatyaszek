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
public class Osoba{
    
   public String imie;
   public String nazwisko;
   public int wiek;
   public int waga;
   public int wzrost;
   Scanner sc=new Scanner(System.in);
   
   public Osoba(String imie, String nazwisko, int wiek, int waga, int wzrost){
       this.imie=imie;
       this.nazwisko=nazwisko;
       this.waga=0;
       this.wiek=0;
       this.wzrost=0;
       
   }
  public Osoba(String imie, String nazwisko){
      this.imie=imie;
      this.nazwisko=nazwisko;
  } 
  public Osoba(int wiek, int waga, int wzrost){
      this.wiek=wiek;
      this.waga=waga;
      this.wzrost=wzrost;
  }
  public void wprowadzDane(){
      System.out.println("Imie: ");
      imie=sc.nextLine();
      System.out.println("Nazwisko: ");
      nazwisko=sc.nextLine();
      System.out.println("Wiek: ");
      wiek=sc.nextInt();
      System.out.println("Waga: ");
      waga=sc.nextInt();
      System.out.println("Wzrost: ");
      wzrost=sc.nextInt();
  }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", waga=" + waga + ", wzrost=" + wzrost + ", sc=" + sc + '}';
    }
  
  public void wyswietlDane(){
      System.out.println("Imie: " +imie);
      System.out.println("Nazwisko: " +nazwisko);
      System.out.println("Wiek: " +wiek);
      System.out.println("Waga: " +waga);
      System.out.println("Wzrost: " +wzrost);
      
  }
}
